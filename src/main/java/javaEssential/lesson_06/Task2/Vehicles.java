package javaEssential.lesson_06.Task2;

public enum Vehicles {
    MERCEDES(12000, "Black"), KIA(5300, "Red"), HONDA(12500, "Pink"), NISSAN(15600, "Dark blue"), TOYOTA(32900, "White"), BMW(1900, "Purple"), LEXUS(23030, "Black"), MASERATI(55000, "Light grey"), AUDI(11990, "Black"), SKODA(6600, "Yellow");

    int price;
    String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Aвтомобіль:" +
                " назва: " + name() +
                ", ціна: " + price +
                ", колір: " + getColor();
    }
}
