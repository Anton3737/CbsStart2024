package lesson_03;

import java.util.Scanner;

public class Volume {

    static double volume(double r, double h) {

        final double PI = 3.14;

        double V = PI * ((r * r) * h);

        return V;
    }

    static double sqr(double r, double h) {

        final double PI = 3.14;

        double S = 2 * ((PI * r) * (h + r));

        return S;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть значення радіусу");
        double r = sc.nextDouble();
        System.out.println("Введіть значення висоти");
        double h = sc.nextDouble();


        System.out.println("Об'єму циліндру складає: " + volume(r, h));
        System.out.println("Площа поверхні циліндру складає: " + sqr(r, h));
    }
}
