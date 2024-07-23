package lesson_04;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayMonth = sc.nextInt();

        if (dayMonth != 0) {
            if (dayMonth == 1) {
                System.out.println("Січень" + " - має " + 31 + " днів");
            }
            if (dayMonth == 2) {
                System.out.println("Лютий" + " - має " + 28 + " днів");
            }
            if (dayMonth == 3) {
                System.out.println("Березень" + " - має " + 31 + " днів");
            }
            if (dayMonth == 4) {
                System.out.println("Квітень" + " - має " + 30 + " днів");
            }
            if (dayMonth == 5) {
                System.out.println("Травень" + " - має " + 31 + " днів");
            }
            if (dayMonth == 6) {
                System.out.println("Червень" + " - має " + 30 + " днів");
            }
            if (dayMonth == 7) {
                System.out.println("Липень" + " - має " + 31 + " днів");
            }
            if (dayMonth == 8) {
                System.out.println("Серпень" + " - має " + 31 + " днів");
            }
            if (dayMonth == 9) {
                System.out.println("Вересень" + " - має " + 30 + " днів");
            }
            if (dayMonth == 10) {
                System.out.println("Жовтень" + " - має " + 31 + " днів");
            }
            if (dayMonth == 11) {
                System.out.println("Листопад" + " - має " + 30 + " днів");
            }
            if (dayMonth == 12) {
                System.out.println("Грудень" + " - має " + 31 + " днів");
            }
        } else {
            System.err.println("Такий місяць відсутній " + " Ви ввели " + dayMonth + " що не відповідає діапазону місяців від 1 до(<=) 12");
        }

    }
}
