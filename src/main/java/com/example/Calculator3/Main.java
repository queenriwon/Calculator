package com.example.Calculator3;

public class Main {
    public static void main(String[] args) {
        CalculatorApp app = new CalculatorApp();
        try{
            app.run();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
