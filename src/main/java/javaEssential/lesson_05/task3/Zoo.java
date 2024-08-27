package javaEssential.lesson_06.task3;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        ArrayList<String> Zoo = new ArrayList<>();

        System.out.println("Розмір вихідного списку: " + Zoo.size());

        System.out.println("Вивід списку: " + Zoo);

        Zoo.add(0, "Лев");
        Zoo.add(1, "Тигр");
        Zoo.add(2, "Пума");
        Zoo.add(3, "Ягуар");
        Zoo.add(4, "Жираф");
        Zoo.add(5, "Зебра");
        Zoo.add(6, "Слон");
        Zoo.add(7, "Носоріг");
        Zoo.add(8, "Капібара");


        System.out.println(Zoo.size());

        System.out.println(Zoo);

        Zoo.remove(3);
        Zoo.remove(5);
        Zoo.remove(6);


        System.out.println(Zoo.size());

        System.out.println(Zoo);
    }
}
