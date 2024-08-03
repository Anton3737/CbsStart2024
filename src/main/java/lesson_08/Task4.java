package lesson_08;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    static void overloaded(double a, double b, double c) {
        double resultAvg = (a + b + c) / 3;
        System.out.println("Середнє арифмеичне значення складає: " + resultAvg);

        double[] arr = {a, b, c};
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).min());
        System.out.println("*".repeat(45));

        System.out.println("Мінімальне значення з 3х чисел");
        System.out.println(minNumber(a, b, c));
        System.out.println("Максимальне значення з 3х чисел");
        System.out.println(maxNumber(a, b, c));

    }

    static void overloaded(double a, double b, double c, double d) {
        double resultAvg = (a + b + c + d) / 4;
        System.out.println("Середнє арифмеичне значення складає: " + resultAvg);


        double[] arr = {a, b, c, d};
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).min());
        System.out.println("*".repeat(45));

        System.out.println("Мінімальне значення з 4х чисел");
        System.out.println(minNumber(a, b, c, d));
        System.out.println("Максимальне значення з 4х чисел");
        System.out.println(maxNumber(a, b, c, d));
    }

    static void overloaded(double a, double b, double c, double d, double e) {
        double resultAvg = (a + b + c + d + e) / 5;
        System.out.println("Середнє арифмеичне значення складає: " + resultAvg);

        double[] arr = {a, b, c, d, e};
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).min());
        System.out.println("*".repeat(45));

        System.out.println("Мінімальне значення з 5х чисел");
        System.out.println(minNumber(a, b, c, d, e));
        System.out.println("Максимальне значення з 5х чисел");
        System.out.println(maxNumber(a, b, c, d, e));
    }


    static double minNumber(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }

    static double maxNumber(double a, double b, double c) {
        return Math.max(Math.min(a, b), c);
    }

    //
    static double minNumber(double a, double b, double c, double d) {
        double res1 = Math.min(a, b);
        double res2 = Math.min(c, d);
        return Math.min(res1, res2);
    }

    static double maxNumber(double a, double b, double c, double d) {
        double res1 = Math.max(a, b);
        double res2 = Math.max(c, d);
        return Math.max(res1, res2);
    }

    //
    static double maxNumber(double a, double b, double c, double d, double e) {
        double res1 = Math.max(Math.max(a, b), c);
        double res2 = Math.max(d, e);
        return Math.max(res1, res2);
    }

    static double minNumber(double a, double b, double c, double d, double e) {
        double res1 = Math.min(Math.min(a, b), c);
        double res2 = Math.min(d, e);
        return Math.min(res1, res2);
    }


    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//            System.out.println("Заповнено " + i + "й елемент масиву.");
//        }


//        overloaded(4, 6, 1);
//        overloaded(89, 76, 112, 61);
//        overloaded(92, 5, 124, 82, 8);

//
//        overloaded(array[0], array[1], array[2]);
//        overloaded(array[0], array[1], array[2], array[3]);
//        overloaded(array[0], array[1], array[2], array[3], array[4]);

    }
}

