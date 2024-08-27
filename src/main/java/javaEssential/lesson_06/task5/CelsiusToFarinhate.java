package javaEssential.lesson_06.task5;

public class CelsiusToFarinhate implements ConverterTemperature{
    @Override
    public void convert(double value) {
        double F = value / 5 * 9 + 35;
        System.out.println("Згідно формули Tf = Tc / 5 * 9 + 32  конвертація з °С на °F становить: " + F);
    }
}
