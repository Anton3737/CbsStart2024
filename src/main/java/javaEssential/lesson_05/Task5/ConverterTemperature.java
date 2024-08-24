package javaEssential.lesson_05.Task5;

import java.util.Scanner;

public class ConverterTemperature extends AbstractConvertMethods {

    @Override
    void CelsiusToKelvin(double temperature) {
        double K = temperature + 273.15;
        System.out.println("Згідно формули Tk = Tc + 273.15  конвертація з °С на °K становить: " + K);
    }

    @Override
    void CelsiusToFarinhate(double temperature) {
        double F = temperature / 5 * 9 + 35;
        System.out.println("Згідно формули Tf = Tc / 5 * 9 + 32  конвертація з °С на °F становить: " + F);
    }

    @Override
    void KelvinToCelsius(double temperature) {
        double C = temperature - 273.15;
        System.out.println("Згідно формули Tc = Tk – 273.15  конвертація з °K на °C становить: " + C);
    }

    @Override
    void KelvinToFarinhate(double temperature) {
        double F = (temperature - 273.15) * 9 / 5 + 32;
        System.out.println("Згідно формули Tf = (Tk – 273.15) * 9 / 5 + 32  конвертація з °K на °F становить: " + F);
    }

    @Override
    void FarinhateToKelvin(double temperature) {
        double K = (temperature - 32) * 5 / 9 + 273.15;
        System.out.println("Згідно формули Tk = (Tf – 32) * 5 / 9 + 273.15  конвертація з °F на °K становить: " + K);
    }

    @Override
    void FarinhateToCelsius(double temperature) {
        double C = (temperature - 32) * 5 / 9;
        System.out.println("Згідно формули Tc = (Tf – 32) * 5 / 9  конвертація з °F на °C становить: " + C);
    }

    public static void main(String[] args) {
        ConverterTemperature converterTemperature = new ConverterTemperature();
        Scanner sc = new Scanner(System.in);
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
                converterTemperature.CelsiusToKelvin(sc.nextDouble());
                break;
            case 2:
                System.out.println("Цельсий \uF0E0 Кельвин");
                System.out.println("Введіть значення для конвертації!");
                converterTemperature.CelsiusToFarinhate(sc.nextDouble());
                break;
            case 3:
                System.out.println("Фаренгейт \uF0E0 Цельсий");
                System.out.println("Введіть значення для конвертації!");
                converterTemperature.KelvinToCelsius(sc.nextDouble());
                break;
            case 4:
                System.out.println("Фаренгейт \uF0E0 Кельвин");
                System.out.println("Введіть значення для конвертації!");
                converterTemperature.KelvinToFarinhate(sc.nextDouble());
                break;
            case 5:
                System.out.println("Кельвин \uF0E0  Цельсий");
                System.out.println("Введіть значення для конвертації!");
                converterTemperature.FarinhateToCelsius(sc.nextDouble());
                break;
            case 6:
                System.out.println("Кельвин \uF0E0  Фаренгейт");
                System.out.println("Введіть значення для конвертації!");
                converterTemperature.FarinhateToKelvin(sc.nextDouble());
                break;
        }
    }
}
