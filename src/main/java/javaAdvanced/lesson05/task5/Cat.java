package javaAdvanced.lesson05.task5;

import javaAdvanced.lesson07.task4.Locations;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "collector_cats")
public class Cat {

    @XmlElement(name = "animals")
    private List<Animal> animals = new ArrayList<>();

    public Cat() {
    }

    public void addition(Animal animal) {
        animals.add(animal);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(animals.toArray());
    }

//    public static void main(String[] args) {
//        try {
//            // Створюємо об'єкт класу Animal
//            Animal animal = new Animal("Англійський сірий", "Рижик", 12, "Рибка");
//
//            // Виводимо початкову інформацію
//            System.out.println("До зміни ");
//            animal.printInfoAboutAnimal();
//
//            // Отримуємо клас Animal
//            Class<?> animalClass = animal.getClass();
//
//
//            System.out.println("-".repeat(40));
//
//
//            // Доступ до публічного поля name
//            Field breadField = animalClass.getField("breed");
//            breadField.set(animal, "Сфінкс");
//
//            Field nameField = animalClass.getField("name");
//            nameField.set(animal, "Мурзік");
//
//            // Доступ до захищеного поля age
//            Field ageField = animalClass.getDeclaredField("age");
//            ageField.setAccessible(true); // Робимо поле доступним
//            ageField.set(animal, 13);
//
//            // Доступ до приватного поля favoriteFood
//            Field favoriteFoodField = animalClass.getDeclaredField("food");
//            favoriteFoodField.setAccessible(true); // Робимо поле доступним
//            favoriteFoodField.set(animal, "Курочка");
//
//            // Виводимо змінену інформацію
//            System.out.println("Після зміни:");
//            animal.printInfoAboutAnimal();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
