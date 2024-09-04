package javaEssential.lesson_02.task3;

import java.util.ArrayList;

public class Car {

    public int year;
    public double speed;
    public int weight;
    public String color;

    public Car() {

    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Car> carArrayList = new ArrayList<>();

        Car Nissan = new Car(1985);
        Car Mercedes = new Car(1991, 220, 1500);
        Car Audi = new Car(2022, 340);
        Car Lexus = new Car(1998, 250, 1300, "Pink");
        Car Toyota = new Car(1998, 520, 900, "White");


        carArrayList.add(Nissan);
        carArrayList.add(Mercedes);
        carArrayList.add(Audi);
        carArrayList.add(Lexus);
        carArrayList.add(Toyota);

        System.out.println(carArrayList);

    }
}
