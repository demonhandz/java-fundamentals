package RegularFinalExam;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        scanner.close();

        // Remove brackets [ and ] from the input string
        input = input.replaceAll("[\\[\\]]", "");

        // Split the input string by comma , to get individual elements
        String[] elements = input.split(",");

        for (String element : elements) {
            findValidEggs(element.trim());
        }
    }

    public static void findValidEggs(String input) {
        String regex = "[@#]+([a-z]{3,})[^a-z0-9]*?/([0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String color = matcher.group(1);
            int amount = Integer.parseInt(matcher.group(2));
            System.out.println("You found " + amount + " " + color + " eggs!");
        }
    }
}
