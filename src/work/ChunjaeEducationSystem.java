package work;

import java.sql.*;
import java.util.Scanner;

public class ChunjaeEducationSystem {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/chunjae";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    private static final int MAX_STUDENTS = 20;

    public static void main(String[] args) {
        Student[] students = new Student[MAX_STUDENTS];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < MAX_STUDENTS; i++) {
            System.out.println("학생 정보 입력:");
            System.out.print("학번: ");
            String studentId = scanner.nextLine();
            System.out.print("과목명: ");
            String subject = scanner.nextLine();
            System.out.print("반: ");
            int grade = Integer.parseInt(scanner.nextLine());

            students[i] = new Student(studentId, subject, grade);
            System.out.println("중간고사 성적 입력:");
            int midtermScore = Integer.parseInt(scanner.nextLine());
            students[i].setMidtermScore(midtermScore);
            System.out.println("기말고사 성적 입력:");
            int finalScore = Integer.parseInt(scanner.nextLine());
            students[i].setFinalScore(finalScore);
        }

        calculateTotalScore(students);
        calculateAverageScore(students);
        calculateRank(students);

        saveToDatabase(students);

        // 이후의 로직을 추가하여 성적 관리 시스템을 완성하세요.
    }

    private static void calculateTotalScore(Student[] students) {
        for (Student student : students) {
            int totalScore = student.getMidtermScore() + student.getFinalScore();
            student.setTotalScore(totalScore);
        }
    }

    private static void calculateAverageScore(Student[] students) {
        for (Student student : students) {
            double averageScore = student.getTotalScore() / 2.0;
            student.setAverageScore(averageScore);
        }
    }

    private static void calculateRank(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            int rank = 1;
            for (int j = 0; j < students.length; j++) {
                if (students[j].getTotalScore() > students[i].getTotalScore()) {
                    rank++;
                }
            }
            students[i].setRank(rank);
        }
    }

    private static void saveToDatabase(Student[] students) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS chunjaeEducation (" +
                "studentId VARCHAR(10) PRIMARY KEY," +
                "subject VARCHAR(50)," +
                "grade INT," +
                "midtermScore INT," +
                "finalScore INT," +
                "totalScore INT," +
                "averageScore DOUBLE," +
                "rank INT)");

            for (Student student : students) {
                String insertQuery = "INSERT INTO chunjaeEducation (studentId, subject, grade, midtermScore, finalScore, totalScore, averageScore, rank) " +
                    "VALUES ('" + student.getStudentId() + "', '" + student.getSubject() + "', " + student.getGrade() + ", " +
                    student.getMidtermScore() + ", " + student.getFinalScore() + ", " + student.getTotalScore() + ", " +
                    student.getAverageScore() + ", " + student.getRank() + ")";
                stmt.executeUpdate(insertQuery);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class Student {
    private String studentId;
    private String subject;
    private int grade;
    private int midtermScore;
    private int finalScore;
    private int totalScore;
    private double averageScore;
    private int rank;

    public Student(String studentId, String subject, int grade) {
        this.studentId = studentId;
        this.subject = subject;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    public int getMidtermScore() {
        return midtermScore;
    }

    public void setMidtermScore(int midtermScore) {
        this.midtermScore = midtermScore;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
