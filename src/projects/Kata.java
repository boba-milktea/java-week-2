package projects;
/*
When a is close to b, return 0.
For this challenge, a is considered "close to" b if margin is greater than or equal to the absolute distance between a and b.
Otherwise...

When a is less than b, return -1.

When a is greater than b, return 1.


 */

public class Kata
{
    public static void main(String[] args)  {

        double a = 5;
        double b = 5;
        double margin = 0;
        System.out.println(closeCompare(a, b, margin));

    }

    public static int closeCompare(double a, double b, double margin) {
        double distance = Math.abs(a-b);

        if (distance <= margin) {
            return 0;
        } else {
            return a > b ?  1 : -1;
        }


    }
}

