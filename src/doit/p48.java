package doit;

public class p48 {
    public static void main(String[] args) {
        //48페이지 실습 2-3

        int[] a = {1,2,3,4,5};
        int[] b = a.clone(); //b는 a의 복제를 참조

        b[3] = 0;

        System.out.println("a=");
        for (int k : a) {
            System.out.print(" " + k);
        }

        System.out.println("\nb = ");
        for (int j : b) {
            System.out.print(" " + j);
        }


    }
}
