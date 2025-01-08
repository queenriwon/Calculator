package com.example.Calculator3;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

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
            System.out.print("조회하고 싶은 연산자를 입력하세요(+-*/)>> ");
            String operatorAns = scanner.nextLine();
            lookupOperator(operatorAns);

        } else if(loopUpAns == 2){
            System.out.print("입력받은 값의 조건을 입력하세요(부등호(<,>) 숫자)>> ");
            String[] conditionAns = scanner.nextLine().split(" ");

            if(conditionAns.length != 2) throw new printHowException("[오류] 잘못된 입력입니다.");
            else if(!conditionAns[0].equals(">") && !conditionAns[0].equals("<"))
                throw new printHowException("[오류] 부등호를 입력해주세요.");

            Parser<Number> parser = new Parser<>();
            double conditionValue = (double) parser.NumCheck(conditionAns[1]);

            if (conditionAns[0].equals(">")){
                System.out.println("입력된 값 이상의 결과를 출력합니다.");
                lookUp(calculator -> calculator.getResultNumber() >= conditionValue);
            } else if (conditionAns[0].equals("<")){
                System.out.println("입력된 값 이하의 결과를 출력합니다.");
                lookUp(calculator -> calculator.getResultNumber() <= conditionValue);
            }

        } else{
            throw new printHowException("[오류] 잘못된 입력입니다.");
        }
    }

    public void lookUp(Predicate<ArithmeticCalculator> function){
        operationList.stream().filter(function)
                .forEach(cal -> System.out.println(cal.toString()));
        System.out.println();
    }

    public void lookupOperator(String operatorAns){
        Parser<Number> parser = new Parser<>();
        parser.OperatorCheck(operatorAns);

        lookUp(calculator -> calculator.getOperator().equals(operatorAns));
    }
}
