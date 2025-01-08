package com.example.Calculator2;

import java.util.Scanner;
import com.example.Calculator2.Calculator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            try {
                // 계산 내용 입력 (입력 형식: 숫자 연산자 숫자)
                System.out.print("계산 식을 입력하세요(숫자 연산자 숫자)(remove:연산자 삭제, exit:종료) >> ");
                String ans = scanner.nextLine();

                // remove 입력시, 저장되어있는 연산 삭제
                // exit 입력시, 반복문 종료
                if (ans.equals("remove")) {
                    calculator.removeResult();
                    continue;
                } else if (ans.equals("exit")) break;

                // 숫자 연산자 숫자 형식으로 입력했으므로 이를 split 으로 나누어준다.
                // 형식이 다를 경우 잘못된 입력임을 알려주고 반복문을 다시 출력한다.(구체적인 형식에 대한 에러는 lv.3에서 구현)
                String[] ansArray = ans.split(" ");
                if (ansArray.length != 3) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }

                // operate: 연산자(ansArray[1]), firstNumber: 피연산자1(ansArray[0]), secondNumber: 피연산자2(ansArray[2])
                char operate = ansArray[1].charAt(0);
                double firstNumber = Double.parseDouble(ansArray[0]);
                double secondNumber = Double.parseDouble(ansArray[2]);

                // 메소드를 이용하여 결과 출력
                // 만약 결과값이 null값이라면 출력 생략
                double result = calculator.calculate(operate, firstNumber, secondNumber);
                if (!Double.isNaN(result)) {
                    System.out.println(result);
                }

                // 결과를 list에 저장
                calculator.insertResult(operate, firstNumber, secondNumber);

            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("계산기를 종료합니다.");
        scanner.close();
    }
}
