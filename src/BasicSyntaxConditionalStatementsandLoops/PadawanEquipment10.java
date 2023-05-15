package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class PadawanEquipment10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double priceForOneLightSaber = Double.parseDouble(scanner.nextLine());
        double priceForOneRobe = Double.parseDouble(scanner.nextLine());
        double priceForOneBelt = Double.parseDouble(scanner.nextLine());

        double freeBelts = studentsCount / 6;
        double priceLightSabers = Math.ceil(studentsCount * 1.1)  * priceForOneLightSaber;
        double priceBelts = (studentsCount - freeBelts)  * priceForOneBelt;
        double priceRobes = studentsCount  * priceForOneRobe;


        double finalPrice = priceLightSabers + priceBelts + priceRobes;

        if (finalPrice <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", finalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", finalPrice - money);
        }
    }
}
