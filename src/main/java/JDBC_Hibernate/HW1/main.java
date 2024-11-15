package JDBC_Hibernate.HW1;

import java.sql.*;

public class main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/MyJoinsDB";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             Statement statement = connection.createStatement()) {

            // Приклад запиту
            String query = "SELECT e.phone_number, p.address FROM Employees e JOIN PersonalInfo p ON e.id = p.employee_id";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println("Phone: " + resultSet.getString("phone_number") +
                        ", Address: " + resultSet.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
