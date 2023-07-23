package practice;

import java.util.Scanner;

public class Kosta2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char playAgain = 'y';

        while (playAgain == 'y') {
            int answer = (int) (Math.random() * 100) + 1;
            int guess = 0;
            int count = 0;

            System.out.println("1부터 100 사이의 숫자를 맞추세요.");

            while (guess != answer) {
                System.out.print("숫자를 입력하세요: ");
                guess = scanner.nextInt();
                count++;

                if (guess > answer) {
                    System.out.println("더 낮게");
                } else if (guess < answer) {
                    System.out.println("더 높게");
                } else {
                    System.out.println("맞았습니다.");
                    System.out.println("시도한 횟수: " + count);
                }
            }
            System.out.print("다시 하시겠습니까? (y/n) ");
            playAgain = scanner.next().charAt(0);
        }
        System.out.println("게임 종료");
        scanner.close();
    }
}
