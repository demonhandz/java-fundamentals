package Methods;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            //input = "3456"
            //check if the input text is a palindrome (reads the same backwards 323, 1001, etc...)
            if (checkPalindrome(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }

    //create a method which checks if a given text is a palindrome
    //true -> the text is a palindrome
    //false -> the text is not a palindrome
    public static boolean checkPalindrome (String text) {
        //text = "Desi"
        //reversed = "iseD"
        //palindrome is every text which is read the same when read backwards

        String reversedText = ""; //text which is reversed
        for (int index = text.length() -1; index >= 0; index--) {
            reversedText += text.charAt(index);
        }
        return text.equals(reversedText);
    }
}
