package javaEssential.lesson_01.task2;

public class Author {

    private String authorOfBook;

    public Author() {
    }

    public Author(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    void show() {
        System.out.println(authorOfBook);
    }
}
