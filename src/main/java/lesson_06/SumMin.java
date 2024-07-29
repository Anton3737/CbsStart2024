package lesson_06;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть число, з якого почнеться відлік:");
        int A = sc.nextInt();
        System.out.println("Введіть число, яким закінчиться відлік:");
        int B = sc.nextInt();

        if (A >= B) {
            System.out.println("Помилка: A повинно бути менше ніж B.");
            return;
        }

        // Вивід суми всіх чисел між A і B
        int sum = 0;
        for (int i = A + 1; i < B; i++) {
            sum += i;
        }
        System.out.println("Сума чисел в діапазоні від " + A + " до " + B + " складає: " + sum);

        System.out.println("------------------------------------");

        // Вивід всіх непарних чисел між A і B
        System.out.println("Вивід непарних чисел в діапазоні від " + A + " до " + B + ":");
        for (int i = A + 1; i < B; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " | ");
            }
        }
    }
}