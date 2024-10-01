package javaAdvanced.lesson08.task5;

public class Task5 {
    public static void main(String[] args) {

        ThreadClass1 resourceA = new ThreadClass1();
        ThreadClass2 resourceB = new ThreadClass2();

        // Потік 1: блокує ResourceA і намагається отримати доступ до ResourceB
        Thread thread1 = new Thread(() -> resourceA.methodA(resourceB), "Thread-1");

        // Потік 2: блокує ResourceB і намагається отримати доступ до ResourceA
        Thread thread2 = new Thread(() -> resourceB.methodA(resourceA), "Thread-2");

        // Запуск потоків
        thread1.start();
        thread2.start();
    }

}


class ThreadClass1 {
    public synchronized void methodA(ThreadClass2 b) {
        System.out.println(Thread.currentThread().getName() + " locked ThreadClass1");

        try {
            // Затримка для імітації тривалого процесу
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " trying to lock ResourceB...");
        b.methodB(); // Спроба заблокувати ResourceB
    }

    public synchronized void methodB() {
        System.out.println(Thread.currentThread().getName() + " locked ResourceA in methodB");
    }
}

class ThreadClass2 {
    public synchronized void methodA(ThreadClass1 a) {
        System.out.println(Thread.currentThread().getName() + " locked ThreadClass2");

        try {
            // Затримка для імітації тривалого процесу
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " trying to lock ResourceA...");
        a.methodB(); // Спроба заблокувати ResourceA
    }

    public synchronized void methodB() {
        System.out.println(Thread.currentThread().getName() + " locked ResourceB in methodB");
    }
}