package javaAdvanced.lesson05.task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Task3 {

    public String test = "test Field";
    private String test1 = "test Field private";
    protected String test2 = "test Field protected";
    public int test3 = 123456;
    private double test4 = 3.124325342534;
    protected boolean test5 = true;


    public Task3(String test, String test1, String test2, int test3, double test4, boolean test5) {
        this.test = test;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
        this.test4 = test4;
        this.test5 = test5;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public int getTest3() {
        return test3;
    }

    public void setTest3(int test3) {
        this.test3 = test3;
    }

    public double getTest4() {
        return test4;
    }

    public void setTest4(double test4) {
        this.test4 = test4;
    }

    public boolean isTest5() {
        return test5;
    }

    public void setTest5(boolean test5) {
        this.test5 = test5;
    }


    public static void main(String[] args) {

        Class<?> cr = Task3.class;

        // Виводимо ім'я класу
        System.out.println("Class: " + cr.getName());

        // Виводимо поля класу
        System.out.println("\nFields:");
        Field[] fields = cr.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("\t" + field);
        }

        // Виводимо методи класу
        System.out.println("\nMethods:");
        Method[] methods = cr.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("\t" + method);
        }

        // Виводимо конструктори класу
        System.out.println("\nConstructors:");
        Constructor<?>[] constructors = cr.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("\t" + constructor);
        }


    }
}
