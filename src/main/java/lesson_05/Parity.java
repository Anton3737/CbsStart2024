package lesson_05;

import java.util.Scanner;

public class Parity {
    public static void if_elseMethod(int inputNumb) {
        if (inputNumb % 2 == 0) {
            System.out.println("Введене Вами число " + inputNumb + " являється Парним");
        } else {
            System.out.println("Введене Вами число " + inputNumb + " являється НЕпарним");
        }
    }

    public static void ternaryMethod(int inputNumb) {
//        Умова ? результат 1 : результат 2
        System.out.println(inputNumb % 2 == 0 ? "Введене Вами число " + inputNumb + " являється Парним" : "Введене Вами число " + inputNumb + " являється НЕпарним");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число для перевірки на парність");
        int inpOperand = sc.nextInt();

        if_elseMethod(inpOperand);

        System.out.println("-".repeat(20));

        ternaryMethod(inpOperand);
    }

}
