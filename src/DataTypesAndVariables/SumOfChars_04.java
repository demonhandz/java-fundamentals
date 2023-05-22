package DataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //number of symbols entered through the console

        int sum = 0; //sum of the code / symbols
        //for every symbol from first to last
        //1. read the contains from ASCII
        //2. sum the ASCII code of the symbol
        for (int count = 1; count <= n; count++) {
            char symbol = scanner.nextLine().charAt(0); //entered symbol
            int asciiCode = (int) symbol; // ascii code of the entered symbol
            sum += asciiCode;
        }
        System.out.println("The sum equals: " + sum);
    }
}
