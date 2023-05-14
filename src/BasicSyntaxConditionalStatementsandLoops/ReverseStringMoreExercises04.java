package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class ReverseStringMoreExercises04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        scanner.close();

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
