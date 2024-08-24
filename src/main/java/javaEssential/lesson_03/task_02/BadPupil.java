package javaEssential.lesson_03.task_02;

public class BadPupil extends Pupil {

    public BadPupil(String name, String second_name) {
        super(name, second_name);
    }

    public BadPupil(String name, String second_name, int age) {
        super(name, second_name, age);
    }

    public BadPupil(String name, String second_name, int age, String city) {
        super(name, second_name, age, city);
    }

    @Override
    void study() {
        System.out.println("Навчається погано");
    }

    @Override
    void read() {
        System.out.println("Читає погано");
    }

    @Override
    void write() {
        System.out.println("Пише погано");
    }

    @Override
    void relax() {
        System.out.println("Відпочиває погано");
    }
}
