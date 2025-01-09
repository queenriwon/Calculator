package com.example.Calculator3;
import java.math.BigDecimal;

public class Parser<T extends Number> {

    // 문자열 입력값 변환 및 분석(parse)
    public ArithmeticCalculator stringOperation (String ans) {

        String[] ansArray = ans.split(" ");
        if(ansArray.length != 3){
            throw new printHowException("[오류] 입력형식을 확인해주세요.");
        }

        String operator = OperatorCheck(ansArray[1]);
        Number firstNumber = NumCheck(ansArray[0]);
        Number secondNumber = NumCheck(ansArray[2]);

        return new ArithmeticCalculator(operator,firstNumber,secondNumber);
    }

    // 연산자 체크(enum 으로 정의된 연산자가 사용되었는지)
    public String OperatorCheck(String operator){
        OperatorType ot = OperatorType.checkOperator(operator);
        return ot.getOperator();
    }

    // 숫자 체크(double 형 또는 int 형인지 판단 후 사용)
    public Number NumCheck(String ans){
        try{
            BigDecimal number =new BigDecimal(ans);

            if(number.scale() > 0) {
                return number.doubleValue();
            }
            return number.intValue();
        } catch (Exception e){
            throw new printHowException("[오류] 연산할 값을 입력하세요.");
        }
    }
}
