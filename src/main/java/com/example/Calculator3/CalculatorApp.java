package com.example.Calculator3;

import java.util.Scanner;

public class CalculatorApp {

    public void run(){
        Scanner scanner = new Scanner(System.in);
        Parser parser = new Parser();
        ArithmeticCalculator calculator;
        CalculationLookup calculationLookup = new CalculationLookup();

        while (true) {
            try{
                System.out.print("계산 식을 입력하세요(숫자 연산자 숫자)>> ");
                String ans = scanner.nextLine();

                if(ans.equals("exit")) break;
                else if(ans.equals("lookup")){
                    calculationLookup.run();
                } else{

                    calculator = parser.StringOperation(ans);
                    OperatorType ot = OperatorType.checkOperator(calculator.getOperator());
                    calculator.setOperator(ot.getAbstractOperation());

                    double result = calculator.calculate();
                    calculationLookup.insertOperationList(calculator);

                    if(Double.isNaN(result)){
                        throw new printHowException("[오류] 계산이 불가합니다.");
                    }
                    System.out.println(result);

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("계산기를 종료합니다.");
    }
}
