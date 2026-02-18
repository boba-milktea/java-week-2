package projects;

/**
 * 7. 🔢 Prime Number Checker
 * Concepts used: Methods, loops, conditionals.
 *
 * Write a method isPrime(int n) that checks if a number is prime.
 * Ask the user to enter a number.
 * Use the method to check if it is prime or not.
 * Bonus: Print all prime numbers from 1–100 using the method.
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("All the prime numbers.");
        int endNumber = 100;
        for (int i = 1; i < endNumber; i++)
            System.out.print(isPrime(i) ? (i + " ") : "");

        System.out.println();
        PrimeNumber p = new PrimeNumber();
        Scanner scanner = new Scanner(System.in);
        int intputNum = PrimeNumber.readInt(scanner, "Enter a number to see if it's a prime number: ");
        System.out.println("Your input number " + intputNum + " is " + (PrimeNumber.isPrime(intputNum) ? "a prime" : "not a prime"));

    }


    private static int readInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a whole valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
