package lesson_06;

import java.util.Scanner;

public class Delivery {

    public static void Delivery() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть кількість замовників:");
        int factorial = 1;
        int N = sc.nextInt();
        do {
            factorial = factorial * N --;
        } while (N > 0);
        System.out.println("Число маршрутів для 1 авто , складає: " +  factorial);
    }


    public static void main(String[] args) {
        Delivery();
    }
}
