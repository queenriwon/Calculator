package com.example.Calculator3;

public class ArithmeticCalculator {
    private char operator;
    private double firstNumber;
    private double secondNumber;

    private AbstractOperation operate;

    public ArithmeticCalculator(char operator, double firstNumber, double secondNumber) {
        this.operator = operator;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperate(AbstractOperation operate){
        this.operate = operate;
    }

    public double calculate(){
        double result = operate.operation(firstNumber,secondNumber);
        return result;
    }

}
