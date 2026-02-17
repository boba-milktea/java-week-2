package arrays.exercises;
import java.util.Scanner;

/**
 * Exercise 5: Linear Search
 * TODO:
 * 1. Create an array of integers.
 * 2. Ask user for a number.
 * 3. Call linear search.
 * 4. Print index if found or "Not found".
 */
public class Exercise5
{
    public static void main(String[] args)
    {
        // linear search
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3, 5, 9, 0, 2, 8};

        System.out.print("Please enter a number to search the array: ");

        while(!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number: ");
            scanner.next();
        }
        int key = scanner.nextInt();
        int index = -1;

        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        System.out.println(index != -1 ? ("Found it in the array at index " + index) : ("Key " + key + " not found." ));


        scanner.close();
    }
}
