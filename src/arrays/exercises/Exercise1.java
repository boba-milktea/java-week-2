package arrays.exercises;

/**
 * Exercise 1: Single-Dimensional Array
 * TODO:
 * 1. Create an array of 5 integers.
 * 2. Traverse and print elements.
 * 3. Find sum of all elements.
 */
public class Exercise1
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int [] intArr = {2, 4, 6, 8, 10};
        int total = 0;
        for (int num : intArr) {
            System.out.print(num + " " );
            total += num;
        }
        System.out.println("Total is " + total);
    }
}
