package javaEssential.lesson_06.task2;

public class TXTHandler extends  AbstractHandler{
    @Override
    void open() {
        System.out.println("Open TXT document");

    }

    @Override
    void create() {
        System.out.println("Create TXT document");
    }

    @Override
    void change() {
        System.out.println("Change TXT document");
    }

    @Override
    void save() {
        System.out.println("Save TXT document");
    }
}
