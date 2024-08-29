package javaEssential.lesson_04.task3;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Play music");
    }

    @Override
    public void pause() {
        System.out.println("Pause music");
    }

    @Override
    public void stop() {
        System.out.println("Stop music");
    }

    @Override
    public void record() {
        System.out.println("Record music");
    }

    public static void main(String[] args) {
        Player player = new Player();

        player.play();
        player.pause();
        player.stop();

        System.out.println("-".repeat(15));
        player.record();


    }
}
