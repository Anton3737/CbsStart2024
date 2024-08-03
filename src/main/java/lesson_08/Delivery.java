package lesson_08;

import java.util.Scanner;

public class Delivery {

    static int deliveryMethod(int clients) {
        if (clients <= 1) {
            return 1;
        } else
            return clients * deliveryMethod(clients - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Внесіть кількість клієнтів:");
        int clients = sc.nextInt();

        int factResult = deliveryMethod(clients);
        System.out.println("Існує: " + factResult + " імовірностей маршрутів доставки для " + clients + " клієнтів.");
    }
}
