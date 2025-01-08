package com.example.Calculator3;

public enum OperatorType{
    ADD("+", new AddOperation()),
    SUBTRACT("-", new SubtractOperation()),
    MULTIPLY("*", new MultiplyOperation()),
    DIVIDE("/", new DivideOperation());

    private String operator;
    private AbstractOperation abstractOperation;

    OperatorType(String operator, AbstractOperation abstractOperation) {
        this.operator = operator;
        this.abstractOperation = abstractOperation;
    }
    public String getOperator(){
        return operator;
    }

    public AbstractOperation getAbstractOperation() {
        return abstractOperation;
    }

    public static OperatorType checkOperator(String operator){
        for(OperatorType op : values()){
            if(op.getOperator().equals(operator)){
                return op;
            }
        }
        throw new printHowException("[오류] 잘못된 연산자 입니다.");
    }
}
