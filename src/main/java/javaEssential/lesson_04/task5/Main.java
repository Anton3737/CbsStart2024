package javaEssential.lesson_06.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FarinhateToCelsius farinhateToCelsius = new FarinhateToCelsius();
        FarinhateToKelvin farinhateToKelvin = new FarinhateToKelvin();
        KelvinToFarinhate kelvinToFarinhate = new KelvinToFarinhate();
        KelvinToCelsius kelvinToCelsius = new KelvinToCelsius();
        CelsiusToFarinhate celsiusToFarinhate = new CelsiusToFarinhate();
        CelsiusToKelvin celsiusToKelvin = new CelsiusToKelvin();

        System.out.println("Оберіть один з 6ти пунктів конвертації:");
        System.out.println(
                "1. Цельсий   \uF0E0  Фаренгейт   [ Tf = Tc / 5 * 9 + 32 ] \n" +
                        "2. Цельсий   \uF0E0  Кельвин     [ Tk = Tc + 273.15 ] \n" +
                        "3. Фаренгейт \uF0E0  Цельсий     [ Tc = (Tf – 32) * 5 / 9 ] \n" +
                        "4. Фаренгейт \uF0E0  Кельвин     [ Tk = (Tf – 32) * 5 / 9 + 273.15] \n" +
                        "5. Кельвин   \uF0E0  Цельсий     [ Tc = Tk – 273.15 ] \n" +
                        "6. Кельвин   \uF0E0  Фаренгейт   [ Tf = (Tk – 273.15) * 9 / 5 + 32 ]  \n");

        switch (sc.nextByte()) {
            case 1:
                System.out.println("Цельсий \uF0E0 Фаренгейт");
                System.out.println("Введіть значення для конвертації!");
                celsiusToFarinhate.convert(sc.nextDouble());
                break;
            case 2:
                System.out.println("Цельсий \uF0E0 Кельвин");
                System.out.println("Введіть значення для конвертації!");
                celsiusToKelvin.convert(sc.nextDouble());
                break;
            case 3:
                System.out.println("Фаренгейт \uF0E0 Цельсий");
                System.out.println("Введіть значення для конвертації!");
                farinhateToCelsius.convert(sc.nextDouble());
                break;
            case 4:
                System.out.println("Фаренгейт \uF0E0 Кельвин");
                System.out.println("Введіть значення для конвертації!");
                farinhateToKelvin.convert(sc.nextDouble());
                break;
            case 5:
                System.out.println("Кельвин \uF0E0  Цельсий");
                System.out.println("Введіть значення для конвертації!");
                kelvinToCelsius.convert(sc.nextDouble());
                break;
            case 6:
                System.out.println("Кельвин \uF0E0  Фаренгейт");
                System.out.println("Введіть значення для конвертації!");
                kelvinToFarinhate.convert(sc.nextDouble());
                break;
        }
    }
}

