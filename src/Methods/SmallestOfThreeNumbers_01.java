package Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNUmber = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNumber, secondNumber,thirdNUmber);

    }

    //write a method that prints the lowest number of the three scanned
    public static void printSmallestNumber (int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            System.out.println(n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }
    }
}
