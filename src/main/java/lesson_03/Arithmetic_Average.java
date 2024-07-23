package lesson_03;

import java.util.Scanner;

public class Arithmetic_Average {

    static double arithmeticAverageThirdNumbers(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перший операнд");
        double op1 = sc.nextDouble();
        System.out.println("Введіть другий операнд");
        double op2 = sc.nextDouble();
        System.out.println("Введіть третій операнд");
        double op3 = sc.nextDouble();

        System.out.println("Середнім арифтетичним значенням 3х чисел буде: " + arithmeticAverageThirdNumbers(op1, op2, op3));

    }


}
