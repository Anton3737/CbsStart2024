package lesson_03;

import java.util.Scanner;

public class Circle {

    public static double getSqrCircle(double r) {

        final double PI = Math.PI;

        double S = (PI * (r * r));

        return S;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        System.out.println("Площа кола з радіусом " + r + " становить " + getSqrCircle(r));
    }


}
