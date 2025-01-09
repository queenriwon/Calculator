package com.example.Calculator3.Operations;

// 곱셈 클래스
public class MultiplyOperation extends AbstractOperation {
    @Override
    public double operate(Number first, Number second) {
        return first.doubleValue() * second.doubleValue();
    }
}
