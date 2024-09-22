package javaAdvanced.lesson05.task5;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Animal")
public class Animal {
    private String breed;
    private String name;
    private int age;
    private String food;

    // Обов'язковий конструктор без параметрів для JAXB
    public Animal() {
    }

    public Animal(String breed, String name, int age, String food) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.food = food;
    }

    @XmlElement
    public String getBreed() {
        return breed;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public int getAge() {
        return age;
    }

    @XmlElement
    public String getFood() {
        return food;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void printInfoAboutAnimal() {
        System.out.println("\t" + "Breed: " + breed);
        System.out.println("\t" + "Name: " + name);
        System.out.println("\t" + "Age: " + age);
        System.out.println("\t" + "Food: " + food);
    }
}
