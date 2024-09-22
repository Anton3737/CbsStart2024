package javaAdvanced.lesson07.task3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;


import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SAXParserFile {


    public static void main(String[] args) {

        String getFile = "src/main/java/javaAdvanced/lesson07/task4/xmladdress.xml";


        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler defaultHandler = new DefaultHandler() {

//                @Override
//                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//                    super.startElement(uri, localName, qName, attributes);
//                }

                // Викликається при обробці текстового вмісту між тегами
                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    String content = new String(ch, start, length).trim();
                    if (!content.isEmpty()) {
                        System.out.println( content );
                    }
                }

//                // Викликається при завершенні елемента
//                @Override
//                public void endElement(String uri, String localName, String qName) throws SAXException {
//                    System.out.println("End Element: " + qName);
//                }


            };

            saxParser.parse(getFile, defaultHandler);


        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException | IOException e) {
            throw new RuntimeException(e);
        }

    }

}
