package javaEssential.lesson_04.task5;

public class KelvinToFarinhate implements ConverterTemperature {
    @Override
    public void convert(double value) {
        double F = (value - 273.15) * 9 / 5 + 32;
        System.out.println("Згідно формули Tf = (Tk – 273.15) * 9 / 5 + 32  конвертація з °K на °F становить: " + F);
    }
}
