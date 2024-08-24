package javaEssential.lesson_03.task_06;

import java.util.Scanner;

public class Printer {

    public String ANSI_RESET = "\u001B[0m";
    public String ANSI_BLACK = "\u001B[30m";
    public String ANSI_RED = "\u001B[31m";
    public String ANSI_GREEN = "\u001B[32m";
    public String ANSI_YELLOW = "\u001B[33m";
    public String ANSI_BLUE = "\u001B[34m";
    public String ANSI_PURPLE = "\u001B[35m";
    public String ANSI_CYAN = "\u001B[36m";
    public String ANSI_WHITE = "\u001B[37m";

    void print(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            String inputValue = sc.next();

            Printer printer;

            switch (inputValue) {
                case "black":
                    printer = new ColorBlack();
                    printer.print(inputValue);
                    break;
                case "red":
                    printer = new ColorRed();
                    printer.print(inputValue);
                    break;
                case "green":
                    printer = new ColorGreen();
                    printer.print(inputValue);
                    break;
                case "yellow":
                    printer = new ColorYellow();
                    printer.print(inputValue);
                    break;
                case "purple":
                    printer = new ColorPurple();
                    printer.print(inputValue);
                    break;
                case "blue":
                    printer = new ColorBlue();
                    printer.print(inputValue);
                    break;
                case "cyan":
                    printer = new ColorCyan();
                    printer.print(inputValue);
                    break;
                case "white":
                    printer = new ColorWhite();
                    printer.print(inputValue);
                    break;
                default:
                    System.out.println("Такий колір відсутній");
            }
        }
    }
}

class ColorBlack extends Printer {
    @Override
    public void print(String value) {
        System.out.print(ANSI_BLACK + value + ANSI_RESET);
    }

}

class ColorRed extends Printer {
    @Override
    public void print(String value) {
        System.out.println(ANSI_RED + value + ANSI_RESET);
    }
}

class ColorGreen extends Printer {
    @Override
    public void print(String value) {
        System.out.println(ANSI_GREEN + value + ANSI_RESET);
    }
}

class ColorYellow extends Printer {
    @Override
    public void print(String value) {
        System.out.println(ANSI_YELLOW + value + ANSI_RESET);
    }
}

class ColorBlue extends Printer {
    @Override
    public void print(String value) {
        System.out.println(ANSI_BLUE + value + ANSI_RESET);
    }
}

class ColorPurple extends Printer {
    @Override
    public void print(String value) {
        System.out.println(ANSI_PURPLE + value + ANSI_RESET);
    }
}

class ColorCyan extends Printer {
    @Override
    public void print(String value) {
        System.out.println(ANSI_CYAN + value + ANSI_RESET);
    }
}

class ColorWhite extends Printer {
    @Override
    public void print(String value) {
        System.out.println(ANSI_WHITE + value + ANSI_RESET);
    }
}