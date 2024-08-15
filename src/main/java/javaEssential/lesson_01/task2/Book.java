package javaEssential.lesson_01.task2;

import java.util.Scanner;

public class Book {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cтворюємо 3 екземпляри похідних класів
        // За допомогою мeтоду SET присвоємо їм дані через сканер
        System.out.println("Введіть заголовок книги");
        Title bookTitle = new Title();
        bookTitle.setTitleOfBook(sc.nextLine());
        System.out.println("Хто є автором");
        Author bookAuthor = new Author();
        bookAuthor.setAuthorOfBook(sc.nextLine());
        System.out.println("Введіть трохи контенту книги");
        Content bookContent = new Content();
        bookContent.setContentOfBook(sc.nextLine());


        //Отримуємо присвоєний результат чреез вивід даним в методі show()
        System.out.println("********************************");
        System.out.println("Назва: ");
        bookTitle.show();
        System.out.println("Від автора: ");
        bookAuthor.show();
        System.out.println("Текст: ");
        bookContent.show();
        System.out.println("********************************");

    }

}
