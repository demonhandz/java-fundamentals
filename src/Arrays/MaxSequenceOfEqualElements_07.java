package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int length = 1; //length of a given sequence
        int maxLength = 0;
        int startIndex = 0;
        int bestStartIndex = 0;

        //2 1 1 2 3 3 2 2 2 1
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                length++;
            } else {
                length = 1;
                startIndex = i;
            }

            //check if the length of the sequence is max
            if (length > maxLength) {
                maxLength = length;
                bestStartIndex = startIndex;
            }
        }

        for (int i = bestStartIndex; i < bestStartIndex + maxLength; i++)
            System.out.print(array[i] + " ");
    }
}
