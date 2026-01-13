package com.example.calculator.step2;


import java.util.ArrayList;
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
        // Calculator 인스턴스 생성
        Calculator cal = new Calculator();

        Scanner sc = new Scanner(System.in);

        // 반복문 시작
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char in = sc.next().charAt(0);

            // calculate 메서드 사용
            if (!(in == '+' || in == '-' || in == '*' || in == '/')) {
                cal.calculate(num1, num2, in);
            } else {
                if (in == '/' && num2 == 0) {
                    cal.calculate(num1, num2, in);
                } else {
                    int result = cal.calculate(num1, num2, in);
                    cal.setSave(result);
                    System.out.println("답: " + result);
                } // 세터를 이용하여 save 리스트에 result 이력을 넣는 기능을 구현
            }
            ArrayList<Integer> newSave = cal.getSave();
            System.out.println("저장된 계산값: " + newSave);
            // System.out.println("저장된 계산값: " + cal.save); // 저장된 값 확인(test)

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String ex = sc.next();
            if (ex.equals("exit")) {
                break;  // 반복문 종료(exit) 기능 추가
            } // 반복문 종료
        }

    }
}
