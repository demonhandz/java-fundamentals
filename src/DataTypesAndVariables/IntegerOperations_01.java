package DataTypesAndVariables;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fourthNumber = Integer.parseInt(scanner.nextLine());

        int preSum = (firstNumber + secondNumber) / thirdNumber;
        int finalSum = preSum * fourthNumber;

        System.out.println(finalSum);
    }
}
