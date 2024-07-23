package lesson_04;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше значення");
        double op1 = sc.nextDouble();
        System.out.println("Введіть символ операції");
        String sign = sc.next();
        System.out.println("Введіть друге значення");
        double operand2 = sc.nextDouble();


        switch (sign) {
            case "+":
                double resAdd = op1 + operand2;
                System.out.println(resAdd);
                break;

            case "-":
                double resSub = op1 - operand2;
                System.out.println(resSub);
                break;

            case "*":
                double resMul = op1 * operand2;
                System.out.println(resMul);
                break;
            case "/":
                if (operand2 == 0) {
                    System.err.println("Хибна операція ,ділити на 0 не можна !!!");
                } else {
                    double resSiv = op1 / operand2;
                    System.out.println(resSiv);
                }
                break;
        }
    }
}
