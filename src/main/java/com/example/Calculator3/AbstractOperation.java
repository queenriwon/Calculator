package com.example.Calculator3;

abstract class AbstractOperation<T extends Number, U extends Number> {
    abstract double operation(T first, U second);
}

class AddOperation extends AbstractOperation{
    @Override
    double operation(Number first, Number second) {
        return first.doubleValue() + second.doubleValue();
    }
}

class SubtractOperation extends AbstractOperation{
    @Override
    double operation(Number first, Number second) {
        return first.doubleValue() - second.doubleValue();
    }
}

class MultiplyOperation extends AbstractOperation{
    @Override
    double operation(Number first, Number second) {
        return first.doubleValue() * second.doubleValue();
    }
}

class DivideOperation extends AbstractOperation{
    @Override
    double operation(Number first, Number second) {
        if(second.equals(0)) throw new printHowException("[오류] 0으로 나눌 수 없습니다.");
        return first.doubleValue() / second.doubleValue();
    }
}

class RemainderOperation extends AbstractOperation{
    @Override
    double operation(Number first, Number second) {
        if(second.equals(0)) throw new printHowException("[오류] 0으로 나눌 수 없습니다.");
        return first.doubleValue() % second.doubleValue();
    }
}

class PowerOperation extends AbstractOperation{
    @Override
    double operation(Number first, Number second) {
        return Math.pow(first.doubleValue(), second.doubleValue());
    }
}
