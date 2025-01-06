package com.example.Calculator3;

public class ArithmeticCalculator {
    private char operator;
    private Number firstNumber;
    private Number secondNumber;

    private AbstractOperation operate;

    public ArithmeticCalculator(char operator, Number firstNumber, Number secondNumber) {
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
