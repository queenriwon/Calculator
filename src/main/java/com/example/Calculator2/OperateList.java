package com.example.Calculator2;

class OperateList{
    private char operate;
    private int firstNumber;
    private int secondNumber;

    public OperateList(char operate, int firstNumber, int secondNumber) {
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

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
