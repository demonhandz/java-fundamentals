package DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine()); //number of Kegs

        //every keg from 1st to last (countKegs):
        //1. model -> String
        //2. radius -> double
        //3. height -> int
        //4. volume = P * radius * radius * Height

        double maxVolume = Double.MIN_VALUE; //maximum volume
        String maxModel = ""; //model of the keg with the highest volume

        for (int keg = 1; keg <= countKegs; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius * radius * height;

            //check if the sum of the volume is the maximum

            if (volume > maxVolume) {
                maxVolume = volume;
                maxModel = model;
            }
        }

        System.out.println(maxModel);
    }
}
