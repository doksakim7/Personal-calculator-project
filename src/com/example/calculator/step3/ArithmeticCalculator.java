package com.example.calculator.step3;


import java.util.ArrayList;


// 진행중...
public class ArithmeticCalculator {
    int num1, num2, result;
    char in;
    OperatorType op;    // enum 타입 변수 op 선언

    // 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정
    private ArrayList<Integer> save = new ArrayList<>();

    // 입력 받은 사칙 연산을 수행 후 result에 저장 후 반환 기능 구현
    // enum 타입 변수 switch 문에 op 활용
    public int calculate(int a, int b, OperatorType op) {
        this.num1 = a;
        this.num2 = b;
        this.op = OperatorType.PLUS;

        switch (op) {
            case PLUS:
                result = num1 + num2;
                return result;
            case MINUS:
                result = num1 - num2;
                return result;
            case MULTIPLY:
                result = num1 * num2;
                return result;
            case DIVIDE:
                try {
                    result = num1 / num2;
                    return result;
                } catch (ArithmeticException e) {
                    this.exception1();
                    break;
                }
            default:
                this.exception2();
        }
        return 0;
    }

    // 0 으로 나눌 때 출력 메시지
    public void exception1() {
        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
    }

    // 올바른 사칙연산 기호가 아닌 경우 출력 메시지
    public void exception2() {
        System.out.println("올바른 사칙연산 기호 중에 하나를 입력하시오.(+, -, *, /)");
    }

    // Getter 메서드 구현
    public ArrayList<Integer> getSave() {
        return this.save;
    }

    // Setter 메서드 구현(저장)
    public void setSave(int save) {
        this.save.add(save);
    }

    // Setter 메서드 구현(삭제)
    public void setDelete(int save) {
        this.save.remove(save);
    }

}
