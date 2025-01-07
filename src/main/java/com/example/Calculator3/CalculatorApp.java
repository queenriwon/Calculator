package com.example.Calculator3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CalculatorApp {

    ArrayList<ArithmeticCalculator> operationList = new ArrayList<>();

    public void run(){
        Scanner scanner = new Scanner(System.in);
        Parser parser = new Parser();
        ArithmeticCalculator calculator;

        while (true) {
            try{
                System.out.print("계산 식을 입력하세요(숫자 연산자 숫자)>> ");
                String ans = scanner.nextLine();

                if(ans.equals("exit")) break;
                else if(ans.equals("listup")){

                    System.out.print("조회하고 싶은 기준을 입력하세요(1:연산자, 2:결과값)>> ");
                    int listupAns = scanner.nextInt();
                    scanner.nextLine();

                    if(listupAns == 1){
                        System.out.print("조회하고 싶은 연산자를 입력하세요>> ");
                        String operatorAns = scanner.nextLine();

                        switch (operatorAns){
                            case "+":
                                System.out.println("덧셈 조회"); break;
                            case "-":
                                System.out.println("뺄셈 조회"); break;
                            case "*":
                                System.out.println("곱셈 조회"); break;
                            case "/":
                                System.out.println("나눗셈 조회"); break;
                            default:
                                throw new printHowException("[오류] 잘못된 연산자 입니다.");
                        }
                        operationList.stream().filter(cal -> cal.getOperator().equals(operatorAns))
                                .forEach(cal -> System.out.println(cal.toString()));
                        System.out.println();

                    } else if(listupAns == 2){
                        System.out.print("입력받은 값 이상의 결과값을 출력합니다>> ");
                        double resultAns = scanner.nextDouble();
                        scanner.nextLine();

                        operationList.stream().filter(cal -> cal.getResultNumber() > resultAns)
                                .forEach(cal -> System.out.println(cal.toString()));
                        System.out.println();

                    } else{
                        throw new printHowException("[오류] 잘못된 입력입니다.");
                    }


                } else{

                    calculator = parser.StringOperation(ans);

                    switch (calculator.getOperator()){
                        case "+":
                            calculator.setOperator(new AddOperation()); break;
                        case "-":
                            calculator.setOperator(new SubtractOperation()); break;
                        case "*":
                            calculator.setOperator(new MultiplyOperation()); break;
                        case "/":
                            calculator.setOperator(new DivideOperation()); break;
                    }

                    double result = calculator.calculate();

                    operationList.add(calculator);

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
