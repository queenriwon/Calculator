package com.example.Calculator3;

public class ArithmeticCalculator {
    private String operator;
    private Number firstNumber;
    private Number secondNumber;
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

    public void setOperator(AbstractOperation operate){
        this.operate = operate;
    }

    public double calculate(){
        double result = operate.operation(firstNumber,secondNumber);
        setResultNumber(result);
        return result;
    }

    public String toString(){
        return firstNumber + " " + operator + " " + secondNumber + " = " + resultNumber;
    }
}