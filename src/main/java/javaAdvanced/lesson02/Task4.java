package javaAdvanced.lesson02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> stringStringMap = new HashMap<>();

        while (true) {

            System.out.println("Input city");
            String city = scanner.next();

            System.out.println("Input family");
            String family = scanner.next();

            if (family != null) {
                stringStringMap.put(city, family);
            }

            System.out.println(stringStringMap);
        }

    }
}
