package com.example.calculator.step1;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 12.
 * Time: 오후 2:49
 **/
// ?: 궁금했던 내용
// !: 공부하면서 알게 된 내용
// Step 1 하면서 중간중간에 궁금한 점들이 생겼는데 스스로 해결하면서 완성했습니다.
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 반복문 시작
        while (true) {
            int num1, num2 = 0;   // !: 선언 및 초기화 필수

            // 첫 번째 입력에서 숫자가 아니면 재입력 하는 기능 구현
            while(true) {
                try {
                    System.out.print("첫 번째 숫자를 입력하세요(0과 양의 정수만 입력 가능): ");
                    num1 = sc.nextInt();

                    // 음의 정수가 입력되면 예외 발생하는 기능 구현
                    if(num1 < 0) {
                        throw new InputMismatchException();
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("양의 정수와 0만 입력 가능합니다!");
                    sc.nextLine();  // !: 버퍼 제거 - 제거하지 않으면 무한루프 발생
                }
            }
            // 두 번째 입력에서 숫자가 아니면 재입력 하는 기능 구현
            while(true) {
                try {
                    System.out.print("두 번째 숫자를 입력하세요(0과 양의 정수만 입력 가능): ");
                    num2 = sc.nextInt();

                    // 음의 정수가 입력되면 예외 발생하는 기능 구현
                    if(num2 < 0) {
                        throw new InputMismatchException();
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("양의 정수와 0만 입력 가능합니다!");
                    sc.nextLine();  // !: 버퍼 제거 - 제거하지 않으면 무한루프 발생
                }
            }

            System.out.print("사칙연산 기호 중 하나를 입력하세요(+, -, *, /): ");
            String input = sc.next();   // !: sc.nextLine() 을 쓰면 자동으로 버퍼 입력되어 다음으로 넘어감
            char in = input.charAt(0);  // !: .charAt 을 쓰면 String -> char 로 반환함

            // 사칙연산 케이스에 따른 계산 기능 구현
            switch (in) {
                case '+':
                    System.out.println("답: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("답: " + (num1 - num2)); // !: + 는 문자열 연결 연산자로도 사용되기 때문에 괄호()를 써줘야 함!
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
                    }
                default:
                    System.out.println("올바른 사칙연산 기호 중에 하나를 입력하시오.(+, -, *, /)");
            }

            // 종료 확인 기능
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String ex = sc.next();
            if (ex.equals("exit")) {
                break; // 반복문 종료
            }
        }
    }
}
