package Lists;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            //command = Add {number} - add number at the end
            //command =  Insert {number} {index} - insert number at given index
            //command =  Remove {index} - remove that index
            //command =  Shift left {count} - first number becomes last 'count' times
            //command =  Shift right {count} - last number becomes first 'count' times
            //Note: The index given may be outside the array's bounds. In that case, print "Invalid index"
            String [] commandParts = command.split(" ");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Add":
                        int numberToAdd = Integer.parseInt(commandParts[1]);
                        numbers.add(numberToAdd);
                    break;
                case "Insert":
                        int numberForInsert = Integer.parseInt(commandParts[1]);
                        int indexForInsert = Integer.parseInt(commandParts[2]);

                        if (isValidIndex(indexForInsert, numbers.size())) {
                            numbers.add(indexForInsert, numberForInsert);
                        } else {
                            System.out.println("Invalid index");
                        }

                    break;
                case "Remove":
                        int indexToRemove = Integer.parseInt(commandParts[1]);

                        if (isValidIndex(indexToRemove, numbers.size())) {
                            numbers.remove(indexToRemove);
                        } else {
                            System.out.println("Invalid index");
                        }

                    break;
                case "Shift":
                        String direction = commandParts[1];
                        int count = Integer.parseInt(commandParts[2]);
                        if (direction.equals("left")) {
                            for (int i = 1; i <= count ; i++) {
                                int firstElement = numbers.get(0);
                                numbers.remove(0);
                                numbers.add(firstElement);
                            }

                        } else if (direction.equals("right")) {
                            for (int i = 1; i <= count ; i++) {
                                int lastElement = numbers.get(numbers.size() - 1);
                                numbers.remove(numbers.size() - 1);
                                numbers.add(0, lastElement);
                            }
                        }
                    break;
            }

            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
    public static boolean isValidIndex (int index, int size) {
        return index >= 0 && index <= size - 1;
    }
}
