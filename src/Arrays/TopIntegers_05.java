package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //entry data
        int [] numbers = Arrays.stream(scanner.nextLine() // "1 4 3 2"
                            .split(" "))            //["1", "4", "3", "2"]
                            .mapToInt(Integer::parseInt)  //[1, 4, 3, 2]
                            .toArray();

        //!!! last element is always a top number
        for (int index = 0; index < numbers.length - 1; index++) {
            int currentNumber = numbers[index]; //number of the current index
            boolean isBigger = true;
            //true -> the current number is bigger than all the numbers to it's right
            //false -> the current number isn't bigger then all numbers to its right
            for (int i = index + 1; i < numbers.length; i++) {
                //all elements after mine including the last element
                int numberAfter = numbers[i];
                if(currentNumber <= numberAfter) {
                    isBigger = false;
                    break;
                    //my number is smaller than some numbers to its right
                }
            }

            if (isBigger){
                //my number was bigger than each of the separate numbers to its right
                System.out.print(currentNumber + " ");
            }
        }
        //always print the last number because it's a top number
        System.out.print(numbers[numbers.length -1]);
    }
}
