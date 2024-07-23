package lesson_02;

import java.math.BigDecimal;

public class Task2 {

    public static void main(String[] args) {
        //Число Pi
        float Pi = 3.141592653f;
        // Число Ейлера
        double Euler = 2.7182818284590452;

        System.out.println("Якщо використовувати примітиви то втрата даних всерівно відбудеться:");

        System.out.println("Число Pi " + Pi);
        System.out.println("Число Ейлера " + Euler);


        System.out.println();

        System.out.println("Якщо використати бібліотеку math і створити екземпляр классу BigDecimal то ми зможемо вивести інформацію згідно завдання без втрат");

        BigDecimal PiNumb = new BigDecimal("3.141592653");
        BigDecimal EulerNumb = new BigDecimal("2.7182818284590452");

        System.out.println("Число Pi " + PiNumb);
        System.out.println("Число Ейлера " + EulerNumb);

    }


}
