package com.example.Calculator3;

abstract class AbstractOperation<T extends Number, U extends Number> {
    abstract double operation(T first, U second);
}

// 덧셈 클래스
class AddOperation extends AbstractOperation{
    @Override
    double operation(Number first, Number second) {
        return first.doubleValue() + second.doubleValue();
    }
}

// 뺄셈 클래스
class SubtractOperation extends AbstractOperation{
    @Override
    double operation(Number first, Number second) {
        return first.doubleValue() - second.doubleValue();
    }
}

// 곱셈 클래스
class MultiplyOperation extends AbstractOperation{
    @Override
    double operation(Number first, Number second) {
        return first.doubleValue() * second.doubleValue();
    }
}

// 나눗셈 클래스
class DivideOperation extends AbstractOperation{
    @Override
    double operation(Number first, Number second) {
        if(second.equals(0)) throw new printHowException("[오류] 0으로 나눌 수 없습니다.");
        return first.doubleValue() / second.doubleValue();
    }
}

// 나머지 클래스
class RemainderOperation extends AbstractOperation{
    @Override
    double operation(Number first, Number second) {
        if(second.equals(0)) throw new printHowException("[오류] 0으로 나눌 수 없습니다.");
        return first.doubleValue() % second.doubleValue();
    }
}

// 제곱 클래스
class PowerOperation extends AbstractOperation{
    @Override
    double operation(Number first, Number second) {
        return Math.pow(first.doubleValue(), second.doubleValue());
    }
}
