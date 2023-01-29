package baekjoon.repetitive;

import java.util.Scanner;

public class MainNo10950 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int count = in.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] = a + b;
        }

        for(int n : arr){
            System.out.println(n);
        }

    }
}
