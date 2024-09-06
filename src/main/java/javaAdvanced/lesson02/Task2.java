package javaAdvanced.lesson02;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static ArrayList<String> doubleValues(ArrayList<String> words) {
        ArrayList<String> doubledWords = new ArrayList<>();

        for (String word : words) {
            doubledWords.add(word);
            doubledWords.add(word);
        }

        return doubledWords;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            words.add(scanner.next());
        }

        ArrayList<String> doubledWords = doubleValues(words);

        for (String word : doubledWords) {
            System.out.println(word);
        }
    }
}
