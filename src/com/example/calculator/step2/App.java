package com.example.calculator.step2;


/**
 * Created by IntelliJ IDEA.
 * User: jeongjihun
 * Date: 26. 1. 13.
 * Time: 오후 3:53
 **/

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        // 반환값이 잘 나오는지 확인
        int cal1 = cal.calculate(1, 6, '+');
        System.out.println("답: " + cal1);

    }
}
