package com.example.Calculator3;

import com.example.Calculator3.Operations.*;

public enum OperatorType{
    ADD("+", new AddOperation()),
    SUBTRACT("-", new SubtractOperation()),
    MULTIPLY("*", new MultiplyOperation()),
    DIVIDE("/", new DivideOperation()),
    REMAINDER("%", new RemainderOperation()),
    POWER("^", new PowerOperation());

    private String operator;
    private AbstractOperation abstractOperation;

    // enum 정보를 연산자와 추상클래스를 상속받은 연산클래스와 매핑
    OperatorType (String operator, AbstractOperation abstractOperation) {
        this.operator = operator;
        this.abstractOperation = abstractOperation;
    }

    // 연산자 또는 연산 클래스의 getter
    public String getOperator() {
        return operator;
    }
    public AbstractOperation getAbstractOperation() {
        return abstractOperation;
    }

    // enum 에서 정의한 연산자가 쓰였는지 확인 후 enum 째로 리턴
    public static OperatorType checkOperator(String operator) {
        for(OperatorType op : values()){
            if(op.getOperator().equals(operator)){
                return op;
            }
        }
        throw new printHowException("[오류] 잘못된 연산자 입니다.");
    }
}
