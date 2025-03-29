package JDBC_Hibernate.HW1;

import java.sql.*;

public class main {

    private static final String URL = "jdbc:postgresql://localhost:5432/MyJoinsDB";
    private static final String USER = "postgres";
    private static final String PASSWORD = "love";
    private static final String SQL_QUERY_PHONE_AND_ADDRESS = "SELECT pn.Phone AS phone_number, fb.LivePlace AS address FROM PhoneANDName pn  JOIN FemilyBornLivePlase fb ON pn.id = fb.id;";

    private static final String SQL_QUERY_PHONE_AND_BORNDATE_ALL_NOTMARRIED_WORKERS = "SELECT Phone, BornDate, Family FROM PhoneANDName JOIN FemilyBornLivePlase f ON PhoneANDName.id = f.id WHERE f.Family = 'не одружений';";

    private static final String SQL_QUERY_PHONE_AND_BORNDATE_ALL_MANAGERS = "SELECT p.Phone, f.BornDate, s.PositionWorker FROM PhoneANDName p JOIN FemilyBornLivePlase f ON p.id = f.id JOIN SaleryPosition s ON p.id = s.id WHERE s.PositionWorker = 'менеджер';";


    //1.Отримайте контактні дані співробітників (номери телефонів, місце проживання).
    public static void getContactPhoneAndAddress() {

        registerDriver();

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.prepareStatement(SQL_QUERY_PHONE_AND_ADDRESS);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String phoneNumber = resultSet.getString("phone_number");
                String address = resultSet.getString("address");

                System.out.println("Phone: " + phoneNumber + ", Address: " + address);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //2.Отримайте інформацію про дату народження всіх неодружених співробітників та їхні номери.
    public static void getContactPhoneAndBornDateAllNotMarriedWorkers() {

        registerDriver();

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.prepareStatement(SQL_QUERY_PHONE_AND_BORNDATE_ALL_NOTMARRIED_WORKERS);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String phoneNumber = resultSet.getString("phone");
                String borndate = resultSet.getString("borndate");
                String lifeStatus = resultSet.getString("family");

                System.out.println("Phone: " + phoneNumber + ", borndate: " + borndate + ", family status" + lifeStatus);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //3.Отримайте інформацію про всіх менеджерів компанії: дати народження та номери телефонів.
    public static void getContactPhoneAndBornDateAllManagers() {

        registerDriver();

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.prepareStatement(SQL_QUERY_PHONE_AND_BORNDATE_ALL_MANAGERS);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String phoneNumber = resultSet.getString("phone");
                String borndate = resultSet.getString("borndate");
                String PositionWorker = resultSet.getString("PositionWorker");

                System.out.println("Phone: " + phoneNumber + ", borndate: " + borndate + ", positionworker" + PositionWorker);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("\n");
        getContactPhoneAndAddress();
        System.out.println("-".repeat(80) + "\n");
        getContactPhoneAndBornDateAllNotMarriedWorkers();
        System.out.println("-".repeat(80) + "\n");
        getContactPhoneAndBornDateAllManagers();
    }

    private static void registerDriver() {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}

