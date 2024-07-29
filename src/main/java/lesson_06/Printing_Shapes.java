package lesson_06;

public class Printing_Shapes {

    static void Rectangle() {
        System.out.println("Прямокутник");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
        System.out.print("\n");
    }

    static void Triangle() {
        System.out.println("Прямокутний трикутник");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.print("\n");
    }

    static void Equilateral_triangle() {
        System.out.println("Рівносторонній трикутник");
        for (int i = 0; i <= 10; i++) {     // друкуємо рядки
            for (int j = 0; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= 2 * i - 1; z++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print("\n");
    }

    static void Diamond() {
        System.out.println("Ромб");
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 10 - i; j++) {
                System.out.print(' ');
            }
            for (int z = 1; z <= 2 * i - 1; z++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int y = 10; y >= 1; --y) {
            for (int j = 11; j > y; --j) {
                System.out.print(' ');
            }
            for (int z = 1; z < y * 2; z++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print("\n");
    }


    public static void main(String[] args) {
        Rectangle();
        Triangle();
        Equilateral_triangle();
        Diamond();
    }
}
