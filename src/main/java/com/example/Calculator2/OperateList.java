package com.example.Calculator2;

class OperateList{
    private char operate;
    private double firstNumber;
    private double secondNumber;

    public OperateList() {
    }
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

    // 어떤 연산자를 삭제했는지 출력하기 위해 toString 오버라이딩
    @Override
    public String toString() {
        return firstNumber + " " + operate + " " + secondNumber;
    }
}