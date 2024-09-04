package javaEssential.lesson_02.task5;

public class MyArea {

    final static double PI = Math.PI;


    static double areaOfCircle(double r) {
        double S = PI * r * r;
        return S;
    }

    public static void main(String[] args) {

        System.out.println("Площа кола " + areaOfCircle(2));
        System.out.println("Площа кола " + areaOfCircle(5));
        System.out.println("Площа кола " + areaOfCircle(12));
        System.out.println("Площа кола " + areaOfCircle(112));
        System.out.println("Площа кола " + areaOfCircle(74));

    }

}
