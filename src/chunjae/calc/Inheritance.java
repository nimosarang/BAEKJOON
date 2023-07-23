package chunjae.calc;

import static chunjae.calc.CalAdder.adder;
import static chunjae.calc.CalMuler.muler;

import java.util.Scanner;

public class Inheritance extends CalSuber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력 : ");
        int x = scanner.nextInt();
        System.out.println("두번째 숫자 입력 : ");
        int y = scanner.nextInt();

        adder(x,y);
        suber(x,y);
        muler(x,y);


        scanner.close();

    }

}
