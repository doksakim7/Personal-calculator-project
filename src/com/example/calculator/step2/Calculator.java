package com.example.calculator.step2;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 13.
 * Time: 오후 3:50
 **/

public class Calculator {
    int num1, num2, result;
    char in;
    ArrayList<Integer> save = new ArrayList<Integer>();

    // 입력 받은 사칙 연산을 수행 후 result에 저장 후 반환
    // save 리스트에 result 이력을 넣는 기능을 구현
    public int calculate(int a, int b, char c) {
        this.num1 = a;
        this.num2 = b;
        this.in = c;

        switch (in) {
            case '+':
                result = num1 + num2;
                save.add(result);
                break;
            case '-':
                result = num1 - num2;
                save.add(result);
                break;
            case '*':
                result = num1 * num2;
                save.add(result);
                break;
            case '/':
                try {
                    result = num1 / num2;
                    save.add(result);
                    break;
                } catch (ArithmeticException e) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }   // 0으로 나눌 때 발생하는 오류의 예외 처리 기능 추가
            default:
                System.out.println("올바른 사칙연산 기호중에 하나를 입력하시오.(+, -, *, /)");
        }
        return result;
    }
}
