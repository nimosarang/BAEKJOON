package chunjae;

import java.util.Scanner;

public class Man {

    private String name;
    private int age;

    public Man(String name) {
        this.name = name;
    }

    public Man(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력 :");
        String name = sc.next();

        System.out.println("나이 입력 :");
        int age = sc.nextInt();

        Man man = new Man(name);
        Man man2 = new Man(age);

        System.out.println("내 이름 " + man.name);
        System.out.println("내 나이 " + man2.age);

    }
}
