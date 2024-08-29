package javaEssential.lesson_04.task5;

public class KelvinToCelsius implements ConverterTemperature{
    @Override
    public void convert(double value) {
        double C = value - 273.15;
        System.out.println("Згідно формули Tc = Tk – 273.15  конвертація з °K на °C становить: " + C);
    }
}
