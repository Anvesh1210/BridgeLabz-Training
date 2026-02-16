package com.transactionmanagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankDAO {

    // Transfer Money (Transaction)
    public boolean transferMoney(int fromAcc, int toAcc, double amount) {

        String deductSQL = "UPDATE account SET balance = balance - ? WHERE account_id = ?";
        String addSQL = "UPDATE account SET balance = balance + ? WHERE account_id = ?";
        String insertTxn = "INSERT INTO transaction_history (from_account, to_account, amount) VALUES (?, ?, ?)";

        Connection conn = null;

        try {
            conn = ConnectionProvider.getConnection();
            conn.setAutoCommit(false); // START TRANSACTION

            // Check balance first
            if (getBalanceInternal(conn, fromAcc) < amount) {
                System.out.println("Insufficient Balance!");
                conn.rollback();
                return false;
            }

            // Deduct
            try (PreparedStatement ps1 = conn.prepareStatement(deductSQL)) {
                ps1.setDouble(1, amount);
                ps1.setInt(2, fromAcc);
                ps1.executeUpdate();
            }

            // Add
            try (PreparedStatement ps2 = conn.prepareStatement(addSQL)) {
                ps2.setDouble(1, amount);
                ps2.setInt(2, toAcc);
                ps2.executeUpdate();
            }

            // Insert Transaction Record
            try (PreparedStatement ps3 = conn.prepareStatement(insertTxn)) {
                ps3.setInt(1, fromAcc);
                ps3.setInt(2, toAcc);
                ps3.setDouble(3, amount);
                ps3.executeUpdate();
            }

            conn.commit(); // SUCCESS
            return true;

        } catch (Exception e) {
            try {
                if (conn != null) conn.rollback(); // FAILURE
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return false;
        } finally {
            try {
                if (conn != null) {
                    conn.setAutoCommit(true);
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Check Balance
    public double getBalance(int accountId) {

        String sql = "SELECT balance FROM account WHERE account_id = ?";

        try (Connection conn = ConnectionProvider.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, accountId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getDouble("balance");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return -1;
    }

    // Internal balance check (used inside transaction)
    private double getBalanceInternal(Connection conn, int accountId) throws SQLException {

        String sql = "SELECT balance FROM account WHERE account_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, accountId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getDouble("balance");
            }
        }
        return 0;
    }

    // Transaction History
    public List<Transaction> getTransactionHistory(int accountId) {

        String sql = "SELECT * FROM transaction_history WHERE from_account = ? OR to_account = ?";
        List<Transaction> list = new ArrayList<>();

        try (Connection conn = ConnectionProvider.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, accountId);
            ps.setInt(2, accountId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Transaction(
                        rs.getInt("txn_id"),
                        rs.getInt("from_account"),
                        rs.getInt("to_account"),
                        rs.getDouble("amount"),
                        rs.getTimestamp("txn_date")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
