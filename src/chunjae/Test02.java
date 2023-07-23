package chunjae;

import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.print("연산을 선택하세요 (+, -, *, /): ");
        String operator = scanner.next();

        int result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산을 선택했습니다.");
                return;
        }
        System.out.println("결과: " + result);
    }

}


