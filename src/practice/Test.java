package practice;

import java.util.Scanner;

public class Test {

    //ToDo
    // 문제 : “Hello” 라는 문자열을 입력 받으면, “박수연님 반갑습니다~~” 라는 문자열 반환하도록 만들어보세요
    // <프로그램 작성>
    // 1. 요구사항 정의 : '특정' 문자열을 입력 받으면 '특정' 문자열을 반환하는 프로그램 작성
    // 2. 요구사항 분석 : 입력받을 문자열("Hello"), 반환될 문자열("박수연님 반갑습니다~~")
    // 3. 요구사항 설계 :
    //    - '특정' 문자열을 입력받는 방법 : Scanner 객체 생성 -> next() 메서드 활용
    //    - 입력받은 '특정' 문자열 검증 방법 : if문의 조건식 활용 -> String의 equals() 메서드 활용
    //    - '특정' 문자열 출력 방법 : if문의 조건식이 참일 때, System.out.println("반환 될 '특정' 문자열") 반환
    // 4. 코딩 : 위의 '3.요구사항 설계'를 참고하여 코딩 진행
    // 5. 테스트 : 간단한 프로그램으로, 직접 실행하여 테스트

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력해주세요 : ");

        String text = scanner.next();

        if (text.equals("Hello")){
            System.out.println("박수연님 반갑습니다~~");
        }else {
            System.out.println("누구세요?");
        }
    }

}
