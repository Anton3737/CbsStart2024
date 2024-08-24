package javaEssential.lesson_03.task_03;

public class Plane extends Vehicle {

    private int maxHeight;
    private int Passengers;

    public Plane(int price, int speed, int year, int maxHeight, int passengers) {
        super(price, speed, year);
        this.maxHeight = maxHeight;
        Passengers = passengers;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getPassengers() {
        return Passengers;
    }

    public void setPassengers(int passengers) {
        Passengers = passengers;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxHeight=" + maxHeight +
                ", Passengers=" + Passengers +
                '}';
    }
}