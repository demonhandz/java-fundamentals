package PracticeObjectsAndClasses;

import java.time.LocalDate;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate birthday = LocalDate.of(1996, 11, 27);

        System.out.println(birthday);
    }
}
