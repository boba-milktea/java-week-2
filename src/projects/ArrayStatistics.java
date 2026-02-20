package projects;

/**
 * 2. 📊 Array Statistics
 * Concepts used: Arrays, loops, methods.
 *
 * Ask the user to enter n numbers and store them in an array.
 *
 * Write methods to calculate:
 *
 * Maximum value
 * Minimum value
 * Average
 * Sum
 * Print all results.
 */

import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers you'd like to enter? : ");
        int arrLength = readPositiveInt(scanner);

        int[] array = askForNums(scanner, arrLength, ("There are total " + arrLength + " numbers. Please enter a number: "));
        System.out.println("Max Value: " + maxValue(array));
        System.out.println("Min Value: " + minValue(array));
        System.out.println("Average: " + average(array));
        System.out.println("Sum: " + sum(array));

        scanner.close();
        }

    // --------------------- methods --------------------------


// I ask for numbers
    private static int[] askForNums (Scanner scanner, int length, String prompt) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid whole number: ");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }
        return arr;
    }



    private static int readPositiveInt (Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid whole number for the array length: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        // !!!!! this is a genius way !!!!
        return value > 0 ? value : readPositiveInt(scanner);
    }

    private static int maxValue (int[] array) {
        int maxValue = array[0];

        for (int num : array) {
            validArray(array);
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    private static int minValue (int[] array) {
        validArray(array);
        int minValue = array[0];

        for (int num : array) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    private static double average (int[] array) {
        validArray(array);
        int sum = sum(array);
        return (double) sum / array.length;
    }

    private static int sum (int[] array) {
        validArray(array);
        int sum = 0;
        for (int i = 0; i < array.length; i ++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * I didn't add the check.
     * It's important to check if the array length is greater than 0 too.
     */

    private static void validArray (int[] array) {
        if ( array == null || array.length == 0){
            throw new IllegalArgumentException("Array must not be empty.");
        }
    }
}
