package chunjae.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlTest {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/chunjae";
        String userName = "root";
        String password = "";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, userName, password);
            preparedStatement = connection.prepareStatement("select * from member");
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("연결 실패여~");
        }

        System.out.println("********시작한다********");

        while (resultSet.next()) {
            System.out.print(resultSet.getString("name"));
            System.out.print(", 나이 : " + resultSet.getInt("age"));
            System.out.print(", 키 :" + resultSet.getFloat(3));
            System.out.print(", 몸무게 :" + resultSet.getFloat(4));
            System.out.println();
        }

        connection.close();
        preparedStatement.close();
        resultSet.close();

        System.out.println("********잘 끝남********");
    }
}