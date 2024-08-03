package lesson_07;

import java.util.Scanner;

public class Calculator {

    static void calculate(int A, int B, int C) {
        double averageABC = ((A + B + C) / 3.0);
        System.out.println("Середнім арифметичним 3х чисел " + A + " | " + B + " | " + C + " дорівнює " + averageABC);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ПЕРШЕ число");
        int A = sc.nextInt();
        System.out.println("Введіть ДРУГЕ число");
        int B = sc.nextInt();
        System.out.println("Введіть ТРЕТЄ число");
        int C = sc.nextInt();
        calculate(A, B, C);
    }
}
