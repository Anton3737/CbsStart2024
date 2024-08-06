package lesson_09;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 3;
        int b = 3;

        int[][] firstArray = new int[a][b];
        int[][] secondArray = new int[a][b];
        int[][] theeArray = new int[a][b];

        System.out.println("Заповнення масиву №1");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                firstArray[i][j] = sc.nextInt();
            }
            System.out.println("Заповнено ряд №" + i);
        }
        System.out.println("Результат заповнення масиву №1");
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
        System.out.println("Результат заповнення масиву №2");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" " + secondArray[i][j]);
            }
            System.out.print("\n");
        }


        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                theeArray[i][j] = firstArray[i][j] + secondArray[i][j];
            }
        }

        System.out.println("\n Вивід додавання 2х масивів: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" " + theeArray[i][j]);
            }
            System.out.print("\n");
        }
    }
}
