package com.example.Calculator3;

// 제곱 클래스
public class PowerOperation extends AbstractOperation {
    @Override
    double operate(Number first, Number second) {
        return Math.pow(first.doubleValue(), second.doubleValue());
    }
}
