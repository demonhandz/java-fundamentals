package Methods;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase(); //"Test" or "ElizA" => "test", "eliza"

        printCountVowels(text);
    }

    //write a method that prints out the count of vowels in a string input
    public static void printCountVowels (String text) {
        int count = 0; //the number of vowel letters
        //text = "eliza".toCharArray() -> ['e', 'l', 'i', 'z', 'a']
        for (char symbol : text.toCharArray()) {
            //vowel letters a, e, i, o, u
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
