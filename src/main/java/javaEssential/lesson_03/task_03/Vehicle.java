package javaEssential.lesson_03.task_03;

public class Vehicle {

    private int price;
    private int speed;
    private int year;

    public Vehicle(int price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
