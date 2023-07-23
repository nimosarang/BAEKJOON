package chunjae.memberms;

import java.sql.*;
import java.util.Scanner;

public class MemberManagementSystem {
    private final String URL = "jdbc:mysql://localhost:3306/chunjae";
    private final String USERNAME = "root";
    private final String PASSWORD = "";

    private Connection connection;
    private Scanner scanner;

    public static void main(String[] args) {
        MemberManagementSystem system = new MemberManagementSystem();
        system.run();
    }

    public void run() {
        try {
            connectToDatabase();
            displayMenu();

            scanner = new Scanner(System.in);
            while (true) {
                System.out.print("원하는 작업을 선택하세요 (1-5): ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        displayMembers();
                        break;
                    case 2:
                        addMember();
                        break;
                    case 3:
                        updateMember();
                        break;
                    case 4:
                        deleteMember();
                        break;
                    case 5:
                        System.out.println("프로그램을 종료합니다.");
                        closeConnection();
                        scanner.close();
                        return;
                    default:
                        System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void connectToDatabase() throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    private void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    private void displayMenu() {
        System.out.println("===== 회원관리 시스템 =====");
        System.out.println("1. 회원정보 조회");
        System.out.println("2. 회원정보 입력");
        System.out.println("3. 회원정보 수정");
        System.out.println("4. 회원정보 삭제");
        System.out.println("5. 회원관리 시스템 종료");
    }

    private void displayMembers() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM member");

        System.out.println("===== 회원 목록 =====");
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            System.out.println("아이디: " + id + ", 이름: " + name + ", 나이: " + age);
        }

        resultSet.close();
        statement.close();
    }

    private void addMember() throws SQLException {
        scanner = new Scanner(System.in);

        System.out.print("추가할 회원의 아이디를 입력하세요: ");
        String id = scanner.nextLine();
        System.out.print("추가할 회원의 이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("추가할 회원의 나이를 입력하세요: ");
        int age = scanner.nextInt();

        String query = "INSERT INTO member (id, name, age) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setInt(3, age);
        preparedStatement.executeUpdate();

        System.out.println("회원이 추가되었습니다.");
        preparedStatement.close();
    }

    private void updateMember() throws SQLException {
        scanner = new Scanner(System.in);

        System.out.print("수정할 회원의 아이디를 입력하세요: ");
        String id = scanner.nextLine();
        System.out.print("새로운 이름을 입력하세요: ");
        String newName = scanner.nextLine();
        System.out.print("새로운 나이를 입력하세요: ");
        int newAge = scanner.nextInt();

        String query = "UPDATE member SET name = ?, age = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, newName);
        preparedStatement.setInt(2, newAge);
        preparedStatement.setString(3, id);
        int rowsUpdated = preparedStatement.executeUpdate();

        if (rowsUpdated > 0) {
            System.out.println("회원정보가 수정되었습니다.");
        } else {
            System.out.println("해당 아이디의 회원정보를 찾을 수 없습니다.");
        }

        preparedStatement.close();
    }

    private void deleteMember() throws SQLException {
        scanner = new Scanner(System.in);

        System.out.print("삭제할 회원의 아이디를 입력하세요: ");
        String id = scanner.nextLine();

        String query = "DELETE FROM member WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, id);
        int rowsDeleted = preparedStatement.executeUpdate();

        if (rowsDeleted > 0) {
            System.out.println("회원정보가 삭제되었습니다.");
        } else {
            System.out.println("해당 아이디의 회원정보를 찾을 수 없습니다.");
        }

        preparedStatement.close();
    }
}
