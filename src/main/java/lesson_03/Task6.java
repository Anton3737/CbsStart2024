package lesson_03;

import java.util.Scanner;

public class Task6 {

    static int addMethod(int a, int b) {
        return a + b;
    }

    static int subMethod(int a, int b) {
        return a - b;
    }

    static int mulMethod(int a, int b) {
        return a * b;
    }

    static String divMethod(double a, double b) {
        if (b != 0) {
            double res = a / b;
            return String.valueOf(res);
        } else return "Division by ZERO";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше значення:");
        int operandA = sc.nextInt();
        System.out.println("Введіть друге значення:");
        int operandB = sc.nextInt();


        System.out.println("Результатом додавання є: " + addMethod(operandA, operandB));
        System.out.println("Результатом віднімання є: " + subMethod(operandA, operandB));
        System.out.println("Результатом множення є: " + mulMethod(operandA, operandB));
        System.out.println("Результатом ділення є: " + divMethod(operandA, operandB));

    }
}
