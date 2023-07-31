package associativeArrays;


import java.util.ArrayList;
import java.util.Scanner;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        ArrayList<String> resultList = new ArrayList<>();
        for (String item : wordsArr) {
            if(item.length() % 2 == 0) {
                resultList.add(item);
            }
        }
        System.out.println(String.join(System.lineSeparator(), resultList));
    }
}
