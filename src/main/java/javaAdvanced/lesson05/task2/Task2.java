package javaAdvanced.lesson05.task2;

import javaAdvanced.lesson05.extracurricular.HtmlParser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Task2 {

    public static void printClassInfo(Class<?> clazz) {
        // Виводимо ім'я класу
        System.out.println("Class: " + clazz.getName());

        // Виводимо поля класу
        System.out.println("\nFields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // Виводимо методи класу
        System.out.println("\nMethods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        // Виводимо конструктори класу
        System.out.println("\nConstructors:");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }

    public static void main(String[] args) {
        // Передаємо клас HtmlParser
        Class<?> htmlParserClass = HtmlParser.class;

        // Виводимо інформацію про клас HtmlParser
        printClassInfo(htmlParserClass);
    }
}
