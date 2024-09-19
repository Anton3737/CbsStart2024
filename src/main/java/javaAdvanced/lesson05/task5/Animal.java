package javaAdvanced.lesson05.task5;

public class Animal {

    public String name;
    protected int age;
    private String food;

    public Animal(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public void printInfoAboutAnimal() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("food: " + food);
    }


}
