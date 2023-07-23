package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDBConnectionExample {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            // Step 1: Load the MariaDB JDBC driver
            Class.forName("org.mariadb.jdbc.Driver");

            // Step 2: Establish the connection
            String url = "jdbc:mariadb://localhost:3306/semobin";
            String username = "sonjk";
            String password = "1234";
            conn = DriverManager.getConnection(url, username, password);

            System.out.println("Connected to MariaDB!");

            // Use the connection here...

        } catch (ClassNotFoundException e) {
            System.out.println("MariaDB JDBC driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection to MariaDB failed!");
            e.printStackTrace();
        } finally {
            // Step 3: Close the connection
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Disconnected from MariaDB!");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
