package javaEssential.lesson_06.task5;

public class CelsiusToKelvin implements ConverterTemperature{
    @Override
    public void convert(double value) {
        double K = value + 273.15;
        System.out.println("Згідно формули Tk = Tc + 273.15  конвертація з °С на °K становить: " + K);
    }
}
