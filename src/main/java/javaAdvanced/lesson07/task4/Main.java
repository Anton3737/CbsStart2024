package javaAdvanced.lesson07.task4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        CollectorLocations collectorLocations = new CollectorLocations();
        collectorLocations.addition(new Locations("Kyiv", "S.Petlyury", 12));
        collectorLocations.addition(new Locations("Kyiv", "Khreshchatyk", 22));
        collectorLocations.addition(new Locations("Kyiv", "Volodymyrska", 33));
        collectorLocations.addition(new Locations("Kyiv", "Kontraktova Square", 5));
        collectorLocations.addition(new Locations("Kyiv", "Bohdana Khmelnytskogo", 10));
        collectorLocations.addition(new Locations("Kyiv", "Pechersky Uzviz", 19));
        collectorLocations.addition(new Locations("Kyiv", "Velyka Vasylkivska", 44));
        collectorLocations.addition(new Locations("Kyiv", "Lvivska Square", 6));
        collectorLocations.addition(new Locations("Kyiv", "Andriyivskyy Descent", 18));
        collectorLocations.addition(new Locations("Kyiv", "Dniprovska Naberezhna", 7));

        collectorLocations.addition(new Locations("Odesa", "Deribasivska", 1));
        collectorLocations.addition(new Locations("Odesa", "Primorsky Boulevard", 5));
        collectorLocations.addition(new Locations("Odesa", "Pushkinska", 13));
        collectorLocations.addition(new Locations("Odesa", "Frantsuzky Boulevard", 25));
        collectorLocations.addition(new Locations("Odesa", "Katerynynska Square", 7));

        collectorLocations.addition(new Locations("Lviv", "Rynok Square", 10));
        collectorLocations.addition(new Locations("Lviv", "Svobody Avenue", 20));
        collectorLocations.addition(new Locations("Lviv", "Virmenska", 6));
        collectorLocations.addition(new Locations("Lviv", "Halytska", 8));
        collectorLocations.addition(new Locations("Lviv", "Shevchenka Avenue", 14));

        collectorLocations.addition(new Locations("Chernihiv", "P'iatnytska", 9));
        collectorLocations.addition(new Locations("Chernihiv", "Shevchenko Street", 15));
        collectorLocations.addition(new Locations("Chernihiv", "Myru Avenue", 3));
        collectorLocations.addition(new Locations("Chernihiv", "Hetmana Polubotka", 11));
        collectorLocations.addition(new Locations("Chernihiv", "Desnyanska", 17));


        try {

            File file = new File("/Users/Anton/Downloads/CbsStart2024/src/main/java/javaAdvanced/lesson07/task4/xmladdress.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(CollectorLocations.class);

            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(collectorLocations, file);

            System.out.println("Маршалінг завершено");

        } catch (JAXBException jaxbException) {
            jaxbException.printStackTrace();
        }

    }
}
