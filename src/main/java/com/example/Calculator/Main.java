package com.example.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try{
                // 1. 입력 : 계산 내용 입력 (입력 형식: 숫자 연산자 숫자)
                System.out.print("계산 식을 입력하세요(숫자 연산자 숫자)(exit:종료)>> ");
                String ans = scanner.nextLine();

                // 2. 문자열 판단 : exit 입력시 반복 종료
                if(ans.equals("exit")) break;

                // 3. 입력값 정제 : 형식에 맞추어 문자열을 split 한다.
                // 형식이 다를 경우 잘못된 입력임을 알려주고 반복문을 다시 출력한다.(구체적인 형식에 대한 에러는 lv.3에서 구현)
                String[] ansArray = ans.split(" ");
                if(ansArray.length != 3){
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }

                // 4. 입력값 변수저장
                // operate: 연산자(ansArray[1]), firstNumber: 피연산자1(ansArray[0]), secondNumber: 피연산자2(ansArray[2])
                char operate = ansArray[1].charAt(0);
                double firstNumber = Double.parseDouble(ansArray[0]);
                double secondNumber = Double.parseDouble(ansArray[2]);

                // 5. 출력 : 연산자에 따라 조건문으로 결과 출력
                switch (operate){
                    case '+': System.out.println(firstNumber + secondNumber); break;
                    case '-': System.out.println(firstNumber - secondNumber); break;
                    case '*': System.out.println(firstNumber * secondNumber); break;
                    case '/':
                        if(secondNumber == 0){
                            System.out.println("[오류] 0으로 나눌 수 없습니다.");
                        } else{
                            System.out.println(firstNumber / secondNumber);
                        }
                        break;
                    default: System.out.println("[오류] 잘못된 연산자입니다.");
                }
            }catch (Exception e){
                // 오류발생시 오류 출력
                System.out.println(e.getMessage());
            }
        }
        System.out.println("계산기를 종료합니다.");
        scanner.close();
    }
}