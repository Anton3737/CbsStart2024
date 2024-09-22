package javaAdvanced.lesson07.task4;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "collector_locations")
public class CollectorLocations {
    @XmlElement(name = "locations")
    private List<Locations> locationsList = new ArrayList<>();

    public CollectorLocations() {
    }

    public void addition(Locations locations) {
        locationsList.add(locations);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(locationsList.toArray());
    }
}
