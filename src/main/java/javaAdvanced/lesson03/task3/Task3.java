package javaAdvanced.lesson03.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/Users/Anton/Downloads/CbsStart2024/src/main/java/javaAdvanced/lesson03/task3/Task3Test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder stringBuilder = new StringBuilder();
        String temp;

        while ((temp = bufferedReader.readLine()) != null) {
            stringBuilder.append(temp).append("\n");
        }

        bufferedReader.close();
        fileReader.close();

        String fileContent = stringBuilder.toString();

        int midLength = fileContent.length() / 2;

        String firstHalf = fileContent.substring(0, midLength);
        String secondHalf = fileContent.substring(midLength);

        System.out.println("Розмір: " + fileContent.length());
        System.out.println("Перша частина:\n" + firstHalf);
        System.out.println("-".repeat(40));
        System.out.println("Друга частина:\n" + secondHalf);
    }

}
