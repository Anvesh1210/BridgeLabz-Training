package com.sorting.gamerzone;

import java.util.ArrayList;

//class to manager game zone
public class GamerZoneManager {
    private ArrayList<Player> players = new ArrayList<>();

    //method to add player
    public void addPlayer(Player player) {
        players.add(player);
    }

    //method to starting quick sort
    public void quickSort() {
        sort(0, players.size() - 1);
    }

    //method for sort
    private void sort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            sort(low, pivotIndex - 1);
            sort(pivotIndex + 1, high);
        }
    }

    //method for partitioning based on score
    private int partition(int low, int high) {
        int pivot = players.get(high).getScore();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (players.get(j).getScore() > pivot) {
                i++;
                Player temp = players.get(i);
                players.set(i, players.get(j));
                players.set(j, temp);
            }
        }
        Player temp = players.get(i + 1);
        players.set(i + 1, players.get(high));
        players.set(high, temp);

        return i + 1;
    }

    //method for displaying leaderboard
    public void displayLeaderboard() {
        for (Player p : players) {
            p.display();
        }
    }
}
