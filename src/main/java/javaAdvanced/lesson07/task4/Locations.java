package javaAdvanced.lesson07.task4;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "locations")
public class Locations {

    private String city;
    private String street;
    private int building;

    public Locations() {
    }

    public Locations(String city, String street, int building) {
        this.city = city;
        this.street = street;
        this.building = building;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                '}';
    }


    @XmlElement
    public void setCity(String city) {
        this.city = city;
    }

    @XmlElement
    public void setStreet(String street) {
        this.street = street;
    }

    @XmlElement
    public void setBuilding(int building) {
        this.building = building;
    }


    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuilding() {
        return building;
    }
}
