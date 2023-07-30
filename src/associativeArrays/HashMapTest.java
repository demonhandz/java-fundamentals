package associativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HashMapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> airplanesMap = new LinkedHashMap<>();
        airplanesMap.put("Boeing 737", 130);
        airplanesMap.put("Airbus A320", 160);
        airplanesMap.put("Airbus", 98);
        airplanesMap.put("Boeing", 498);


        airplanesMap.remove("Airbus", 98);

        System.out.println();
    }
}
