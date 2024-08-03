package lesson_07;

import java.util.Scanner;

public class PowerA3 {

    static double PowerA3(double A) {
        double result_A = Math.pow(A, 3);
        System.out.println("Введене число: " + A + " в степені 3, становить: " + result_A);
        return result_A;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            System.out.println("              Іттерація №" + i);
            System.out.println("Введіть число для піднесення до степеню 3");
            Scanner sc = new Scanner(System.in);
            double A = sc.nextDouble();
            PowerA3(A);
            System.out.println("***********************************************");
        }
    }
}
