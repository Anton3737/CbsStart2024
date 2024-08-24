package javaEssential.lesson_03.task_02;

public class GoodPupil extends Pupil {


    public GoodPupil(String name, String second_name) {
        super(name, second_name);
    }

    public GoodPupil(String name, String second_name, int age) {
        super(name, second_name, age);
    }

    public GoodPupil(String name, String second_name, int age, String city) {
        super(name, second_name, age, city);
    }

    @Override
    void study() {
        System.out.println("Навчається нормально");
    }

    @Override
    void read() {
        System.out.println("Читає нормально");
    }

    @Override
    void write() {
        System.out.println("Пише нормально");
    }

    @Override
    void relax() {
        System.out.println("Відпочиває нормально");
    }
}
