package practice;

import java.util.Scanner;

public class Kosta3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int answer = (int) (Math.random() * 100) + 1;
            int count = 0;

            System.out.println("1부터 100 사이의 숫자를 맞추세요.");

            while (true) {
                System.out.print("숫자를 입력하세요: ");
                int guess = scanner.nextInt();
                count++;

                if (guess > answer) {
                    System.out.println("Down");
                } else if (guess < answer) {
                    System.out.println("Up");
                } else {
                    System.out.println("맞았습니다.");
                    System.out.println("시도한 횟수: " + count);
                    break;
                }
            }

            System.out.print("다시 하시겠습니까? (y/n) ");
            char playAgain = scanner.next().charAt(0);
            if (playAgain == 'n') {
                break;
            }
        }

        System.out.println("게임 종료");
        scanner.close();
    }
}

