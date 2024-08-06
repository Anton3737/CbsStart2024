package lesson_09;

import java.util.Scanner;

public class ReversedArray {

    static int[] myReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
        }
        return array;
    }


    static int[] subArray(int[] array, int index, int count) {
        int[] newArray = new int[count];
        System.out.println("\n Відпрацювання методу int[] subArray");
        for (int i = index; i < count; i++) {
            System.out.print(array[i] + " ");
//            System.arraycopy(array, 0, newArray, 0, array.length);
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            System.out.println("Введіть число яке бажаєте додати до масиву " + i + " /з " + array.length);
            array[i] = sc.nextInt();
        }

        for (int outArray : array) {
            System.out.print(outArray + " ");
        }

        myReverse(array);

        subArray(myReverse(array), 4, 20);


    }

}
