package com.example.Calculator3.Operations;

// 덧셈 클래스
public class AddOperation extends AbstractOperation {
    @Override
    public double operate(Number first, Number second) {
        return first.doubleValue() + second.doubleValue();
    }
}