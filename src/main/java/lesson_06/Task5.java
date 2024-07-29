package lesson_06;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

        System.out.println("Введіть число З якового почнеться відлік:");
    int A = sc.nextInt();
        System.out.println("Введіть число яким закінчиться відлік:");
    int B = sc.nextInt();

        System.out.println("{" + A + " <---> " + B + "}");

        if (A < B) {
        int tmp = 0;
        for (int i = A; i <= B; i++) {

            tmp = tmp + i;
        }
        System.out.println("Сумма чисел в діапазоні: " + A + " та " + B + " складає: " + tmp);
    } else {
        System.err.println("A > B  - порушена структура лінійності");
        System.err.println("Введіть число з якого почнеться відлік до -> N по зростанню");
    }
}
}
