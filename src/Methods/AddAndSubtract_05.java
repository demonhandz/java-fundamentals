package Methods;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.input data -> 3 integers

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(firstNumber, secondNumber, thirdNumber));

    }
    //create a method which sums two numbers and returns the result
    /*public static int sum (int n1, int n2) {
        return n1 + n2;
    }*/
    //create a method which subtracts the third integer from the result of the sum method

    public static int subtract (int n1, int n2, int n3) {
        return (n1 + n2) - n3;
    }
}
