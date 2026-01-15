package com.example.calculator.step3;


/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 14.
 * Time: 오후 7:02
 **/

public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    // 상수 문자 변수 op 생성
    private final char op;

    // 생성자 구현
    OperatorType(char op) {
        this.op = op;
    }

    // Getter 메서드 구현
    public char getOp() {
        return this.op;
    }
}
