package com.example.Calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            try {
                // 1. 입력 : 계산 내용 입력 (입력 형식: 숫자 연산자 숫자)
                System.out.print("계산 식을 입력하세요(숫자 연산자 숫자)(remove:연산자 삭제, exit:종료) >> ");
                String ans = scanner.nextLine();

                // 2. 문자열 판단 : exit 입력시 반복 종료
                // remove 입력시, 저장되어있는 연산 삭제 , exit 입력시, 반복문 종료
                if (ans.equals("remove")) {
                    calculator.removeResult();
                    continue;
                } else if (ans.equals("exit")) break;

                // 3. 입력값 정제 : 형식에 맞추어 문자열을 split 한다.
                // 형식이 다를 경우 잘못된 입력임을 알려주고 반복문을 다시 출력한다.(구체적인 형식에 대한 에러는 lv.3에서 구현)
                String[] ansArray = ans.split(" ");
                if (ansArray.length != 3) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }

                // 4. 입력값 변수저장
                // operate: 연산자(ansArray[1]), firstNumber: 피연산자1(ansArray[0]), secondNumber: 피연산자2(ansArray[2])
                char operate = ansArray[1].charAt(0);
                double firstNumber = Double.parseDouble(ansArray[0]);
                double secondNumber = Double.parseDouble(ansArray[2]);

                // 5. 저장 : 결과를 list 에 저장
                calculator.insertResult(operate, firstNumber, secondNumber);

                // 6. 출력 : 메소드를 이용하여 결과 출력
                // 만약 결과값이 null 값이라면 출력 생략
                double result = calculator.calculate();
                if (!Double.isNaN(result)) {
                    System.out.println(result);
                }

            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("계산기를 종료합니다.");
        scanner.close();
    }
}
