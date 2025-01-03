package com.example.Calculator2;

import com.example.Calculator2.OperateList;
import java.util.ArrayList;

class Calculator {
    private ArrayList<OperateList> operateList;
    public Calculator(){
        operateList = new ArrayList<OperateList>();
    }

    public double calculate(char operate, double firstNumber, double secondNumber){
        operateList.add(new OperateList(operate,firstNumber,secondNumber));

        int cur_index = operateList.size() - 1;
        OperateList curOperate = operateList.get(cur_index);

        char oper = curOperate.getOperate();
        double firstNum = curOperate.getFirstNumber();
        double secondNum = curOperate.getSecondNumber();

        switch (oper){
            case '+':
                return firstNum + secondNum;
            case '-':
                return firstNum - secondNum;
            case '*':
                return firstNum * secondNum;
            case '/':
                if(secondNum == 0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                return firstNum / secondNum;
            default:
                System.out.println("잘못된 연산자입니다.");
                return 0;
        }
    }

    public void removeResult() {
        System.out.println("오래된 연산 삭제");
        OperateList pre_operate = operateList.remove(0);

        char operate = pre_operate.getOperate();
        double firstNum = pre_operate.getFirstNumber();
        double secondNum = pre_operate.getSecondNumber();
        System.out.println("삭제된 연산: " + firstNum + " " + operate + " " + secondNum);
    }
}