package javaEssential.lesson_06.task2;

public class Main {
    public static void main(String[] args) {
        AbstractHandler xmlHandler = new XMLHandler();
        AbstractHandler txtHandler = new TXTHandler();
        AbstractHandler docHandler = new DOCHandler();

        System.out.println("XML HAndler");
        xmlHandler.open();
        xmlHandler.create();
        xmlHandler.change();
        xmlHandler.save();
        System.out.println("-".repeat(40)+"\n");

        System.out.println("TXT HAndler");
        txtHandler.open();
        txtHandler.create();
        txtHandler.change();
        txtHandler.save();
        System.out.println("-".repeat(40)+"\n");

        System.out.println("DOC HAndler");
        docHandler.open();
        docHandler.create();
        docHandler.change();
        docHandler.save();
        System.out.println("-".repeat(40)+"\n");


    }
}
