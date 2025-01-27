package JDBC_Hibernate.HW1;

import java.sql.*;

public class main {

    private static final String URL = "jdbc:postgresql://localhost:5432/MyJoinsDB";
    private static final String USER = "postgres";
    private static final String PASSWORD = "love";
    private static final String SQL = "SELECT pn.Phone AS phone_number, fb.LivePlace AS address FROM PhoneANDName pn  JOIN FemilyBornLivePlase fb ON pn.id = fb.id;";


    public static void main(String[] args) {
        registerDriver();

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.prepareStatement(SQL);
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

    private static void registerDriver() {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

