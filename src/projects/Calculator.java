package projects;

/**
 * 1. ➕ Advance Calculator
 * Concepts used: Methods, parameters, return types.
 *
 * Create separate methods for addition, subtraction, multiplication, division , and modulus.
 * Make it works for integers and doubles separately (method overloading).
 * Ask the user for two numbers and an operation.
 * Call the correct method and return the result.
 * Do integer or double operations based on user input.
 * Example:
 *
 * public static int add(int a, int b) { return a + b; }
 * public static double add(double a, double b) { return a + b; }
 */

import java.util.Scanner;

/* ===================== Bad solution ===============================
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum;
        double secondNum;

        System.out.print("Please enter the first number: ");

        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        firstNum = scanner.nextDouble();

        System.out.print("Please enter the second number: ");

        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        secondNum = scanner.nextDouble();

        System.out.print("Please choose from the following operators: '+', '-', '*', '/', '%' :  ");

        char operator = scanner.next().trim().charAt(0);

        while( operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%') {
            System.out.print("Please choose a valid operator (+, -, *, / , %) : ");
            operator = scanner.next().trim().charAt(0);
        }
       boolean firstIsInt;
        boolean secondIsInt;

        firstIsInt = Double.isInfinite(firstNum) && firstNum == Math.floor(firstNum);
        secondIsInt = Double.isInfinite(secondNum) && secondNum == Math.floor(secondNum);

        int firstIntNum = (int) firstNum;
        int secondIntNum = (int) secondNum;

      boolean useInt = firstIsInt && secondIsInt;

        double result = switch (operator) {
          case '+' -> useInt ? add(firstIntNum, secondIntNum) : add(firstNum, secondNum);
          case '-' -> useInt ? subtract(firstIntNum, secondIntNum) : subtract(firstNum, secondNum);
          case '*' -> useInt ? multiply(firstIntNum, secondIntNum) : multiply(firstNum, secondNum);
          case '/' -> useInt ? divide(firstIntNum, secondIntNum) : divide(firstNum, secondNum);
          case '%' -> useInt ? modulus(firstIntNum, secondIntNum) : modulus(firstNum, secondNum);
          default -> throw new IllegalStateException("Unexpected operator" + operator);
        };

        System.out.println("The result is: " + result);
        scanner.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

}
*/

/* ============================== cleaner solution ==================== */

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = readDouble(scanner, "Please enter your first number: ");
        double num2 = readDouble(scanner, "Please enter your second number: ");
        char op = readOp(scanner, "Please choose one operator - '+', '-', '*', '/', '%': " );

        boolean bothNumsAreInt = isWholeNumber(num1) && isWholeNumber(num2);
        if (bothNumsAreInt) {
            int intNum1 = (int)num1;
            int intNum2 = (int)num2;
            System.out.println("The result of calculation is: " + calculateInt(intNum1, intNum2, op));
        }
        System.out.println("The result of calculation is: " + calculateDouble(num1, num2, op));

    }

    // ---------- input helper methods  ---------------
    private static double readDouble (Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static char readOp (Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (true) {
            String token = scanner.next().trim();

            if (token.length() == 1) {
                char op = token.charAt(0);
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') return op;
            }
            System.out.print("Please enter a valid operator (+, -, /, *, %): ");
        }
    }

    private static boolean isWholeNumber (Double value) {
        return Double.isInfinite(value) && Math.floor(value) == value;
    }

    // ---------------------- dispatch methods ------------------
    public static int calculateInt(int a, int b, char op) {
        if ((op == '/' || op == '%') && b == 0) {
            throw new IllegalArgumentException("Can't divide or modulus by zero.");
        }

        return switch (op) {
            case '+' -> add(a, b);
            case '-' -> substract(a, b);
            case '*' -> multiply(a, b);
            case '/' -> divide(a, b);
            case '%' -> modulus(a, b);
            default -> throw new IllegalArgumentException("The operator is invalid: " + op);
        };
    }

    public static double calculateDouble(double a, double b, char op) {
        if ((op == '/' || op == '%') && b == 0) {
            throw new IllegalArgumentException("Can't divide or modulus by zero.");
        }

        return switch (op) {
            case '+' -> add(a, b);
            case '-' -> substract(a, b);
            case '*' -> multiply(a, b);
            case '/' -> divide(a, b);
            case '%' -> modulus(a, b);
            default -> throw new IllegalArgumentException("The operator is invalid: " + op);
        };
    }

    // ---------- overloaded operations  ------------
    public static int add( int a, int b ) { return a + b ; }
    public static double add( double a, double b ) { return a + b ; }
    public static int substract( int a, int b ) { return a - b ; }
    public static double substract( double a, double b ) { return a - b ; }
    public static int multiply( int a, int b ) { return a * b ; }
    public static double multiply( double a, double b ) { return a * b ; }
    public static int divide( int a, int b ) { return a / b ; }
    public static double divide( double a, double b ) { return a / b ; }
    public static int modulus( int a, int b ) { return a % b ; }
    public static double modulus( double a, double b ) { return a % b ; }
}