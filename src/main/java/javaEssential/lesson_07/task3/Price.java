package javaEssential.lesson_07.task3;

import javaEssential.lesson_07.task2.Worker;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Price implements Comparable<Price> {

    String name;

    String market;

    double price;

    public Price(String name, String market, double price) {
        this.name = name;
        this.market = market;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "name='" + name + '\'' +
                ", market='" + market + '\'' +
                ", price=" + price +
                '}';
    }


    public static Price[] stuffDBBuildeer(Scanner scanner) {

        Price[] prices = new Price[5];

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Введіть назву магазину");
            String market = scanner.next();
            System.out.println("Введіть назву товару");
            String stuff = scanner.next();
            System.out.println("Введіть ціну товару");
            double price = scanner.nextDouble();

            prices[i] = new Price(market, stuff, price);

        }

        return prices;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Price[] prices = stuffDBBuildeer(scanner);

        Arrays.sort(prices);

        for (Price pc : prices) {
            System.out.println(pc);
        }


    }


    @Override
    public int compareTo(Price o) {
        return this.name.compareTo(o.name);
    }
}

//
//    Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з іменем Price, що містить такі поля:
//
//         назву товару;
//
//         назву магазину, в якому продається товар;
//
//         вартість товару у гривнях.
//
//        Написати програму, яка виконує такі дії:
//
//         введення з клавіатури даних до масиву, що складається з двох елементів типу Price (записи мають бути впорядковані в алфавітному порядку за назвами магазинів);
//
//         виведення на екран інформації про товари, що продаються в магазині, назва якого введена з клавіатури (якщо такого магазину немає, вивести виняток).