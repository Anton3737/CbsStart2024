package javaAdvanced.lesson09;

import java.util.List;

public class test3 {

    public static void main(String[] args) throws InterruptedException {

        Soldier sol1 = new Soldier("1");
        Soldier sol2 = new Soldier("2");
        Soldier sol3 = new Soldier("3");

        Thread thread1 = new Thread(sol1, "sol1");
        Thread thread2 = new Thread(sol2, "sol2");
        Thread thread3 = new Thread(sol3, "sol3");

        thread1.setPriority(4);
        thread2.setPriority(1);
        thread3.setPriority(10);



        thread3.start();
        thread3.join();

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();



    }

}
