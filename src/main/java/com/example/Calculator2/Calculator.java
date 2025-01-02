package com.example.Calculator2;

import com.example.Calculator2.OperateList;

import java.util.ArrayList;

class Calculator {
        private ArrayList<OperateList> operateList;
    public Calculator(){
        operateList = new ArrayList<OperateList>();
    }

    public double calculate(char operate, int firstNumber, int secondNumber){

        operateList.add(new OperateList(operate,firstNumber,secondNumber));

        return 0;

    }
}
