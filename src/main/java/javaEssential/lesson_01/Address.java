package javaEssential.lesson_01;

public class Address {

    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address(int index, String country, String city, String street, int house, int apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public static void main(String[] args) {

        Address address = new Address(8303, "Україна", "Київ", "Рейтарська", 12, 32);

        System.out.println("Індекс: " + address.getIndex());
        System.out.println("Країна: " + address.getCountry());
        System.out.println("Місто: " + address.getCity());
        System.out.println("Вулиця: " + address.getStreet());
        System.out.println("Будинок: " + address.getHouse());
        System.out.println("Квартира: " + address.getApartment());


    }
}
