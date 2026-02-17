package projects;

import java.util.Arrays;
import java.util.Random;

/**
 * 3. 🏀 2D Array Scoreboard
 * Concepts used: Multidimensional arrays, nested loops.
 *
 * Create a 2D array representing scores of 3 players across 5 games.
 * Fill the array with random numbers (e.g., 0–100).
 * Print the scores in a table format.
 * Calculate and display the total score of each player.
 */


public class ArrayScoreboard {
    public static void main(String[] args) {
        int players = 3;
        int games = 5;
        int [][] scores = fillNumbers(players, games);
        display(scores);
        showTotalScore(scores);

    }

    // ===================== methods ============================


// I fill the array with random numbers
    private static int[][] fillNumbers (int p, int g) {
        Random random = new Random();
        int[][] matrix = new int[p][g];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < g; j++) {
              matrix[i][j] = random.nextInt(101);
            }
        }
        return matrix;
    }

// I display the matrix
    private static void display (int[][] matrix ) {
        for (int row = 0; row < matrix.length; row ++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " | ");
            }
            System.out.println();
        }
    }


    // I show you the total scores
    private static void showTotalScore (int[][] matrix) {
        for (int row = 0; row < matrix.length; row ++) {
            int totalScore = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                totalScore += matrix[row][col];
            }
            System.out.println("Player " + (row + 1) + "'s total score is: " + totalScore);
        }
    }

}
