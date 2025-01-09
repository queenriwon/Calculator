package com.example.Calculator3.Operations;

// 뺄셈 클래스
public class SubtractOperation extends AbstractOperation {
    @Override
    public double operate(Number first, Number second) {
        return first.doubleValue() - second.doubleValue();
    }
}