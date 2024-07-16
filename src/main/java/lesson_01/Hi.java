package lesson_01;

public class Hi {

    public static void main(String[] args) {
        String name = "Anton";
        String serName = "Barash";

        // sout  fields name and serName without new line  (.print)
        System.out.print("Ваше ім'я " + name);
        System.out.print("Ваше прізвище " + serName);

        System.out.println("\n" + "-".repeat(30));

        // sout  fields name and serName without new line  (.print)
        System.out.println("Ваше ім'я " + name);
        System.out.println("Ваше прізвище " + serName);
    }
}
