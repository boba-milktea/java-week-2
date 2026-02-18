package arrays.exercises;

/**
 * Exercise 3: Jagged Array
 * TODO:
 * 1. Create a jagged array with 3 rows.
 * 2. Assign values manually.
 * 3. Traverse and print array.
 * 4. Find total number of elements.
 */
public class Exercise3
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int jagged[][] = new int[3][];
        jagged[0] = new int[]{2, 3, 4 };
        jagged[1] = new int[]{ 7 };
        jagged[2] = new int[]{ 4, 0 };
        int total = 0;

        for (int row = 0; row < jagged.length; row++) {
            for (int col = 0; col < jagged[row].length; col ++) {
                System.out.print(jagged[row][col] + " ");
                total += jagged[row][col];
            }
            System.out.println();
        }
        System.out.println("The total is: " + total);
    }
}
