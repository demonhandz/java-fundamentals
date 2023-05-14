package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }

        int countWrongPassword = 0; //wrong password counter
        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.equals(password)) {
            //wrong password
            countWrongPassword++;
            //checking if the user is blocked for 4 failed attempts
            if (countWrongPassword == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        //correct password
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }

    }
}
