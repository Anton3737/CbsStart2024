package couseProjectTasksJavaStarter;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {


    // Метод що використовує регулярний вираз
    static int getSummaryOfAnyNumb(String inputNumb) {
        int count = 0;
        String regex = "^[0-9]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputNumb);


        if (matcher.matches()) {
            for (int i = 0; i < inputNumb.length(); i++) {
                count += Integer.parseInt(String.valueOf(inputNumb.charAt(i)));
                System.out.println(count);
            }
        } else {
            System.out.println("Input data doesn't valid");
            return count;
        }

        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внесіть будь-яке номерне значення для отримання суму із його цифр: ");
        System.out.println(getSummaryOfAnyNumb(scanner.next()));
    }
}


//Завдання 1
//Напишіть метод, який приймає число та повертає суму цифр цього числа.