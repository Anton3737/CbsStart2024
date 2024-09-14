package javaAdvanced.lesson04.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Decoder {

    public static void decodeMyText(String inputUrl, String outputUrl) throws IOException {
        FileReader fileReader = new FileReader(inputUrl);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter(outputUrl);


        String temp;
        while ((temp = bufferedReader.readLine()) != null) {
            temp = temp.replaceAll("на|в|з|до|за|по|при|під|через|після|без", "Java");
            fileWriter.write(temp + "\n");
        }

        bufferedReader.close();
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        String inputUrl = "/Users/Anton/Downloads/CbsStart2024/src/main/java/javaAdvanced/lesson03/task4/task3File.txt";
        String outputUrl = "/Users/Anton/Downloads/CbsStart2024/src/main/java/javaAdvanced/lesson04/task2/task3FileDecode.txt";


        decodeMyText(inputUrl, outputUrl);
    }

}
