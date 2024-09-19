package javaAdvanced.lesson05.task5;

import java.lang.reflect.Field;

public class Cat {

    public static void main(String[] args) {
        try {
            // Створюємо об'єкт класу Animal
            Animal animal = new Animal("Tom", 12, "Fish");

            // Виводимо початкову інформацію
            System.out.println("До зміни ");
            animal.printInfoAboutAnimal();

            // Отримуємо клас Animal
            Class<?> animalClass = animal.getClass();

            // Доступ до публічного поля name
            Field nameField = animalClass.getField("name");
            nameField.set(animal, "Murzik");

            // Доступ до захищеного поля age
            Field ageField = animalClass.getDeclaredField("age");
            ageField.setAccessible(true); // Робимо поле доступним
            ageField.set(animal, 13);

            // Доступ до приватного поля favoriteFood
            Field favoriteFoodField = animalClass.getDeclaredField("food");
            favoriteFoodField.setAccessible(true); // Робимо поле доступним
            favoriteFoodField.set(animal, "Chicken");

            // Виводимо змінену інформацію
            System.out.println("\nПісля зміни:");
            animal.printInfoAboutAnimal();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
