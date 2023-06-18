package RegularMidExam;

import java.util.Scanner;

public class TheHuntingGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfAdventure = Integer.parseInt(scanner.nextLine());
        int playerCount = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerPersonPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerPersonPerDay = Double.parseDouble(scanner.nextLine());


        double totalWater = daysOfAdventure * playerCount * waterPerPersonPerDay;
        double totalFood = daysOfAdventure * playerCount * foodPerPersonPerDay;

        for (int i = 1; i <= daysOfAdventure; i++) {
            double energyLoss = Double.parseDouble(scanner.nextLine());

            groupEnergy -= energyLoss;

            if (groupEnergy <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
                return;
            }

            if (i % 2 == 0) {
                groupEnergy *= 1.05;
                totalWater -= totalWater * 0.3;
            }

            if (i % 3 == 0) {
                totalFood -= totalFood / playerCount;
                groupEnergy *= 1.1;

            }
        }
        if (groupEnergy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", groupEnergy);
        }
    }
}
