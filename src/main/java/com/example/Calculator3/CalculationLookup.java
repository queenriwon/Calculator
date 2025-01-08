package com.example.Calculator3;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculationLookup {
    Scanner scanner = new Scanner(System.in);
    ArrayList<ArithmeticCalculator> operationList = new ArrayList<>();
    public CalculationLookup(){
    }

    public void insertOperationList(ArithmeticCalculator calculator){
        operationList.add(calculator);
    }

    public void run(){
        System.out.print("조회하고 싶은 기준을 입력하세요(1:연산자, 2:결과값)>> ");
        int loopUpAns = scanner.nextInt();
        scanner.nextLine();

        if(loopUpAns == 1){
            System.out.print("조회하고 싶은 연산자를 입력하세요>> ");
            String operatorAns = scanner.nextLine();
            lookupOperator(operatorAns);

        } else if(loopUpAns == 2){
            System.out.print("입력받은 값 이상의 결과값을 출력합니다>> ");
            double resultAns = scanner.nextDouble();
            scanner.nextLine();
            lookupResult(resultAns);

        } else{
            throw new printHowException("[오류] 잘못된 입력입니다.");
        }
    }

    public void lookupOperator(String operatorAns){
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
    }

    public void lookupResult(double resultAns){
        operationList.stream().filter(cal -> cal.getResultNumber() > resultAns)
                .forEach(cal -> System.out.println(cal.toString()));
        System.out.println();
    }
}
