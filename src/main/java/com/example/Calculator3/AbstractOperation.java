package com.example.Calculator3;

abstract class AbstractOperation {
    abstract double operation(double first, double second);
}

class AddOperation extends AbstractOperation{
    @Override
    double operation(double first, double second) {
        return first + second;
    }
}

class SubtractOperation extends AbstractOperation{
    @Override
    double operation(double first, double second) {
        return first - second;
    }
}

class MultiplyOperation extends AbstractOperation{
    @Override
    double operation(double first, double second) {
        return first * second;
    }
}

class DivideOperation extends AbstractOperation{
    @Override
    double operation(double first, double second) {
        if(second==0) throw new printHowException("[오류] 0으로 나눌 수 없습니다.");
        return first / second;
    }
}