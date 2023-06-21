package Methods;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacters(text);

    }
    //You will receive a single string. Write a method that prints the middle character.
    //If the length of the string is even,there are two middle characters.

    public static void printMiddleCharacters (String text) {
        int length = text.length();
        //if the length is not even -> 2 middle characters.
        if (length % 2 != 0) {
            //"aString" -> ['a', 'S', 't', 'r', 'i', 'n', 'g']
            int indexOfMiddleCharacters = length / 2;
            System.out.println(text.charAt(indexOfMiddleCharacters));
        } else {
            //"someText" -> 8 symbols -> eT (index: 3 and 4)
            //"dogs" -> 4 symbols -> og (index: 1 and 2)
            int indexFirstMiddleCharacter = length / 2 - 1;
            int indexSecondMiddleCharacter = length / 2;

            System.out.print(text.charAt(indexFirstMiddleCharacter));
            System.out.print(text.charAt(indexSecondMiddleCharacter));
        }
    }
}
