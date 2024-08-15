package javaEssential.lesson_01.task2;

public class Content {

    private static String contentOfBook;

    public Content() {
    }

    public Content(String contentOfBook) {
        this.contentOfBook = contentOfBook;
    }

    public String getContentOfBook() {
        return contentOfBook;
    }

    public void setContentOfBook(String contentOfBook) {
        this.contentOfBook = contentOfBook;
    }

    void show() {
        System.out.println(contentOfBook);
    }
}
