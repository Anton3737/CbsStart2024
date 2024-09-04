package javaEssential.lesson_08.task5;

import java.util.Objects;

public class Animal {

    private String name;

    private int yearOld;

    private boolean tail;

    public Animal(String name, int yearOld, boolean tail) {
        this.name = name;
        this.yearOld = yearOld;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name + ", вік: " + yearOld + ", хвіст: " + tail;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return getYearOld() == animal.getYearOld() && isTail() == animal.isTail() && Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYearOld(), isTail());
    }


    public static void main(String[] args) {

        Animal[] animals = new Animal[10];

        animals[0] = new Animal("Lion", 5, true);
        animals[1] = new Animal("Elephant", 10, false);
        animals[2] = new Animal("Giraffe", 7, true);
        animals[3] = new Animal("Zebra", 4, true);
        animals[4] = new Animal("Kangaroo", 3, true);
        animals[5] = new Animal("Panda", 8, false);
        animals[6] = new Animal("Tiger", 6, true);
        animals[7] = new Animal("Bear", 9, true);
        animals[8] = new Animal("Wolf", 4, true);
        animals[9] = new Animal("Penguin", 2, false);

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
