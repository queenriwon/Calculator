package com.example.Calculator3;

public enum OperatorType{
    ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/");

    private String operator;

    OperatorType(String operator) {
        this.operator = operator;
    }

    public String getOperator(){
        return operator;
    }

    public static boolean checkOperator(String operator){
        for(OperatorType op : values()){
            if(op.getOperator().equals(operator)){
                return true;
            }
        }
        return false;
    }
}
