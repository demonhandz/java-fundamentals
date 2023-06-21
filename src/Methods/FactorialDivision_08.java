package Methods;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. input
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        //2. find the factorial of the first number
        long factFirstNumber = calculateFactorial(firstNumber);

        //3. find the factorial of the second number
        long factSecondNumber = calculateFactorial(secondNumber);

        //4. f1 / f2 -> %.2f must be a fractional number** 120 * 1.0 = 120.0
        double result = factFirstNumber * 1.0 / factSecondNumber;
        System.out.printf("%.2f", result);
    }

    //method, which returns the final result (factorial of the given number)
    //!!! the calculated factorial could be a very big number!!!
    public static long calculateFactorial (int number) {
        //number = 7
        //7! = 1 * 2 * 3 * 4 * 5 * 6 * 7
        long fact = 1; //
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
