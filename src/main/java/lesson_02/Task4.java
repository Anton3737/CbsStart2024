package lesson_02;

import java.util.Scanner;

public class Task4 {

    static String whatColourIsGrass(String answer) {
        String green = "green";

        if (answer.toLowerCase().equals(green)) {
            System.out.println(answer.toLowerCase().equals(green));
            return "Yes it green !!!!!!!!";
        } else {
            System.out.println(answer.toLowerCase().equals(green));
            return "No , try again";
        }
    }

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What colour is grass ?");
            String tmp = sc.next();
            if (tmp.toLowerCase().equals("stop")) {
                System.out.println("End game");
                break;
            }
            System.out.println(whatColourIsGrass(tmp));
        }
    }
}
