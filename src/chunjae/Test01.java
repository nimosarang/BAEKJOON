package chunjae;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {

        int random = (int) (Math.random() * 100 + 1);
        System.out.println(random);

        int count = 0;

        while (true) {
            System.out.println("정답 :"+random);
            Scanner input = new Scanner(System.in);
            System.out.print("숫자 입력:");
            int num = input.nextInt();

            count++;

            if (num == random) {
                System.out.println("정답");

                System.out.println("입력 횟수: " + count);
                System.out.println("다시 시도? (y/n)");
                Scanner re = new Scanner(System.in);
                char retry = re.next().charAt(0);

                if (retry != 'y' && retry != 'n') {
                    while (true) {
                        System.out.print("y or n만 입력: ");
                        retry = re.next().charAt(0);

                        if (retry == 'y') {
                            break;
                        } else if (retry == 'n') {
                            break;
                        }
                    }
                    if (retry == 'n') {
                        System.out.println("종료");
                        break;
                    }
                    System.out.println("----다시시작-----");
                    count = 0;
                    random = (int) (Math.random() * 100 + 1);
                    System.out.println(random);
                    continue;
                } else if (retry == 'y') {
                    System.out.println("----다시시작-----");
                    count = 0;
                    random = (int) (Math.random() * 100 + 1);
                    System.out.println(random);
                    continue;
                } else {
                    System.out.println("종료");
                    break;
                }
            } else if (num < random) {
                System.out.println("더 높게");
            } else {
                System.out.println("더 낮게");
            }
        }
    }


}





