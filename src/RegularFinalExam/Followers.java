package RegularFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer[]> followers = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Log out")) {
            String[] tokens = input.split(": ");
            String command = tokens[0];
            String username = tokens[1];

            switch (command) {
                case "New follower":
                    followers.putIfAbsent(username, new Integer[]{0, 0});
                    break;
                case "Like":
                    int likes = Integer.parseInt(tokens[2]);
                    followers.putIfAbsent(username, new Integer[]{0, 0});
                    followers.get(username)[0] += likes;
                    break;
                case "Comment":
                    followers.putIfAbsent(username, new Integer[]{0, 0});
                    followers.get(username)[1]++;
                    break;
                case "Blocked":
                    if (followers.containsKey(username)) {
                        followers.remove(username);
                    } else {
                        System.out.println(username + " doesn't exist.");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        // Print the result
        System.out.println(followers.size() + " followers");
        for (Map.Entry<String, Integer[]> entry : followers.entrySet()) {
            String username = entry.getKey();
            int likes = entry.getValue()[0];
            int comments = entry.getValue()[1];
            System.out.println(username + ": " + (likes + comments));
        }
    }
}
