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
                //2. we have such a team
                //we add the player to the team, if he doesn't exist in another team
                boolean isExist = false;
                //isExist = true -> the player exists in another team
                //isExist = false -> the player doesn't exist in another team
                for (List<String> list : teams.values()) {
                    if (list.contains(player)) {
                        isExist = true;
                        break;
                    }
                }

                if (!isExist) {
                    teams.get(team).add(player);
                }
            }

        } else if (input.contains(" -> ")) {
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];


                //1.remove player if hje exist in a team
                teams.entrySet().forEach(entryTeam -> entryTeam.getValue().remove(player));

                //2.move to new team.
                //2.1 does such team exist
            if (!teams.containsKey(team)) {
                teams.put(team, new ArrayList<>());
                teams.get(teams).add(player);
            }
            //2.2 if you try to move the player in an already existing team
            else {
                teams.get(team).add(player);
            }
            System.out.printf("%s joins the %s side!", player, team);
        }
            input = scanner.nextLine();
        }
        teams.entrySet().stream().filter(teamEntry -> teamEntry.getValue().size() > 0) //оставяме само тези записи, които отговарят на условието
                .forEach(entry -> {
                    //entry: key (team) -> value (list of players)
                    //"Side: {forceSide}, Members: {forceUsers.Count}
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
    }
}
