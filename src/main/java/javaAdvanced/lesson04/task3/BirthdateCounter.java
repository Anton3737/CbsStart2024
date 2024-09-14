package javaAdvanced.lesson04.task3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class BirthdateCounter {

    private static void timeFromYourBorn(LocalDateTime yourBornDate) {
        LocalDateTime now = LocalDateTime.now();

        long years = ChronoUnit.YEARS.between(yourBornDate, now);
        long months = ChronoUnit.MONTHS.between(yourBornDate.plusYears(years), now);
        long days = ChronoUnit.DAYS.between(yourBornDate.plusYears(years).plusMonths(months), now);
        long hours = ChronoUnit.HOURS.between(yourBornDate.plusYears(years).plusMonths(months).plusDays(days), now);
        long minutes = ChronoUnit.MINUTES.between(yourBornDate.plusYears(years).plusMonths(months).plusDays(days).plusHours(hours), now);
        long seconds = ChronoUnit.SECONDS.between(yourBornDate.plusYears(years).plusMonths(months).plusDays(days).plusHours(hours).plusMinutes(minutes), now);

        System.out.println(
                "Вам вже: => "+ "\n" +
                        years + " років" + "\n" +
                        months + " місяців" + "\n" +
                        days + " днів" + "\n" +
                        hours + " годин" + "\n" +
                        minutes + " хвилин" + "\n" +
                        seconds + " секунд");


    }


    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        String birthdayDate = "20.03.1994 14:35:11";
        LocalDateTime birthDate = LocalDateTime.parse(birthdayDate, formatter);

        timeFromYourBorn(birthDate);

    }


}
