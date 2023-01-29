package baekjoon.repetitive;

import java.io.IOException;
import java.util.Scanner;

public class MainNo25304 {
    public static void main(String[] args) throws IOException {

        int X; //영수증에 적힌 "총 금액"
        int N; //영수증에 적힌 "구매한 물건의 종류의 수"
        int a; //각 물건의 가격
        int b; //각 물건의 갯수

        int result = 0;

        Scanner in = new Scanner(System.in);
        X = in.nextInt();
        N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            a = in.nextInt();
            b = in.nextInt();
            result += a * b;
        }

        if (result == X){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
