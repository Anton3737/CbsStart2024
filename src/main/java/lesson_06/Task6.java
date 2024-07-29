package lesson_06;

import java.util.Scanner;

public class Task6 {
    static void factorMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ціле число N (> 0):");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Error");
            return;
        }

        double sum = 1.0; // Початкова сума включає перший доданок 1
        int factorial = 1; // Початковий факторіал 1 (тобто 0! = 1)

        for (int i = 1; i <= N; i++) {
            factorial *= i; // Обчислюємо i!
            sum += 1.0 / factorial; // Додаємо 1/i! до суми
        }

        System.out.printf("Сума ряду для N = %d становить: %.6f%n", N, sum);
    }


    public static void main(String[] args) {
        factorMethod();
    }
}
