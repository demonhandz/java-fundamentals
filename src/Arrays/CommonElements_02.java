package Arrays;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. input data
        String firstRow = scanner.nextLine(); // "Hey hello 2 4"
        String secondRow = scanner.nextLine(); //"10 hey 4 hello"

        String [] firstArray = firstRow.split(" "); //["Hey", "hello", "2", "4"]
        String [] secondArray = secondRow.split(" "); //["10", "hey", "4", "hello"]

        //every element for the secondArray must be checked if it matches elements in the firstArray

        for (String el2 : secondArray) {
             for (String el1 : firstArray) {
                 if(el2.equals(el1)) {
                     System.out.print(el1 + " ");
                 }
             }
        }
    }
}
