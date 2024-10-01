package javaAdvanced.lesson09;

public class Soldier implements Runnable{

    private String name;

    public Soldier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Стріляю" + this.name + " " + Thread.currentThread().getName());

        }
        System.out.println("Відстрілявся");
    }


}
