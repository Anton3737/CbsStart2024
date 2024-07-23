package lesson_04;

import java.util.Scanner;

public class Task5 {

    static int ifNumberIsPositiveOrNot(int inputNumber) {
        if (inputNumber > 0) {
            return ++inputNumber;
        } else {
            return inputNumber - 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число для відпрацювання методу");
        System.out.println(ifNumberIsPositiveOrNot(sc.nextInt()));
    }
}

