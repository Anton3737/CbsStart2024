package javaEssential.lesson_07.task2;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Worker implements Comparable<Worker> {

    String worker_name;
    String worker_surname;
    String position;
    int dateStartOfWork;


    public Worker(String worker_name, String worker_surname, String position, int dateStartOfWork) {
        this.worker_name = worker_name;
        this.worker_surname = worker_surname;
        this.position = position;
        this.dateStartOfWork = dateStartOfWork;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + worker_name + '\'' +
                ", surname='" + worker_surname + '\'' +
                ", position='" + position + '\'' +
                ", totalWorkExperience=" + dateStartOfWork +
                '}';
    }


    public static Worker[] workersDBBuildeer(Scanner scanner) {
        LocalDateTime localDateTime = LocalDateTime.now();
        int yearToday = localDateTime.getYear();

        Worker[] workers = new Worker[5];

        for (int i = 0; i < workers.length; i++) {
            System.out.println("Створення працівника " + (i + 1));

            System.out.println("Введіть ім'я (не менше 2-х символів): ");
            String name = scanner.nextLine();
            while (name.length() <= 2) {
                System.err.println("Помилка: Ім'я має містити щонайменше 2 символи.");
                System.out.println("Введіть ім'я (не менше 2-х символів): ");
                name = scanner.nextLine();
            }

            System.out.println("Введіть прізвище (не менше 2-х символів): ");
            String surname = scanner.nextLine();
            while (surname.length() <= 2) {
                System.err.println("Помилка: Прізвище має містити щонайменше 2 символи.");
                System.out.println("Введіть прізвище (не менше 2-х символів): ");
                surname = scanner.nextLine();
            }

            System.out.println("Введіть посаду: ");
            String position = scanner.nextLine();
            while (position.isEmpty()) {
                System.err.println("Помилка: Посада не може бути порожньою.");
                System.out.println("Введіть посаду: ");
                position = scanner.nextLine();
            }


            int yearOfStart;
            while (true) {
                try {
                    System.out.print("Введіть рік початку роботи (після 1960 року): ");
                    yearOfStart = scanner.nextInt();
                    scanner.nextLine(); // Очищення буфера
                    if (yearOfStart >= 1960 && yearOfStart <= yearToday) {
                        break; // Вийти з циклу, якщо введення коректне
                    } else {
                        System.err.println("Помилка: Рік початку роботи повинен бути між 1960 та " + yearToday);
                    }
                } catch (InputMismatchException e) {
                    System.err.println("Помилка: Введіть число.");
                    scanner.nextLine();
                }
            }


        }

        return workers;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Worker[] workers = workersDBBuildeer(scanner);

        Arrays.sort(workers);

        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }

    @Override
    public int compareTo(Worker o) {
        return this.worker_name.compareTo(o.worker_name);
    }
}

