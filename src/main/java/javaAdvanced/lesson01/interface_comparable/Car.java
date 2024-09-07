package javaAdvanced.lesson01.interface_comparable;

public class Car implements Comparable<Car> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }


    @Override
    public int compareTo(Car o) {

        int tmpNumb;

        tmpNumb = Integer.compare(this.speed, o.speed);
        if (tmpNumb == 0) {

            tmpNumb = Integer.compare(this.price, o.price);

            if (tmpNumb == 0) {

                tmpNumb = this.color.compareTo(o.color);

                if (tmpNumb == 0) {

                    return this.model.compareTo(o.model);
                }

            }
        }

        return tmpNumb;
    }

}