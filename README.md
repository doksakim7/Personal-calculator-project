## 프로젝트 소개
이 프로젝트는 내일배움캠프에서 진행한 계산기 과제입니다. 
Java의 기본 문법과 객체지향 개념(클래스 분리, 메서드 설계 등)을 연습하기 위해
사칙연산 기능을 가진 콘솔 기반 계산기를 구현했습니다.


## 주요 기능
- 0 이상의 정수 2개를 입력받아 사칙연산(+, -, *, /) 수행
- 계산 결과를 내부 컬렉션에 저장
- 저장된 결과값 삭제 기능 제공(가장 오래된 결과부터 순차 삭제)


## 기술 스택
- Language: Java 
- JDK: openjdk 17.0.17
- Environment: Console Application



## 프로젝트 구조
src/
├─ com.example.calculator
│  ├─ step1         // Java 기본 문법만 사용한 사칙연산 계산기
│  │  ├─ App.java   // step1 의 main 메서드, 프로그램 실행 및 입력 처리
│  ├─ step2                  // 클래스를 분리하여 만든 사칙연산 계산기
│  │  ├─ App.java            // step2 의 main 메서드, 프로그램 실행 및 입력 처리
│  │  ├─ Calculator          // 사칙연산 로직, 결과 저장 및 삭제 관리
│  ├─ step3                             // enum, lambda, stream 등의 활용한 사칙연산 계산기(미구현, 진행중…)
│  │  ├─ App.java                       // step3 의 main 메서드, 프로그램 실행 및 입력 처리
│  │  ├─ ArithmeticCalculator.java      // 사칙연산 로직, 결과 저장 및 삭제 관리
│  │  ├─ OperatorType.java              // enum 클래스, 사칙연산 기호 관리
└─ Calculator.java     // main 메서드, Hello, Calculator! 출력                



## 라이센스
- This project is licensed under the MIT License.
