package lesson_07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Conversion {

    static double conversion(double cashVar, double coverCash_var, double currencySales) {
        double conversion = (cashVar * currencySales) / coverCash_var;    // Основиний розрахунок між валютами

        return conversion;
    }

    public static void main(String[] args) {
        System.out.println("*( USD EUR GBP PLZ JPY CZK DKK ILS GEL HGD )* \n");

        HashMap<String, Double> myHashMap = new HashMap<>();
        myHashMap.put("USD", 36.5686);
        myHashMap.put("EUR", 40.4942);
        myHashMap.put("GBP", 46.0198);
        myHashMap.put("PLZ", 8.8253);
        myHashMap.put("JPY", 0.2721);
        myHashMap.put("CZK", 1.7265);
        myHashMap.put("DKK", 5.4356);
        myHashMap.put("ILS", 10.0535);
        myHashMap.put("GEL", 14.6673);
        myHashMap.put("HKD", 4.6594);

        for (Map.Entry<String, Double> entry : myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

        Scanner scannerData = new Scanner(System.in);
        System.out.println("Введіть суму для конвертації: ");
        double cashVar = scannerData.nextDouble();
        System.out.println("Введіть курс бажаної валюти з якої конвертуєте: ");
        double currencySales = scannerData.nextDouble();
        System.out.println("Введіть курс бажаної валюти на яку конвертуєте: ");
        double coverCash_var = scannerData.nextDouble();
        System.out.println("Сума " + cashVar + " при конверртації валюти з " + currencySales + " по курсу НБУ на курс валюти " + coverCash_var + " складає " + conversion(cashVar, coverCash_var, currencySales));


    }
}
