package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestsList = new ArrayList<>();

        //input data
        int countCommands = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= countCommands; count++) {
            String command = scanner.nextLine();
            //command = "{name} is going!".split(" ")   -> ["{name}, "is, "going!"]
            //command = "{name} is not going!".split(" ")   -> ["",]
            String[] commandParts = command.split(" ");
            String name = commandParts[0];
            if (command.contains("not")) {
                //command = "{name} is not going!".split(" ")   -> ["",]
                //remove from the list
                //1. person is on the list
                if (guestsList.contains(name)) {
                    //2. person is not on the list
                    guestsList.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            } else {
                //command = "{name} is going!".split(" ")   -> ["{name}, "is, "going!"]
                //add do the list
                //1. there is such a person on the list
                if (guestsList.contains(name)) {
                    System.out.println(name + " is already in the list!");
                }
                else {
                    guestsList.add(name);//2. there isn't such a person on the list
                }

            }
        }
        //list of all guests
        for (String guestName : guestsList) {
            System.out.println(guestName);
        }
    }
}
