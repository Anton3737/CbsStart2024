package javaAdvanced.lesson09;

public class ShoterField extends Thread {

    public ShoterField(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " ------- " + i);
        }
    }
}
