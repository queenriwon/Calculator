package com.example.Calculator3;

// 나머지 클래스
public class RemainderOperation extends AbstractOperation {
    @Override
    double operate(Number first, Number second) {
        return first.doubleValue() % second.doubleValue();
    }
}
