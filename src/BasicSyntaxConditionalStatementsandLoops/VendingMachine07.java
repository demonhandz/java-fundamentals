package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class VendingMachine07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoney = 0.0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Start")) {
                break;
            }

            double coin = Double.parseDouble(input);

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                totalMoney += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
        }

        while (true) {
            String product = scanner.nextLine();

            if (product.equals("End")) {
                break;
            }

            double price = 0.0;

            switch (product) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    continue;
            }

            if (totalMoney >= price) {
                totalMoney -= price;
                System.out.printf("Purchased %s%n", product);
            } else {
                System.out.println("Sorry, not enough money");
            }
        }

        System.out.printf("Change: %.2f%n", totalMoney);
    }
}
