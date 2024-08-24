package javaEssential.lesson_03.Task_04;

public class ExpertDocumentWorker extends DocumentWorker {

    @Override
    public void openDocument() {
        super.openDocument();
    }

    @Override
    public void editDocument() {
        System.out.println("EXP");
        System.out.println("Документ відредаговано");
    }

    @Override
    public void saveDocument() {
        System.out.println("EXP");
        System.out.println("Документ збережено в новому форматі");
    }

}
