package chunjae;

import java.util.Scanner;

public class Test03 {

    public static void 약수구하기(int 약수구할숫자) {
        for (int i = 1; i <= 약수구할숫자; i++) {
            if (약수구할숫자 % i == 0) {
                System.out.println("나는 <" + 약수구할숫자 + ">의 약수다 :" + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner 스캐너 = new Scanner(System.in);

        System.out.print("약수를 구할 숫자를 입력하세요: ");
        int 약수구할숫자 = 스캐너.nextInt();

        약수구하기(약수구할숫자);
    }
}
