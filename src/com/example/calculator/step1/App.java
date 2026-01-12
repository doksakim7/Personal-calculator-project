package com.example.calculator.step1;


import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 12.
 * Time: 오후 2:49
 **/
// ?: 궁금했던 내용
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String input = sc.next();   // ?: sc.nextLine() 을 쓰면 자동으로 엔터 입력되어 다음으로 넘어감
            char in = input.charAt(0);  // ?: (char) 를 안써도 됨

            switch (in) {
                case '+':
                    System.out.println("답: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("답: " + (num1 - num2)); // ?: 다른 사칙연산은 오류가 없는데 '-'만 ()를 안하면 오류가 나옴
                    break;
                case '*':
                    System.out.println("답: " + (num1 * num2));
                    break;
                case '/':
                    try {
                        System.out.println("답: " + (num1 / num2));
                        break;
                    } catch (ArithmeticException e) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }   // 0으로 나눌 때 발생하는 오류의 예외 처리 기능 추가
                default:
                    System.out.println("올바른 사칙연산 기호중에 하나를 입력하시오.(+, -, *, /)");
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String ex = sc.next();
            if (ex.equals("exit")) {
                break;  // 반복문 종료(exit) 기능 추가
            } // 반복문 완성
        }
    }
}
