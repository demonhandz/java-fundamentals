package RegularFinalExam;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Receive the initial string that needs to be deciphered
        String inputString = scanner.nextLine();

        String command = scanner.next();
        while (!command.equals("Abracadabra")) {
            if (command.equals("Abjuration")) {
                inputString = inputString.toUpperCase();
                System.out.println(inputString);
            } else if (command.equals("Necromancy")) {
                inputString = inputString.toLowerCase();
                System.out.println(inputString);
            } else if (command.equals("Illusion")) {
                int index = scanner.nextInt();
                String letter = scanner.next();
                if (index >= 0 && index < inputString.length()) {
                    inputString = inputString.substring(0, index) + letter + inputString.substring(index + 1);
                    System.out.println("Done!");
                } else {
                    System.out.println("The spell was too weak.");
                }
            } else if (command.equals("Divination")) {
                String firstSubstring = scanner.next();
                String secondSubstring = scanner.next();
                if (inputString.contains(firstSubstring)) {
                    inputString = inputString.replace(firstSubstring, secondSubstring);
                    System.out.println(inputString);
                }
            } else if (command.equals("Alteration")) {
                String substring = scanner.next();
                if (inputString.contains(substring)) {
                    inputString = inputString.replace(substring, "");
                    System.out.println(inputString);
                } else {
                    System.out.println("The spell was too weak.");
                }
            } else {
                System.out.println("The spell did not work!");
            }

            command = scanner.next();
        }
    }
}
