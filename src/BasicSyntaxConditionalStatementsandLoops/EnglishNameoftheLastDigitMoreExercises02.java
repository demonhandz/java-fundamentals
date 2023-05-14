package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class EnglishNameoftheLastDigitMoreExercises02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String lastDigitName = getLastDigitName(number);
        System.out.println(lastDigitName);
    }
    public static String getLastDigitName(int number){
        int lastDigit = Math.abs(number % 10);
            switch (lastDigit) {
                case 0:
                    return "zero";
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                case 4:
                    return "four";
                case 5:
                    return "five";
                case 6:
                    return "six";
                case 7:
                    return "seven";
                case 8:
                    return "eight";
                case 9:
                    return "nine";
                default:
                    return "invalid";
        }
    }
}
