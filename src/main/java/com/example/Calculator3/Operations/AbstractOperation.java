package com.example.Calculator3.Operations;

// 추상클래스
// AddOperation, SubtractOperation, MultiplyOperation, DivideOperation
// RemainderOperation, PowerOperation 에 상속
public abstract class AbstractOperation<T extends Number, U extends Number> {
    public abstract double operate(T first, U second);
}

