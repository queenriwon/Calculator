package com.example.Calculator3;

// 추상클래스
// AddOperation, SubtractOperation, MultiplyOperation, DivideOperation
// RemainderOperation, PowerOperation 에 상속
abstract class AbstractOperation<T extends Number, U extends Number> {
    abstract double operate(T first, U second);
}

