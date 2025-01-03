package com.example.Calculator2;

class OperateList{
    private char operate;
    private double firstNumber;
    private double secondNumber;

    public OperateList(char operate, double firstNumber, double secondNumber) {
        this.operate = operate;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public char getOperate() {
        return operate;
    }

    public void setOperate(char operate) {
        this.operate = operate;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
