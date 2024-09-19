package javaAdvanced.lesson05.extracurricular;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlParser {


    public static String htmlPageReader(String url) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();

        Connection connection = Jsoup.connect(url);

        Document document = connection.ignoreContentType(true).get();

        stringBuilder.append(document);

        return stringBuilder.toString();

    }


    public static List<String> getAllLinks(String code) throws IOException {
        List<String> links = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(code));
        String tmp;

        String regex = "https://[^\"\\s]+";
        Pattern pattern = Pattern.compile(regex);

        while ((tmp = bufferedReader.readLine()) != null) {
            Matcher matcher = pattern.matcher(tmp);
            while (matcher.find()) {
                links.add(matcher.group());
            }
        }
        return links;
    }





    public static void main(String[] args) throws IOException {
        String url = "https://dou.ua";


        System.out.println(htmlPageReader(url));


        List<String> links = getAllLinks(htmlPageReader(url));


        for (String link :  links) {
            System.out.println(link);
        }

    }
}
