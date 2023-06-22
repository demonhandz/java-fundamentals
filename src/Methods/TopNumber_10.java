package Methods;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            //check if the number is "top number"
            //1. its sum of digits is divisible by 8
            //2. holds at least one odd digit
            boolean isValidSumDigits = checkSumDigitsIsDivisibleBy8(number);
            boolean isContainingOddDigit = checkContainsOddDigit(number);
            if (isValidSumDigits && isContainingOddDigit) {
                //top number
                System.out.println(number);
            }
        }
    }
    //method which checks if the sum is dvisible by 8
    //true -> sum is divisible by 8
    //false -> sum is not divisible by 8
    public static boolean checkSumDigitsIsDivisibleBy8 (int number) {
        //1. sum of digits
        int sum = 0; //sum of digits
        while (number > 0) {
            int lastDigit = number % 10; //last digit
            sum += lastDigit; //sum of the last digit
            number = number / 10; //removal of last digit
        }
        //2. check if it's divisible by 8
        return sum % 8 == 0;
        /*if (sum % 8 = 0) {
            return true;
        } else {
            return false;
        }*/
    }
    //write a method which checks if we have at least one odd number
    //true -> if you have an odd
    //false -> no odd numbers
    public static boolean checkContainsOddDigit (int number) {
        //3657
        while (number > 0) {
            int lastDigit = number % 10; //last digit
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                //even number -> remove
                number = number / 10;
            }
        }
        //checked all cycles and none of them were odd numbers
        return false;
    }
}
