package lesson_08;

import java.util.Scanner;

public class Bank {

    static void bankMethod() {
        int result = 0;
        int tmp;
        int credit = 700;
        int paymentCount = 0;

        Scanner sc = new Scanner(System.in);

        while (paymentCount < 7 && result < credit) {
            System.out.print("Введіть суму платежу: ");
            tmp = sc.nextInt();
            result += tmp;
            paymentCount++;
            System.out.println("Поточна сума внеску складає " + result);

            int overPay = result - credit;
            System.out.println("Внесено " + paymentCount + "й платіж.");
            if (result >= credit) {
                System.out.println("Кредит повністю погашено!");
                if (overPay > 0) {
                    System.out.println("Переплата становить: " + overPay);
                }
                break;
            } else {
                System.out.println("Залишок боргу: " + (credit - result));
            }
        }

        if (result < credit) {
            System.out.println("Кредит не погашено. Залишок боргу: " + (credit - result));
        }

        sc.close();
    }


    public static void main(String[] args) {
        bankMethod();
    }
}
