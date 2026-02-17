package arrays.exercises;

/**
 * Exercise 2: Multi-Dimensional Array
 * TODO:
 * 1. Create a 2x3 array.
 * 2. Assign values.
 * 3. Traverse and print matrix.
 * 4. Calculate sum of elements.
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int[][] matrix = {
                {2, 3, 4},
                {1, 8, 0}
        };
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
