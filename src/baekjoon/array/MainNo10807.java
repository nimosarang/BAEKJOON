package baekjoon.array;

import java.util.Scanner;

public class MainNo10807 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //정수의 개수 N개
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        sc.close();
        int count = 0;
        for (int x : arr) {
            if (x == v){
                count++;
            }
        }
        System.out.println(count);

    }

}

