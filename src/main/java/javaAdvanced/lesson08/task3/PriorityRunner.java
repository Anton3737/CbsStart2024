package javaAdvanced.lesson08.task3;

public class PriorityRunner {
    public static void main(String[] args) {

        PriorityThread minPriority = new PriorityThread("MinPriority");
        PriorityThread maxPriority = new PriorityThread("MaxPriority");
        PriorityThread midPriority = new PriorityThread("NormPriority");

        minPriority.setPriority(Thread.MIN_PRIORITY);
        maxPriority.setPriority(Thread.MAX_PRIORITY);
        midPriority.setPriority(Thread.NORM_PRIORITY);

        minPriority.start();
        maxPriority.start();
        midPriority.start();
    }
}