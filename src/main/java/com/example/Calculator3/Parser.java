package com.example.Calculator3;
import java.util.regex.Pattern;

public class Parser<T extends Double> {
    private static final String NUMBER_REG = "^[0-9]+$";

    public ArithmeticCalculator StringOperation(String ans) throws printHowException{
        String[] ansArray = ans.split(" ");

        if(ansArray.length != 3){
            throw new printHowException("[오류] 입력형식을 확인해주세요.");
        }

        char operator = OperatorCheck(ansArray[1]);
        T firstNumber = NumCheck(ansArray[0]);
        T secondNumber = NumCheck(ansArray[2]);

        return new ArithmeticCalculator(operator,firstNumber,secondNumber);
    }

    public char OperatorCheck(String ans){

        char operator = ans.charAt(0);
        if(!OperatorType.checkOperator(operator)){
            throw new printHowException("[오류] 연산자는 +-*/만 사용가능합니다.");
        } else{
            return operator;
        }
    }

    public T NumCheck(String ans){
        if(!Pattern.matches(NUMBER_REG, ans)){
            throw new printHowException("[오류] 연산할 값을 입력하세요.");
        } else{
            return (T) Double.valueOf(ans);
        }
    }
}
