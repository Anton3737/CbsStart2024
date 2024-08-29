package javaEssential.lesson_04.task2;

public class DOCHandler extends  AbstractHandler{
    @Override
    void open() {
        System.out.println("Open DOC document");

    }

    @Override
    void create() {
        System.out.println("Create DOC document");
    }

    @Override
    void change() {
        System.out.println("Change DOC document");
    }

    @Override
    void save() {
        System.out.println("Save DOC document");
    }
}
