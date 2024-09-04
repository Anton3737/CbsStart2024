package javaEssential.lesson_02.task4;

import java.util.ArrayList;

public class Car {

    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this(1900, 0.0, 100, "default");
    }

    public Car(int year) {
        this(year, 0.0, 100, "default");
    }


    public Car(int year, double speed) {
        this(year, speed, 100, "default");
    }


    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "default");
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

        Car car1 = new Car(1999);
        Car car2 = new Car(1999, 299);
        Car car3 = new Car(1999, 299, 1600);
        Car car4 = new Car(1999, 299, 1600, "Pink");

        ArrayList<Car> arrayList = new ArrayList<>();
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);
        arrayList.add(car4);


        System.out.println(arrayList);

    }

}

