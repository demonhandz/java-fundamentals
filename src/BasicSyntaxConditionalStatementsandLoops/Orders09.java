package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class Orders09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());
        double totalSum = 0.0;

        for (int i = 1; i <= ordersCount; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double sum = ((daysInMonth * capsulesCount) * pricePerCapsule);

            System.out.printf("The price for the coffee is: $%.2f%n", sum);

            totalSum += sum;
        }

        System.out.printf("Total: $%.2f", totalSum);
    }
}
