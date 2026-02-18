package projects;

import java.util.Scanner;

/**
 * Exercise: Hit the Target
 * -----------------------
 * The target is located at coordinate (5, 2).
 *
 * TODO:
 * 1. Ask the user to enter X and Y coordinates.
 * 2. Create a method `hitTarget(int x, int y)` that:
 *    - Calculates the distance between the user's coordinate and the target
 *    - Returns true if the distance is < 2
 *    - Returns false otherwise
 * 3. Print "🎯 Hit!" or "❌ Miss!" based on the result.
 */

public class HitTarget
{
    int targetX = 5;
    int targetY = 20;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter Y coordinate: ");
        int y = scanner.nextInt();

        HitTarget obj = new HitTarget();
        obj.hitTarget(x, y);

        // TODO: Call hitTarget(x, y) and print result
    }

    // TODO: Write hitTarget(int x, int y)
    void hitTarget (int x, int y) {

        System.out.println(x / targetX == y / targetY ?  "Yes, it hits the target " : "No, it doesn't. ");
    }
}
