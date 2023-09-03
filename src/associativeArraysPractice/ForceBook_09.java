package associativeArraysPractice;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        Map<String, List<String>> teams = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {


        if (input.contains(" | ")) {
            String team = input.split(" \\| ")[0];
            String player = input.split(" \\| ")[1];


            if (!teams.containsKey(team)) {
                teams.put(team, new ArrayList<>());
            } else {
                boolean isExist = false;

            }

        } else if (input.contains(" -> ")) {

        }



            input = scanner.nextLine();
        }
    }
}
