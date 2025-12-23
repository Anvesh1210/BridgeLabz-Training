// program for Rock Paper Scissors game with computer
import java.util.Scanner;
public class RockPaperScissors{

    // Method to get computer choice using Math.random()
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0)
            return "rock";
        else if (choice == 1)
            return "paper";
        else
            return "scissors";
    }

    // Method to find winner of a single game
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate average and percentage
    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = ((double) userWins / totalGames) * 100;
        double compPercent = ((double) compWins / totalGames) * 100;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", compPercent);

        return stats;
    }

    // Method to display game results and statistics
    public static void displayResults(String[][] games, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("----------------------------------------");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" +
                    games[i][0] + "\t" +
                    games[i][1] + "\t\t" +
                    games[i][2]);
        }

        System.out.println("\nStatistics:");
        System.out.println("Player\tWins\tWinning %");
        System.out.println("-----------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2]);
        }
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

		//taking no of games form the user
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

		//creating array to store game results
        String[][] gameResults = new String[games][3];

        int userWins = 0;
        int compWins = 0;
		
		//printing the results
        for (int i = 0; i < games; i++) {
			
            System.out.print("\nGame " + (i + 1) + " - Enter choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = compChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayResults(gameResults, stats);
		
		//Closing the Scanner
        sc.close();
    }
}
