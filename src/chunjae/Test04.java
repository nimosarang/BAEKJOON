package chunjae;

import java.util.Scanner;

class Generics {

    public static <T> void printData(T data) {
        System.out.println("입력된 데이터: " + data);
    }

//    public static <Integer> void printInteger(Integer data) {
//        System.out.println("입력된 데이터: " + data);
//    }
//
//    public static <Double> void printDouble(Double data) {
//        System.out.println("입력된 데이터: " + data);
//    }

}

public class Test04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수형 데이터를 입력하세요: ");
        int integer = scanner.nextInt();

        Generics.printData(integer);

        System.out.println("실수형 데이터를 입력하세요: ");
        double floater = scanner.nextDouble();

        Generics.printData(floater);

//        System.out.println("정수형 데이터를 입력하세요: ");
//        int integer = scanner.nextInt();
//
//        Generics.printInteger(integer);
//
//        System.out.println("실수형 데이터를 입력하세요: ");
//        double floater = scanner.nextDouble();
//
//        Generics.printDouble(floater);

    }
}
