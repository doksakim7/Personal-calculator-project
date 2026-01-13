package com.example.calculator.step2;


import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 13.
 * Time: 오후 3:53
 **/
// ?: 궁금했던 내용
public class App {
    public static void main(String[] args) {
        // 인스턴스화
        Calculator cal = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String input = sc.next();   // ?: sc.nextLine() 을 쓰면 자동으로 엔터 입력되어 다음으로 넘어감
            char in = input.charAt(0);  // ?: (char) 를 안써도 됨

            // calculate 메서드 사용
            int result = cal.calculate(num1, num2, in);
            System.out.println("답: " + result);  // ?: 0으로 나눌 때 or 기호가 잘못되었을 때 메시지와 함께 result 반환값도 출력되는 오류 발생

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String ex = sc.next();
            if (ex.equals("exit")) {
                break;  // 반복문 종료(exit) 기능 추가
            } // 반복문 완성
        }

    }
}
