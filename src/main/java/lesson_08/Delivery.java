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

//        Отже, які слабкості такого підходу? усміхаюсь

//При розрахуванні факторіалу числа !N методом рекурсії так як і опрацювання
//інших методів рекурсією  навантажується RAM память і збільшується час відпрацювання програми.
//Чим складніша рекурсі то тим більше необхідно виділяти для нього оперативної памяті.
//Це виникає тому що при рекурсії створюється тимчасова точна копія класу в якому відпрацьовується рекурсивний метод.
//При неправильному використанні може виникнути помилка Переповнення стеку , а також випадково можна зациклити в безкінечність метод.