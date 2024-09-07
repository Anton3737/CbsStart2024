package javaAdvanced.lesson01.interface_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Black");
        Car c2 = new Car(190, 8000, "Opel", "Black");
        Car c3 = new Car(190, 9000, "Mercedes", "Black");
        Car[] c = {c1, c2, c3};

        Arrays.sort(c);

        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}


