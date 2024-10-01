package javaAdvanced.lesson09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        List<Byte> integerList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            integerList.add((byte) random.nextInt());
        }

        System.out.println(integerList);


        int sumSqrt = integerList.stream().map(i -> i * i).reduce(0, Integer::sum);

        System.out.println(sumSqrt);

    }
}
