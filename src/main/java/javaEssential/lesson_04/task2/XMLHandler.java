package javaEssential.lesson_04.task2;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Open XML document");
    }

    @Override
    void create() {
        System.out.println("Create XML document");
    }

    @Override
    void change() {
        System.out.println("Change XML document");
    }

    @Override
    void save() {
        System.out.println("Save XML document");
    }
}
