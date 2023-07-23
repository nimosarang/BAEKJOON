package chunjae;

import java.util.Scanner;

class GenericSample1<T> {

    private T[] i;
    private int index;

    public GenericSample1(int i) {
        this.i = (T[]) new Object[i];
    }

    public void addData(T...args) {
        for (T arg : args) {
            i[index++] = arg;
        }
    }

    public void print() {
        for (T t : i) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}


public class Test05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Java, Jsp, Spring 순서로 점수 입력 (정수) : ");
        int java = sc.nextInt();
        int jsp = sc.nextInt();
        int spring = sc.nextInt();

        System.out.println("Java, Jsp, Spring 순서로 점수 입력 (실수): ");
        double java1 = sc.nextDouble();
        double jsp1 = sc.nextDouble();
        double spring1 = sc.nextDouble();

        GenericSample1<Integer> gs1 = new GenericSample1<>(3);
        gs1.addData(java, jsp, spring);
        gs1.print();

        GenericSample1<Double> gs2 = new GenericSample1<>(3);
        gs2.addData(java1, jsp1, spring1);
        gs2.print();


    }

}
