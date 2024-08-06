package lesson_09;

import java.util.Scanner;

public class CustomerArray {

    static int maxNumbOfArray(int[] inpArray) {

        int tmpMax = inpArray[0];

        for (int i = 0; i < inpArray.length; i++) {
            if (inpArray[i] > tmpMax)
                tmpMax = inpArray[i];
        }
        System.out.println("Максимальне значення масиву становить = " + tmpMax);

        return tmpMax;
    }


    static int minNumbOfArray(int[] inpArray) {

        int tmpMin = inpArray[0];

        for (int i = 0; i < inpArray.length; i++) {
            if (inpArray[i] < tmpMin)
                tmpMin = inpArray[i];
        }
        System.out.println("Мінімальне значення масиву становить = " + tmpMin);
        return tmpMin;
    }


    static int sumOfArray(int[] inpArray) {
        int tmpSum = 0;

        for (int i = 0; i < inpArray.length; i++) {
            tmpSum = tmpSum + inpArray[i];
        }
        System.out.println("Сумма чисел масиву складає = " + tmpSum );
        return tmpSum;
    }

    static double averageOfArray(int[] inpArray) {
        double tmpAvg = 0;

        for (int i = 0; i < inpArray.length; i++) {
            tmpAvg += inpArray[i];
        }
        tmpAvg = tmpAvg / inpArray.length;
        System.out.println("Розмір масиву складає = " + inpArray.length + " елементи");
        System.out.println("Середнє значення чисел масиву складає = " + tmpAvg);

        return tmpAvg;
    }

    static void parityOfArray(int[] inpArray) {
        System.out.println("Парними числами масиву є: ");
        for (int i = 0; i < inpArray.length; i++) {
            int tmpParity = 0;
            if (inpArray[i] % 2 == 0) {
                tmpParity += inpArray[i];
                System.out.print(tmpParity + " ");
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Внесіть кількість елементів масиву:");
        int numberOfArrayElement = sc.nextInt();

        int[] CustomerArray = new int[numberOfArrayElement];

        System.out.println("Довжина масиву складає: " + CustomerArray.length + " індексів");
        for (int i = 0; i < CustomerArray.length; i++) {
            System.out.println("Введіть число яке бажаєте додати до масиву " + i + " /з " + CustomerArray.length);
            CustomerArray[i] = sc.nextInt();
        }

        for (int array : CustomerArray) {
            System.out.print(array + " ");
        }
        System.out.println("-".repeat(30));


        maxNumbOfArray(CustomerArray);
        minNumbOfArray(CustomerArray);
        sumOfArray(CustomerArray);
        averageOfArray(CustomerArray);
        parityOfArray(CustomerArray);


    }
}
