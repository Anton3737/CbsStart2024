package couseProjectTasksJavaStarter;

import java.util.Scanner;

public class test {

    static int getSumOfDate(String inputData) {
        int counter = 0;
        char[] charNumbArray = inputData.toCharArray();

        for (char chatNumbers : charNumbArray) {
            if (chatNumbers >= '0' && chatNumbers <= 'Z') {
                counter += Integer.parseInt(String.valueOf(chatNumbers));
                System.out.print(chatNumbers + " - " + counter);
            }
        }

        return counter;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDataStr = scanner.next();
        System.out.println(getSumOfDate(inputDataStr));
    }
}
