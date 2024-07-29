package lesson_06;

import java.util.Scanner;

public class FactorMethod {

    static void FactorMethod() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N >= 1) {
            int factorial = 1;
            double tmp = 1;
            for (int i = 0; i < N; i++) {
                factorial += i;
                tmp += (1.0 / (factorial));
                System.out.println(tmp);
            }
        } else if (N <= 0) {
            System.out.println("Введене значення не має бути меншим або дорівнювати 0");
        }
    }

    public static void main(String[] args) {
        FactorMethod();
    }

}
