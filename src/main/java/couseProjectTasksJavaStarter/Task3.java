package couseProjectTasksJavaStarter;

import java.util.Scanner;

public class Task3 {


    static int getSumOfName(String inputName) {
        int counter = 0;
        char[] charName = inputName.toCharArray();

        for (char cName : charName) {
            cName = Character.toUpperCase(cName);
            if (cName >= 'A' && cName <= 'Z') {
                counter += (cName - 'A' + 1);
                System.out.println(cName + " " + counter);
            }
        }

        return counter;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Sum of name characters " + getSumOfName(name));
    }

}
