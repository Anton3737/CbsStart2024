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

    static void diii() {


    }

    public static void main(String[] args) {

        foreach:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(" " + i);
                if (i == 3 && j == 1) break foreach;
                if (i == 0 || i == 2) break;
            }
        }
    }
}
