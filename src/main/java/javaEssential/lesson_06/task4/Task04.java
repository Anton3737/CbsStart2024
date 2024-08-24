package javaEssential.lesson_06.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Введіть елемент списку: " + i + " з " + "10");
            integerArrayList.add(sc.nextInt());
            System.out.println(integerArrayList);
        }

        Iterator<Integer> integerIterator = integerArrayList.iterator();

        while (integerIterator.hasNext()) {
            Integer integer = integerIterator.next();
            System.out.println(integer + 1);
        }
    }
}
