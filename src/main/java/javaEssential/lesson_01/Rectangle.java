package javaEssential.lesson_01;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Rectangle {


    public double side1;
    public double side2;


    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    static double areaCalculatorWithObject(Rectangle MostOfTheBestRectangle) {
        double areaCalc = MostOfTheBestRectangle.side1 * MostOfTheBestRectangle.side2;
        return areaCalc;
    }

    static double perimeterCalculatorWithObject(Rectangle MostOfTheBestRectangle) {
        double perimeterCalc = pow(MostOfTheBestRectangle.side1, 2) + pow(MostOfTheBestRectangle.side2, 2);
        return perimeterCalc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle MostOfTheBestRectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());

        System.out.println("Площа " + areaCalculatorWithObject(MostOfTheBestRectangle));
        System.out.println("Периметр " + perimeterCalculatorWithObject(MostOfTheBestRectangle));


    }
}
