package javaEssential.lesson_06.task5;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {

    public static void main(String[] args) {

        ArrayList<String> FriendsList = new ArrayList<>();

        FriendsList.add("Катерина");
        FriendsList.add("Яніна");
        FriendsList.add("Оксана");
        FriendsList.add("Ельвіра");
        FriendsList.add("Еліна");
        FriendsList.add("Марія");
        FriendsList.add("Ніна");
        FriendsList.add("Анастасія");
        FriendsList.add("Любов");
        FriendsList.add("Валентина");
        FriendsList.add("Барбара");


        System.out.println(FriendsList);

        //Використовуємо клас Колекція де є реалізовані перевизначені методи Compare та Comparable
        // Сортуємо список за алфавітом
        Collections.sort(FriendsList);


        System.out.println(FriendsList);

    }
}
