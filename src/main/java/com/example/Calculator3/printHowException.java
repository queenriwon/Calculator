package com.example.Calculator3;

// 오류 메세지 정의
public class printHowException extends RuntimeException {
    public printHowException(String message) {
        super(message);
    }
}
