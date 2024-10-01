package javaAdvanced.lesson08;

public class Task2 {

    public String ANSI_RESET = "\u001B[0m";
    public String ANSI_BLACK = "\u001B[30m";
    public String ANSI_RED = "\u001B[31m";
    public String ANSI_GREEN = "\u001B[32m";
    public String ANSI_YELLOW = "\u001B[33m";
    public String ANSI_BLUE = "\u001B[34m";
    public String ANSI_PURPLE = "\u001B[35m";
    public String ANSI_CYAN = "\u001B[36m";
    public String ANSI_WHITE = "\u001B[37m";



    public static void main(String[] args) {


        Thread first_thread = new Thread(new First());
        Thread second_thread = new Thread(new Second());
        Thread thrird_thread = new Thread(new Third());

        first_thread.start();
        second_thread.start();
        thrird_thread.start();


    }
}

class First extends Task2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(ANSI_GREEN + "@".repeat(40) + ANSI_RESET + i);

        }
        System.out.println("Завершено потік First");
    }
}

class Second extends Task2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(ANSI_CYAN + "@".repeat(40) + ANSI_RESET + i);
        }
        System.out.println("Завершено потік Second");
    }
}

class Third extends Task2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(ANSI_YELLOW + "@".repeat(40) + ANSI_RESET + i);

        }
        System.out.println("Завершено потік Third");

    }
}


//Завдання 2
//
//        Затримка потоку. Необхідно створити три потоки,
//        кожних із цих потоків запустити (наприклад: main, second, first),
//        і коли ці потоки успішно відпрацюють – вивести на екран повідомлення
//        (завершення потім first, second і main).