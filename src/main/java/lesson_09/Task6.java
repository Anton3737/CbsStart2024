package lesson_09;

import java.util.Scanner;

public class Task6 {
    static void resultArray(int[][] firstArray, int[][] secondArray) {

        int[][] resultArray = new int[firstArray.length][secondArray.length];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultArray[i][j] += firstArray[i][j] + secondArray[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + resultArray[i][j]);
            }
            System.out.print("\n");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 3;
        int b = 3;

        int[][] firstArray = new int[a][b];
        int[][] secondArray = new int[a][b];

        System.out.println("Заповнення масиву №1");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                firstArray[i][j] = sc.nextInt();
            }
            System.out.println("Заповнено ряд №" + i);
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" " + firstArray[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("Заповнення масиву №2");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                secondArray[i][j] = sc.nextInt();
            }
            System.out.println("Заповнено ряд №" + i);
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" " + secondArray[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("\n Результат додавання 2х багатовимірних масивів становить ");
        resultArray(firstArray, secondArray);
    }

}
