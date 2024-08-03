package lesson_07;

import java.util.Scanner;

public class PowerA234 {

    static void PowerA234(double A) {

        if (A > 0 || A != 0) {
            double B = Math.pow(A, 2);
            System.out.println("Число: " + A + " в степені 2 дорівнює: = " + B);
            double C = Math.pow(A, 3);
            System.out.println("Число: " + A + " в степені 3 дорівнює: = " + C);
            double D = Math.pow(A, 4);
            System.out.println("Число: " + A + " в степені 4 дорівнює: = " + D);
        } else if (A < 0) {
            System.err.println("Число не є дійсним");
        } else {
            System.err.println("Не є числом");
        }

    }


    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("                Іттерація №" + i);
            System.out.println("Введіть число для піднесення до степеню 2/3/4:");
            Scanner sc = new Scanner(System.in);
            double A = sc.nextDouble();

            PowerA234(A);
            System.out.println("*".repeat(50));
        }
    }
}
