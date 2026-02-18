package projects;
import java.util.Random;
import java.util.Scanner;

/**
 * 6. 🎲 Dice Roller with Methods
 * Concepts used: Methods, random numbers, loops.
 *
 * Write a method rollDice() that returns a random number between 1–6.
 * Ask the user how many times they want to roll the dice.
 * Call rollDice() that many times and print the results.
 */

public class DiceRoller {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int rollTimes = readRollTimes(scanner, "How many times do you want to roll the dice? ");

       for (int i = 0; i < rollTimes; i++) {
           System.out.println("Time " + (i + 1) + " : " + rollDice());
       }
       scanner.close();

    }
    private static final Random random = new Random();

    private static int rollDice() {
        return random.nextInt(1, 7);
    }

    /* I didn't handle the edge cases (negative numbers)
    private static int readRollTimes(Scanner scanner, String prompt) {
        System.out.print(prompt);

        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid whole number: ");
            scanner.next();
        }

        return scanner.nextInt();
    }
     */
    private static int readRollTimes(Scanner scanner, String prompt) {
        int value = 0;
        System.out.print(prompt);
        do {
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid whole number: ");
                scanner.next();
            }
            value = scanner.nextInt();
        } while(value <= 0);


        return value;
    }

}
