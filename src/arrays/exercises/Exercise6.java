package arrays.exercises;

import java.util.Scanner;

/**
 * Exercise 6: Binary Search
 * TODO:
 * 1. Create and sort an array.
 * 2. Ask user for a number.
 * 3. Call binary search.
 * 4. Print result.
 */

import java.util.Arrays;
public class Exercise6
{
    public static void main(String[] args)
    {
        int[] arr = {-100, 78, 7, 0, 7, 3};
        Scanner scanner = new Scanner(System.in);
        Arrays.sort(arr);

        System.out.print("Please enter a number to search the array: ");

        while(!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        int key = scanner.nextInt();
        scanner.close();
        System.out.println(Arrays.binarySearch(arr, key) < 0 ? "Key not found" : "Key found in the array");

    }
}
