package com.example.Calculator3;

// 뺄셈 클래스
public class SubtractOperation extends AbstractOperation {
    @Override
    double operate(Number first, Number second) {
        return first.doubleValue() - second.doubleValue();
    }
}