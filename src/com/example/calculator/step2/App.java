package com.example.calculator.step2;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 13.
 * Time: 오후 3:53
 **/
// ?: 궁금했던 내용
// !: 공부하면서 알게 된 내용
// Step 2를 공부하면서 아직 객체지향적인 코드를 구현 하는 능력은 부족하다는 생각을 했습니다.
// 게터, 세터 부분의 코드 작성과 사용은 아직 미숙하다고 생각합니다.
public class App {
    public static void main(String[] args) {
        // Calculator 인스턴스 생성
        Calculator cal = new Calculator();

        Scanner sc = new Scanner(System.in);

        // 반복문 시작
        while (true) {
            int num1, num2;   // !: 선언 필수
            // ?: Step 1과 달리 Step 2에서는 왜 초기화 안해도 될까요?(아마 switch 문과 관련 있다고 생각중입니다...)

            // 첫 번째 입력에서 숫자가 아니면 재입력 하는 기능 구현
            while(true) {
                try {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    num1 = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("숫자만 입력하세요!");
                    sc.nextLine();  // !: 버퍼 제거 - 제거하지 않으면 무한루프 발생
                }
            }
            // 두 번째 입력에서 숫자가 아니면 재입력 하는 기능 구현
            while(true) {
                try {
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    num2 = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("숫자만 입력하세요!");
                    sc.nextLine();  // !: 버퍼 제거 - 제거하지 않으면 무한루프 발생
                }
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            char in = sc.next().charAt(0);

            // calculate 메서드 사용해서 사칙연산 수행하는 기능 구현
            // ?: 이 부분 다른 방법으로 구현할 수 있을지 궁금합니다.(Calculator 클래스에서 구현 가능한지 여부)
            if (!(in == '+' || in == '-' || in == '*' || in == '/')) {
                cal.calculate(num1, num2, in);
            } else {
                if (in == '/' && num2 == 0) {
                    cal.calculate(num1, num2, in);
                } else {
                    int result = cal.calculate(num1, num2, in);
                    cal.setSave(result);
                    System.out.println("답: " + result);
                } // 세터를 이용하여 save 리스트에 result 이력을 넣는 기능 구현
            }
            ArrayList<Integer> newSave = cal.getSave(); // 게터를 이용하여 리스트를 불러옴
            System.out.println("저장된 계산값: " + newSave); // 현재 저장값 확인 - 저장 되었는지 확인

            // 저장된 값 중 처음값 삭제 기능 구현
            while (true) {
                if (!(newSave.isEmpty())) {
                    System.out.println("저장된 값 중 가장 처음 값 삭제하시겠습니까? (yes 입력시 삭제)");
                    String del = sc.next();
                    if (del.equals("yes")) {
                        cal.setDelete(0);
                        System.out.println("저장된 계산값: " + newSave); // 현재 저장값 확인 - 삭제 되었는지 확인
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String ex = sc.next();
            if (ex.equals("exit")) {
                break;  // 반복문 종료
            }
        }

    }
}
