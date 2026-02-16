package com.employeemanagementsystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	// Add Employee
	public boolean addEmployee(Employee emp) {
		String sql = "INSERT INTO employee (emp_id, name, department, salary) VALUES (?, ?, ?, ?)";

		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setInt(1, emp.getEmpId());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getDepartment());
			pstmt.setDouble(4, emp.getSalary());

			int rows = pstmt.executeUpdate();
			return rows > 0;

		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}

	// View All Employees
	public List<Employee> getAllEmployees() {
		String sql = "SELECT * FROM employee";
		List<Employee> list = new ArrayList<>();

		try (Connection conn = ConnectionProvider.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				Employee emp = new Employee(rs.getInt("emp_id"), rs.getString("name"), rs.getString("department"),
						rs.getDouble("salary"));
				list.add(emp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	// Update Salary (by emp_id)
	public boolean updateSalary(int empId, double newSalary) {
		String sql = "UPDATE employee SET salary = ? WHERE emp_id = ?";

		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setDouble(1, newSalary);
			pstmt.setInt(2, empId);

			int rows = pstmt.executeUpdate();
			return rows > 0;

		} catch (SQLException e) {
			return false;
		}
	}

	// Delete Employee
	public boolean deleteEmployee(int empId) {
		String sql = "DELETE FROM employee WHERE emp_id = ?";

		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setInt(1, empId);
			int rows = pstmt.executeUpdate();
			return rows > 0;

		} catch (SQLException e) {
			return false;
		}
	}

	// Search by Name
	public List<Employee> searchByName(String name) {
		String sql = "SELECT * FROM employee WHERE name LIKE ?";
		List<Employee> list = new ArrayList<>();

		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, "%" + name + "%");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new Employee(rs.getInt("emp_id"), rs.getString("name"), rs.getString("department"),
						rs.getDouble("salary")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
}
