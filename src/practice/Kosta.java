package practice;

import java.util.Scanner;

public class Kosta {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) {
//            for (int j = i; j <= i+9; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("숫자를 입력하세요: ");
//        int n = scanner.nextInt();
//
//        int sum = 0;
//        for (int i = 1; i <= n; i += 2) {
//            sum += i;
//        }
//        System.out.println("홀수의 합: " + sum);

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 0) {  // 짝수인 경우
                if (i % 2 == 0) {
                    sum += i;
                }
            } else {  // 홀수인 경우
                if (i % 2 == 1) {
                    sum += i;
                }
            }
        }
        System.out.println("합: " + sum);


    }
}


