package javaEssential.lesson_03.task_02;

public class ExcelentPupil extends Pupil {

    public ExcelentPupil(String name, String second_name) {
        super(name, second_name);
    }

    public ExcelentPupil(String name, String second_name, int age) {
        super(name, second_name, age);
    }

    public ExcelentPupil(String name, String second_name, int age, String city) {
        super(name, second_name, age, city);
    }

    @Override
    void study() {
        System.out.println("Навчається чудово");
    }

    @Override
    void read() {
        System.out.println("Читає чудово");
    }

    @Override
    void write() {
        System.out.println("Пише чудово");
    }

    @Override
    void relax() {
        System.out.println("Відпочиває чудово");
    }
}
