package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int targetSum = Integer.parseInt(scanner.nextLine());

        //go through every number from the array
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            //go through every number after the current number
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                int nextNumber = numbers[i]; //the number after "currentNumber"

                if (currentNumber + nextNumber == targetSum) {
                    System.out.println(currentNumber + " " + nextNumber);
                }
            }
        }
    }
}
