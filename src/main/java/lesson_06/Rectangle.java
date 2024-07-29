package lesson_06;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть Висоту");
        int height = sc.nextInt();
        System.out.println("Введіть Ширину");
        int wight = sc.nextInt();

        System.out.println("Прямокутник зі сторонами: " + "Висота - " + height + " та " + "Ширина " + wight + "\n");

        if (height != 0 | height > 0) {
            System.out.println("Висота приймається !");
            if (wight != 0 | wight > 0) {
                System.out.println("Ширина приймається !");
                System.out.println("Результат" + "\n");

                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < wight; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.print("\n");
            } else {
                System.err.println("Умова ширини має бути більше ніж 0");
            }
        } else {
            System.err.println("Умова висоти має бути більше ніж 0");
        }

    }
}
