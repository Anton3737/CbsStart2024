package javaAdvanced.lesson02;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static LinkedList<Integer> getIntegerList(Scanner scanner, int size) {
        LinkedList<Integer> list = new LinkedList<>();
        while (list.size() != size) {
            list.add(scanner.nextInt());
            System.out.println(list);
        }
        return list;
    }


    public static int getMinimum(LinkedList<Integer> list) {
        int minNumber = list.get(0);
        for (int min : list) {
            if (min < minNumber) {
                minNumber = min;
            }
        }
        return minNumber;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть розмір списку");
        int size = sc.nextInt();
        System.out.println("Розмір колекції буде = " + size + " елементів");
        LinkedList<Integer> list = getIntegerList(sc, size);

        System.out.println("Мінімальне число з кдекції становить " + getMinimum(list));

    }
}
