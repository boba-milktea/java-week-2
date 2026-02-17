package modernjava.exercises;

/**
 * Exercise: instanceof and Type Checking
 * --------------------------------------
 * TODO:
 * 1. Create a method `describe(Object value)`
 *    - If value is a String → print its length
 *    - If value is an Integer → print its double
 *    - Otherwise → print "Unknown type"
 *
 * 2. Call describe() from main() with:
 *    - A String
 *    - An Integer
 *    - A Double
 */
public class ExerciseInstanceof
{
    public static void main(String[] args)
    {
        ExerciseInstanceof obj = new ExerciseInstanceof();

        // TODO: Call describe() with different types
        obj.describe("linkage");
        obj.describe(20.3);
        obj.describe(12);
    }

    public static void describe(Object value) {
        if (value instanceof String s) {
            System.out.println("The length of the text is: " + s.length());
        } else if (value instanceof Integer i) {
            System.out.println("The double of the integer is: " + (double)i );
        } else {
            System.out.println("Unknown type");
        }

    }

    // TODO: Write describe(Object value)
}
