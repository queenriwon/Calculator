package com.example.Calculator3;

public enum OperatorType{
    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/');

    private char operator;

    OperatorType(char operator) {
        this.operator = operator;
    }

    public char getOperator(){
        return operator;
    }

    public static boolean checkOperator(char operator){
        for(OperatorType op : values()){
            if(op.getOperator() == operator){
                return true;
            }
        }
        return false;
    }
}
