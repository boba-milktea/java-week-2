package projects;


import java.util.Scanner;
import java.util.Set;

/**
 * 9. 🔠 String Utilities
 * Concepts used: Methods, arrays (of characters), loops.
 *
 * Write separate methods for:
 *
 * Counting vowels in a string.
 * Reversing a string.
 * Checking if a string is a palindrome.
 * Ask the user for input and call the methods.
 */

public class StringUtilities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = readString(scanner, "Please enter a text: ");


        char[] charArray = text.toCharArray();
        char[] lowerCaseCharArray = text.toLowerCase().toCharArray();

        System.out.println(countingVowels(lowerCaseCharArray));
        System.out.println(reverse(charArray));
        System.out.println(isPalindrome(lowerCaseCharArray) ? "It is a palindrome!" : "Nope, not a palindrome.");

    }


    // ================== methods =======================

    /* Not using set
    private static int countingVowls (char[] charArray) {
        int totalVowls = 0;
        for (char c : charArray)
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            totalVowls += 1 ;

        return totalVowls;
    }*/

    // I will count the vowels in the character array.
    private static int countingVowels (char[] charArray) {
        Set<Character> vowels = Set.of ('a', 'e', 'i', 'o', 'u');
        int totalVowels = 0;
        for (char c: charArray) {
            if (vowels.contains(c)) {
                totalVowels++;
            }
        }
        return totalVowels;
    }

    // I will read a string and validate it.
    private static String readString(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextLine()) {
            System.out.print("Please enter a valid text: ");
            scanner.next();
        }
        return scanner.nextLine();
    }

    // I will reverse your string (text).
    private static String reverse (char[] charArray) {
        char[] copy = charArray.clone();
        int start = 0;
        int end = copy.length-1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(copy);
    }
    // I will check if your text is Palindrome.
    private static boolean isPalindrome(char[] charArray) {
        int start = 0;
        int end = charArray.length-1 ;

        while (start < end) {
            if(charArray[start] != charArray[end]) return false;
            start ++;
            end --;
        }
        return true;
    }

}
