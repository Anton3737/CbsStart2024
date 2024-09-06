package javaAdvanced.lesson01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("Mercedes");
        stringList.add("BMW");
        stringList.add("Audi");
        stringList.add("Nissan");
        stringList.add("Honda");
        stringList.add("Toyota");
        stringList.add("Lexus");
        stringList.add("Ford");
        stringList.add("Mercury");
        stringList.add("Lincoln");

        System.out.println(stringList);

        System.out.println("_".repeat(90));

        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}

