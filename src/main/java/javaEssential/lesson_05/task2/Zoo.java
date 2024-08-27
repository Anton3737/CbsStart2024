package javaEssential.lesson_05.task2;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {
         ArrayList<String> Zoo = new ArrayList<>();

         Zoo.add(0, "Лев");
        Zoo.add(1, "Тигр");
        Zoo.add(2, "Пума");
        Zoo.add(3, "Ягуар");
        Zoo.add(4, "Жираф");
        Zoo.add(5, "Зебра");
        Zoo.add(6, "Слон");
        Zoo.add(7, "Носоріг");
        Zoo.add(8, "Капібара");

         System.out.println("Розмір колекції " + Zoo.size());
         System.out.println(Zoo);
    }
}
