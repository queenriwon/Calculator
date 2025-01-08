package com.example.Calculator3;

public class Main {
    public static void main(String[] args) {
        CalculatorApp app = new CalculatorApp();
        try{
            // 계산기 실행 메서드
            app.run();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
