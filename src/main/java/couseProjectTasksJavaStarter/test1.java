package couseProjectTasksJavaStarter;

public class test1 {

    static boolean palindrom(int number) {
        int inputNumber = number;
        int originalNumber = inputNumber;
        int reversNumber = 0;


        while (inputNumber > 0) {

            reversNumber = reversNumber * 10 + inputNumber % 10;
            inputNumber /= 10;

        }
        return originalNumber == reversNumber;
    }

    public static void main(String[] args) {

        boolean palind = palindrom(12341);

        if (palind) {
            System.out.println("Паліндром");
        } else {
            System.out.println("НЕ є паліндром");
        }


    }
}
