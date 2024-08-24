package javaEssential.lesson_03.task_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle ship01 = new Ship(1300, 72, 2013, 3700, "Одеса");
        Vehicle ship02 = new Ship(1500, 80, 2015, 4200, "Миколаїв");

        vehicles.add(ship01);
        vehicles.add(ship02);

        Vehicle plane01 = new Plane(520, 410, 2007, 2200, 150);
        Vehicle plane02 = new Plane(600, 430, 2012, 2500, 180);

        vehicles.add(plane01);
        vehicles.add(plane02);

        Vehicle vehicle01 = new Vehicle(345, 75, 2002);
        Vehicle vehicle02 = new Vehicle(400, 80, 2010);

        vehicles.add(vehicle01);
        vehicles.add(vehicle02);

        Vehicle car01 = new Car(12000, 340, 2017, "Pink", "Mercedes");
        Vehicle car02 = new Car(15000, 350, 2019, "Black", "BMW");

        vehicles.add(car01);
        vehicles.add(car02);

        System.out.println(vehicles);

    }
}
