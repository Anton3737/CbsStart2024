package lesson_04;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
//         [0 – 14]
        byte a1 = 0;
        byte a2 = 14;

//         [15 – 35]
        byte b1 = 15;
        byte b2 = 35;

//        [36 – 50]
        byte c1 = 36;
        byte c2 = 50;

//        [51 – 100]
        byte d1 = 51;
        byte d2 = 100;


        Scanner sc = new Scanner(System.in);
        byte inputNumber = sc.nextByte();

        if (a1 <= inputNumber && inputNumber <= d2) {
            if (a1 <= inputNumber && inputNumber <= a2) {
                System.out.println("Введене вами число " + inputNumber + " відповідає діапазону [0 - 14 ]");
            }
            if (b1 <= inputNumber && inputNumber <= b2) {
                System.out.println("Введене вами число " + inputNumber + " відповідає діапазону [15 - 35]");
            }
            if (c1 <= inputNumber && inputNumber <= c2) {
                System.out.println("Введене вами число " + inputNumber + " відповідає діапазону [36 - 50]");
            }
            if (d1 <= inputNumber && inputNumber <= d2) {
                System.out.println("Введене вами число " + inputNumber + " відповідає діапазону [51 - 100]");
            }
        } else {
            System.err.println("Введене вами число " + inputNumber + " НЕ відповідає діапазону [0 - 100]");
        }
    }

}
