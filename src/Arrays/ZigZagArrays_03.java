package Arrays;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //number of rows
        int [] firstArray = new int[n];
        int [] secondArray = new int[n];

        for (int row = 1; row <= n; row++) {
            String numbers = scanner.nextLine(); //"1 5".split(" ") -> ["1", "5"]
            int firstNumber = Integer.parseInt(numbers.split(" ")[0]); //"1" -> 1
            int secondNumber = Integer.parseInt(numbers.split(" ")[1]); //"5" -> 5

            if (row % 2 == 0) {
                firstArray[row - 1] = secondNumber;
                secondArray[row - 1] = firstNumber;
            } else {
                firstArray[row - 1] = firstNumber;
                secondArray[row - 1] = secondNumber;
            }
        }

        //print the elements of the first Array
        for (int number : firstArray) {
            System.out.print(number + " ");
        }

        System.out.println();

        //print the elements of the second array
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
    }
}
