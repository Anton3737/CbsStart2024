package lesson_09;

import java.util.Scanner;

public class UserArray {

    static void MethodAddOneElement(int[] intArray) {
        int[] newArray = new int[intArray.length + 1];
        System.out.println("розмір = " + intArray.length);
        for (int i = 0; i < intArray.length; i++) {
            newArray[i] = intArray[i];
        }
        for (int ResArray : newArray) {
            System.out.println(ResArray);
        }
    }

    static void Method1(int[] intArray, int value) {
        int[] newArray = new int[intArray.length + 1];
        newArray[0] = value;
        System.arraycopy(intArray, 0, newArray, 1, intArray.length);
        System.out.println("Розмір масиву: " + newArray.length);
        for (int arr : newArray) {
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оголосіть розмір масиву");
        int[] intArray = new int[scanner.nextInt()];
        System.out.println("Вихідни масив розміром = " + intArray.length);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Оголосіть елементи масиву по індексу:" + i);
            intArray[i] = scanner.nextInt();
        }

        MethodAddOneElement(intArray);

        Method1(intArray, 99);


    }
}
