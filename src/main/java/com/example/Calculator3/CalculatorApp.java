package com.example.Calculator3;

import java.util.Scanner;

public class CalculatorApp {

    public void run(){
        Scanner scanner = new Scanner(System.in);
        Parser<Number> parser = new Parser<>();
        ArithmeticCalculator calculator;
        CalculationLookup calculationLookup = new CalculationLookup();

        while (true) {
            try{
                // 1. 입력 : 계산 내용 입력 (입력 형식: 숫자 연산자 숫자)
                System.out.print("계산 식을 입력하세요(숫자 연산자(+-*/%^) 숫자)>> ");
                String ans = scanner.nextLine();

                // 2. 문자열 판단 : exit 입력시 반복 종료
                // lookup 입력시, 저장되어 있는 연산 조회  , exit 입력시, 반복문 종료
                if(ans.equals("exit")) break;
                else if(ans.equals("lookup")) {
                    calculationLookup.run();
                    continue;
                }

                // 3. 입력값 정제 : 문자열을 숫자1 연산자 숫자2로 변환 및 분석하여 인스턴스 형태로 저장
                calculator = parser.StringOperation(ans);

                // 4. 사용할 연산 선택: enum 에서 mapping 된 연산을 set(switch 구문 불필요)
                OperatorType ot = OperatorType.checkOperator(calculator.getOperator());
                calculator.setOperator(ot.getAbstractOperation());

                // 5. 출력 및 저장: 결과값과 함께 연산을 ArrayList 에 저장하고 출력한다.
                double result = calculator.calculate();
                calculationLookup.insertOperationList(calculator);

                if(Double.isNaN(result)){
                    throw new printHowException("[오류] 계산이 불가합니다.");
                }
                System.out.println(result);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("계산기를 종료합니다.");
    }
}
