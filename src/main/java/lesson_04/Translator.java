package lesson_04;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input some word for translate");
        String tmp = sc.nextLine();

        switch (tmp) {
            case "Снігопад":
                System.out.println("Snowfall");
                break;
            case "Дош":
                System.out.println("Rain");
                break;
            case "Буря":
                System.out.println("Storm");
                break;
            case "Туман":
                System.out.println("Fog");
                break;
            case "Сонячно":
                System.out.println("Sunny");
                break;
            case "Гроза":
                System.out.println("Thunderstorm");
                break;
            case "Вітряно":
                System.out.println("Windy");
                break;
            case "Хмарно":
                System.out.println("Cloudy");
                break;
            case "Спека":
                System.out.println("Heat");
                break;
            case "Крижаний град":
                System.out.println("Hail");
                break;
            default:
                System.err.println("Введеного Вами слова не має в переліку");

        }
    }
}
