package javaAdvanced.lesson02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();

        while (true) {
            String input = scanner.next();

            if (input.equals("end")) {
                break;
            }

            stringList.add(input);
            System.out.println(stringList);
        }

        System.out.println(stringList);
    }
}
