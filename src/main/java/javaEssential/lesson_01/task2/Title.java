package javaEssential.lesson_01.task2;

public class Title {
    private String titleOfBook;

    public Title() {
    }

    public Title(String titleOfBook) {
        this.titleOfBook = titleOfBook;
    }

    public String getTitleOfBook() {
        return titleOfBook;
    }

    public void setTitleOfBook(String titleOfBook) {
        this.titleOfBook = titleOfBook;
    }

    void show() {
        System.out.println(titleOfBook);
    }
}
