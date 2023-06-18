package RegularMidExam;

import java.util.Scanner;

public class TaxCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] vehicles = input.split(">>");
        double totalTaxCollected = 0;

        for (String vehicle : vehicles) {
            String[] parts = vehicle.split(" ");
            if (parts.length != 3) {
                System.out.println("Invalid vehicle format.");
                continue;
            }

            String carType = parts[0];
            int years = Integer.parseInt(parts[1]);
            int kilometers = Integer.parseInt(parts[2]);
            double initialTax = 0;

            switch (carType) {
                case "family":
                    initialTax = 50;
                    break;
                case "heavyDuty":
                    initialTax = 80;
                    break;
                case "sports":
                    initialTax = 100;
                    break;
                default:
                    System.out.println("Invalid car type.");
                    continue;
            }

            double tax = calculateTax(carType, initialTax, years, kilometers);
            totalTaxCollected += tax;

            System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, tax);
        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.%n", totalTaxCollected);
    }

    private static double calculateTax(String carType, double initialTax, int years, int kilometers) {
        double tax = initialTax;

        if (years > 0) {
            switch (carType) {
                case "family":
                    tax -= years * 5;
                    tax += (kilometers / 3000) * 12;
                    break;
                case "heavyDuty":
                    tax -= years * 8;
                    tax += (kilometers / 9000) * 14;
                    break;
                case "sports":
                    tax -= years * 9;
                    tax += (kilometers / 2000) * 18;
                    break;
            }
        }

        return tax;
    }
}

