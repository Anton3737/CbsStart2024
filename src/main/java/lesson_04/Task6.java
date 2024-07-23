package lesson_04;

import java.util.Scanner;

public class Task6 {

    static int getMaxNumb(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int getMidNumb(int a, int b, int c) {
        int sum = a + b + c;
        return sum - getMaxNumb(a, b, c) - getMinNumb(a, b, c);
    }

    static int getMinNumb(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть перше число");
        int firstOp = sc.nextInt();
        System.out.println("Введіть друге число");
        int secondOp = sc.nextInt();
        System.out.println("Введіть третє число");
        int thirdOp = sc.nextInt();

        System.out.println("-".repeat(20));

        System.out.println("Отримуємо максимальне значення із 3х чисел та отримуємо: " + getMaxNumb(firstOp, secondOp, thirdOp));
        System.out.println("Отримуємо мінімальне значення із 3х чисел та отримуємо: " + getMinNumb(firstOp, secondOp, thirdOp));
        System.out.println("Отримуємо середнє значення із 3х чисел та отримуємо: " + getMidNumb(firstOp, secondOp, thirdOp));

    }
}


