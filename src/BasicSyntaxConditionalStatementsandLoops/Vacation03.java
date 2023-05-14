package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double pricePerPerson = 0;

        switch (groupType) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        pricePerPerson = 8.45;
                        break;
                    case "Saturday":
                        pricePerPerson = 9.80;
                        break;
                    case "Sunday":
                        pricePerPerson = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        pricePerPerson = 10.90;
                        break;
                    case "Saturday":
                        pricePerPerson = 15.60;
                        break;
                    case "Sunday":
                        pricePerPerson = 16.00;
                        break;
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        pricePerPerson = 15.00;
                        break;
                    case "Saturday":
                        pricePerPerson = 20.00;
                        break;
                    case "Sunday":
                        pricePerPerson = 22.50;
                        break;
                }
                break;
        }
        double totalPrice = groupSize * pricePerPerson;

        if (groupType.equals("Students") && groupSize >= 30) {
            totalPrice -= totalPrice * 0.15;
        } else if (groupType.equals("Business") && groupSize >= 100) {
            totalPrice -= (10 * pricePerPerson);
        } else if (groupType.equals("Regular") && groupSize >= 10 && groupSize <= 20) {
            totalPrice -= totalPrice * 0.05;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
