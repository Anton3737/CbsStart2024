package javaEssential.lesson_01;

import java.util.Scanner;

public class Computer {

    private int id;
    private String name;
    private String model;
    private int ram;
    private int SSD;
    private String material;

    public Computer(int id, String name, String model, int ram, int SSD, String material) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.ram = ram;
        this.SSD = SSD;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return
                "id: " + id + '\n' +
                        "Найменування: " + name + '\n' +
                        "Модель: " + model + '\n' +
                        "Об'єм RAM пам'яті: " + ram + '\n' +
                        "Об'єм SSD пам'яті: " + SSD + '\n' +
                        "Матеріал виконання: " + material + '\n';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = new String[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Найменування | Модель | Об'єм RAM пам'яті |  Об'єм SSD пам'яті | Матеріал виконання");

            array[i] = String.valueOf(new Computer(i, sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next()));


            for (String arr : array) {
                System.out.println(arr);
            }
        }
    }
}
