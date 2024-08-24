package javaEssential.lesson_03.Task_04;

public class ProDocumentWorker extends DocumentWorker {
    @Override
    public void openDocument() {
        super.openDocument();
    }

    @Override
    public void editDocument() {
        System.out.println("PRO");
        System.out.println("Документ відредаговано");
    }

    @Override
    public void saveDocument() {
        System.out.println("PRO");
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт");
    }
}
