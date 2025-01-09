package com.example.Calculator3;

// 덧셈 클래스
public class AddOperation extends AbstractOperation {
    @Override
    double operate(Number first, Number second) {
        return first.doubleValue() + second.doubleValue();
    }
}