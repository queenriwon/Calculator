package com.example.Calculator3;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class CalculationLookup {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<ArithmeticCalculator> operationList = new ArrayList<>();

    public CalculationLookup() {
    }

    // 연산을 저장할 수 있음 (App - 5. 출력 및 저장 단계에서 사용)
    public void insertOperationList(ArithmeticCalculator calculator) {
        operationList.add(calculator);
    }

    public void run() throws printHowException {
        // 1. 입력 : 조회하고 싶은 기준 입력(1: 연산자, 2: 결과값)
        System.out.print("조회하고 싶은 기준을 입력하세요(1:연산자, 2:결과값)>> ");
        String loopUpAns = scanner.nextLine();

        if (loopUpAns.equals("1")) {

            // 2-1. 조회기준 연산자 입력 (+-*/%^) 중 1택
            System.out.print("조회하고 싶은 연산자를 입력하세요(+-*/%^)>> ");
            String operatorAns = scanner.nextLine();

            // 2-2. 입력값 판단 : 연산자를 의도에 맞게 입력했는지 확인
            Parser<Number> parser = new Parser<>();
            parser.OperatorCheck(operatorAns);

            // 2-3. 연산자에 맞게 스트림으로 조회 및 출력
            lookUp(calculator -> calculator.getOperator().equals(operatorAns));


        } else if (loopUpAns.equals("2")) {

            // 3-1. 조회기준 부등호와 값 입력 ex) > 10 (결과값이 10이상(>=)인 값 출력)
            System.out.print("입력받은 값의 조건을 입력하세요(부등호(<,>) 숫자)>> ");
            String[] conditionAns = scanner.nextLine().split(" ");

            // 3-2. 문자열 판단 : 잘못된 형식으로 입력시 예외처리됨
            if (conditionAns.length != 2) throw new printHowException("[오류] 잘못된 입력입니다.");
            else if (!conditionAns[0].equals(">") && !conditionAns[0].equals("<"))
                throw new printHowException("[오류] 부등호를 입력해주세요.");

            // 3-3. 입력값 판단 : 숫자를 의도에 맞게 입력했는지 확인
            Parser<Number> parser = new Parser<>();
            double conditionValue = (double) parser.NumCheck(conditionAns[1]);

            // 3-4. 해당되는 부등호에 맞게 스트림으로 조회 및 출력
            if (conditionAns[0].equals(">")) {
                System.out.println("입력된 값 이상의 결과를 출력합니다.");
                lookUp(calculator -> calculator.getResultNumber() >= conditionValue);
            } else if (conditionAns[0].equals("<")) {
                System.out.println("입력된 값 이하의 결과를 출력합니다.");
                lookUp(calculator -> calculator.getResultNumber() <= conditionValue);
            }


        } else {
            throw new printHowException("[오류] 잘못된 입력입니다.");
        }
    }

    // 스트림을 이용하여 조건에 맞는 연산 데이터 조회 및 출력
    public void lookUp(Predicate<ArithmeticCalculator> function) {
        operationList.stream().filter(function)
                .forEach(cal -> System.out.println(cal.toString()));
        System.out.println();
    }
}
