package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class RageExpenses11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGamesLost = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        int countHeadset = countGamesLost / 2;
        int countMouse = countGamesLost / 3;
        int countKeyboard = countGamesLost / 6;
        int countDisplay = countGamesLost / 12;

        double totalPrice = (countHeadset * priceHeadset)
                + (countMouse * priceMouse)
                + (countKeyboard * priceKeyboard)
                + (countDisplay * priceDisplay);

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
