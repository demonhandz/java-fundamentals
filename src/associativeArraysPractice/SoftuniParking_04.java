package associativeArraysPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftuniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingData = new LinkedHashMap<>();

        for (int count = 0; count < countCommands; count++) {
            String command = scanner.nextLine();
            String [] commandParts = command.split(" "); //splitting the cars to register from the console

            String commandName = commandParts[0]; //(registered or unregistered)
            String username = commandParts[1]; // name of the car owner

            switch (commandName) {
                case "register":
                    String carNumber = commandParts[2]; //license plate
                    //1.user already registered
                    if (parkingData.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", carNumber);
                    } else { //2. user isn't registered
                        parkingData.put(username, carNumber);
                        System.out.printf("%s registered %s successfully%n", username, carNumber);
                    }
                    break;
                case "unregister":
                    //1. there is such a car registered
                    if (parkingData.containsKey(username)) {
                        parkingData.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    }
                    //2. no user has been found
                    else {
                        System.out.printf("ERROR: user %s not found%n", username);
                    }
                    break;
            }
        }
        parkingData.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
