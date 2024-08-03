package lesson_07;

import java.util.Scanner;

public class NumbersCheck {

    static void inputNumberHigherThenZero(double inputNumber) {
        if (inputNumber > 0) {
            System.out.println("Введене число є додатнім і має значення що > 0");
        } else if (inputNumber < 0) {
            System.err.println("Введене число є від'ємним і має значення що < 0");
        } else if (inputNumber == 0) {
            System.out.println("Введене число є рівним 0");
        }
    }

    static void naturalNumber(double inputNumber) {
        if (inputNumber > 1) {
            for (int i = 2; i < inputNumber; i++) {
                if (inputNumber % 2 == 0 || inputNumber % 1 == inputNumber) {
                    System.out.println("Число не є простим");
                    break;
                } else {
                    System.out.println("Число просте");
                    break;
                }
            }
        } else {
            System.out.println("Число менше 1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inputNumber = sc.nextDouble();

        inputNumberHigherThenZero(inputNumber);

        naturalNumber(inputNumber);
    }


}
