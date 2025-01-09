package com.example.Calculator3;

// 나머지 클래스
public class RemainderOperation extends AbstractOperation {
    @Override
    double operate(Number first, Number second) {
        if(second.equals(0)) throw new printHowException("[오류] 0으로 나눌 수 없습니다.");
        return first.doubleValue() % second.doubleValue();
    }
}
