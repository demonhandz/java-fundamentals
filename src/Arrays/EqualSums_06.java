package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];

            int leftSum = 0; //sum of elements to the left
            int rightSum = 0; //sum of elements to the right

            //1. find the sum of the elements to the left
            //left sum: all elements from (0) to current(while not including it)

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }



            //2. find the sum of the elements to the right
            //right sum: all elements after current to the last
            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                rightSum += numbers[rightIndex];
            }


            //3. check if both sums are even -> I've found the number
            if (leftSum == rightSum) {
                System.out.println(index);
                return; //ends the entire program
            }
        }

        //cycled through all numbers and not a single one matched the task

        System.out.println("no");
    }
}
