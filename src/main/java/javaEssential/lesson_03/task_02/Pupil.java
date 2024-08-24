package javaEssential.lesson_03.task_02;

public class Pupil {

    String name;
    String second_name;
    int age;
    String city;

    public Pupil(String name, String second_name) {
        this.name = name;
        this.second_name = second_name;
    }

    public Pupil(String name, String second_name, int age) {
        this.name = name;
        this.second_name = second_name;
        this.age = age;
    }

    public Pupil(String name, String second_name, int age, String city) {
        this.name = name;
        this.second_name = second_name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return
                "Ім'я: " + name +
                        ", Прізвище: " + second_name +
                        ", Вік: " + age +
                        ", Місто: " + city;
    }

    void study() {
    }

    void read() {
    }

    void write() {
    }

    void relax() {
    }
}
