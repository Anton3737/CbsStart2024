package javaAdvanced.lesson03.task2;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

public class Task2 {

    public void fileCreator(String inputToWrite) throws IOException {

        File file = new File("/Users/Anton/Downloads/CbsStart2024/src/main/java/javaAdvanced/lesson03/task2/File.txt");
        FileWriter fileWriter = new FileWriter(file, StandardCharsets.UTF_8);
        fileWriter.write(inputToWrite.toString());
        fileWriter.close();

    }

    public static String writerToFileMethood(String url) throws IOException {
        LocalDate localDate = LocalDate.now();

        StringBuilder stringBuilder = new StringBuilder();

        Connection connection = Jsoup.connect(url);

        Document document = connection.ignoreContentType(true).get();

        stringBuilder.append(document);

        return localDate + "\n " + stringBuilder;

    }


    public static void main(String[] args) throws IOException {

        Task2 task2 = new Task2();

        System.out.println("Запис даних у файл");
        String url = "https://jsonplaceholder.typicode.com/posts";
        task2.fileCreator(writerToFileMethood(url));


        System.out.println("-".repeat(40));


        System.out.println("Зчитування даних з файлу");
        FileReader fileReader = new FileReader("/Users/Anton/Downloads/CbsStart2024/src/main/java/javaAdvanced/lesson03/task2/File.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String temp;
        while ((temp = bufferedReader.readLine()) != null) {
            System.out.println(temp);
        }

    }
}

