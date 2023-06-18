package RegularMidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatLogger_03 {
    public static void main(String[] args) {
        List<String> chat = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String command;
        while (!(command = scanner.nextLine()).equals("end")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Chat":
                    String message = tokens[1];
                    chat.add(message);
                    break;
                case "Delete":
                    message = tokens[1];
                    chat.remove(message);
                    break;
                case "Edit":
                    message = tokens[1];
                    String editedVersion = tokens[2];
                    int index = chat.indexOf(message);
                    if (index != -1) {
                        chat.set(index, editedVersion);
                    }
                    break;
                case "Pin":
                    message = tokens[1];
                    index = chat.indexOf(message);
                    if (index != -1) {
                        chat.remove(index);
                        chat.add(message);
                    }
                    break;
                case "Spam":
                    for (int i = 1; i < tokens.length; i++) {
                        message = tokens[i];
                        chat.add(message);
                    }
                    break;
                default:
                    break;
            }
        }

        for (String message : chat) {
            System.out.println(message);
        }
    }
}








