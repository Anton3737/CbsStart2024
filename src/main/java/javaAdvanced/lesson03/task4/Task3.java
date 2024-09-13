package javaAdvanced.lesson03.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {

    public static String readFileMethood(String src) throws IOException {

        FileReader fileReader = new FileReader(src);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder stringBuilder = new StringBuilder();

        String temp;
        while ((temp = bufferedReader.readLine()) != null) {
            System.out.println(temp);
            stringBuilder.append(temp).append("\n");
        }

        bufferedReader.close();
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        String fileSrc = "/Users/Anton/Downloads/CbsStart2024/src/main/java/javaAdvanced/lesson03/task4/task3File.txt";

        System.out.println(readFileMethood(fileSrc));
    }
}
