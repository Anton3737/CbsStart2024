package javaAdvanced.lesson07.task2;

import javaAdvanced.lesson05.task5.Animal;
import javaAdvanced.lesson05.task5.Cat;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnimalSerealisat_Deserealisate {

    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.addition(new Animal("Англійський сірий", "Рижик", 12, "Рибка"));
        cat.addition(new Animal("Сіамський", "Мурка", 5, "Курка"));
        cat.addition(new Animal("Британський короткошерстий", "Барсик", 8, "М'ясо"));
        cat.addition(new Animal("Персидський", "Ласка", 4, "Тунець"));
        cat.addition(new Animal("Мейн-Кун", "Бегемот", 10, "Сухий корм"));
        cat.addition(new Animal("Сфінкс", "Кеша", 7, "Індичка"));
        cat.addition(new Animal("Шотландський висловухий", "Лео", 6, "Сом"));
        cat.addition(new Animal("Балійський", "Сімба", 9, "Кролик"));
        cat.addition(new Animal("Саванна", "Тайгер", 3, "Яловичина"));
        cat.addition(new Animal("Бенгальський", "Рекс", 2, "Філе"));
        cat.addition(new Animal("Сибірський", "Буся", 12, "Курочка"));
        cat.addition(new Animal("Орієнтальний", "Фелікс", 11, "Риба"));
        cat.addition(new Animal("Американський короткошерстий", "Оскар", 5, "Індичка"));
        cat.addition(new Animal("Егіпетський мау", "Тутан", 4, "Креветки"));
        cat.addition(new Animal("Тайський", "Шустрик", 8, "Лосось"));
        cat.addition(new Animal("Російський блакитний", "Граф", 9, "Паштет"));
        cat.addition(new Animal("Японський бобтейл", "Таро", 6, "Тунець"));
        cat.addition(new Animal("Турецький ван", "Сніжок", 5, "Куряче філе"));
        cat.addition(new Animal("Норвезький лісовий", "Вікінг", 7, "Риб'ячий жир"));
        cat.addition(new Animal("Рагамаффін", "Лакі", 10, "Печінка"));


        try {

            File file = new File("/Users/Anton/Downloads/CbsStart2024/src/main/java/javaAdvanced/lesson07/task2/Cats.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Cat.class);

            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(cat, file);

            System.out.println("Маршалінг завершено");

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-".repeat(40));



        String getFile = "src/main/java/javaAdvanced/lesson07/task2/Cats.xml";


        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler defaultHandler = new DefaultHandler() {
                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    String content = new String(ch, start, length).trim();
                    if (!content.isEmpty()) {
                        System.out.println(content);
                    }
                }

            };

            saxParser.parse(getFile, defaultHandler);


        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException | IOException e) {
            throw new RuntimeException(e);
        }

    }


}
