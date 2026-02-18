package projects;
import java.util.Scanner;

public class Piramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String simbol = "";

        int userInput;
        boolean isStraight = false;

        System.out.print("Please enter the input: ");
        if (scanner.hasNextInt()){
            userInput = scanner.nextInt();
            printPiramid(userInput, isStraight);
        }
        else {
            System.out.println("Your input is not an integer.");
        }


        scanner.close();
    }

    public static void printPiramid(int userInput, boolean isStraight) {
        if (isStraight) {
            printPiramid(userInput);
        } else {
            printInvertedPiramid(userInput);
        }
    }

    public static void printInvertedPiramid(int userInput) {

        for (int i = userInput ; i > 0 ; i-- ){

            for (int j = 0 ; j < i ; j++ ){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void printPiramid(int userInput) {

        for (int i = 1 ; i <= userInput ; i++ ){

            for (int j = 0 ; j < i ; j++ ){
                System.out.print("* ");
            }

            System.out.println();
        }
    }



}
