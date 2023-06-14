package Arrays;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");

        int countRotation = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotation ; rotation++) {
            //rotation of the array
            //1. take the first element
            String firstElement = array[0];

            //2. move the elements to the left
            for (int index = 0; index < array.length - 1 ; index++) {
                array[index] = array[index + 1];
            }

            //3. place the first element in the last place
            array[array.length - 1] = firstElement;
        }

        // after we finish the rotation -> print the elements of the array
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}
