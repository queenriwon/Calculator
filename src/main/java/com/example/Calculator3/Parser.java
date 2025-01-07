package com.example.Calculator3;
import java.math.BigDecimal;

public class Parser<T extends Number> {
    private static final String NUMBER_REG = "^[0-9]+$";

    public ArithmeticCalculator StringOperation(String ans) throws printHowException{
        String[] ansArray = ans.split(" ");

        if(ansArray.length != 3){
            throw new printHowException("[오류] 입력형식을 확인해주세요.");
        }

        String operator = OperatorCheck(ansArray[1]);
        Number firstNumber = NumCheck(ansArray[0]);
        Number secondNumber = NumCheck(ansArray[2]);

        return new ArithmeticCalculator(operator,firstNumber,secondNumber);
    }

    public String OperatorCheck(String operator){

        if(!OperatorType.checkOperator(operator)){
            throw new printHowException("[오류] 연산자는 +-*/만 사용가능합니다.");
        } else{
            return operator;
        }
    }

    public Number NumCheck(String ans){
        try{
            BigDecimal number =new BigDecimal(ans);

            if(number.scale() > 0){
                return number.doubleValue();
            }else {
                return number.intValue();
            }
        } catch (Exception e){
            throw new printHowException("[오류] 연산할 값을 입력하세요.2");
        }
    }
}
