package com.example.Calculator3;

import com.example.Calculator3.Operations.AbstractOperation;

public class ArithmeticCalculator {
    private final String operator;
    private final Number firstNumber;
    private final Number secondNumber;
    private double resultNumber;
    private AbstractOperation operate;

    public double getResultNumber() {
        return resultNumber;
    }

    public void setResultNumber(double resultNumber) {
        this.resultNumber = resultNumber;
    }

    public ArithmeticCalculator(String operator, Number firstNumber, Number secondNumber) {
        this.operator = operator;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperate(AbstractOperation operate){
        this.operate = operate;
    }

    // 설정된 연산 클래스를 이용해 연산
    public double calculate(){
        double result = operate.operate(firstNumber,secondNumber);
        setResultNumber(result);
        return result;
    }

    // 조회시 출력형태 정의
    public String toString(){
        return firstNumber + " " + operator + " " + secondNumber + " = " + resultNumber;
    }
}