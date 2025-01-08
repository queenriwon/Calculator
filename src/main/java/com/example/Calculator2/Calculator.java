package com.example.Calculator2;

import java.util.ArrayList;

class Calculator {
    private ArrayList<OperateList> operateList;
    public Calculator(){
        operateList = new ArrayList<>();
    }

    // 계산기 메소드
    public double calculate(){

        // operateList 에 저장된 가장 최근 값을 가져옴
        // 간접접근을 사용하여 값을 가져와(getter) 연산
        int cur_index = operateList.size() - 1;
        OperateList curOperate = operateList.get(cur_index);

        char operate = curOperate.getOperate();
        double firstNum = curOperate.getFirstNumber();
        double secondNum = curOperate.getSecondNumber();

        // 연산자에 따라 조건문으로 결과 출력
        return switch (operate) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            case '/' -> {
                if (secondNum == 0) {
                    System.out.println("[오류] 0으로 나눌 수 없습니다.");
                    yield Double.NaN;
                }
                yield firstNum / secondNum;
            }
            default -> {
                System.out.println("[오류] 잘못된 연산자입니다.");
                yield Double.NaN;
            }
        };
    }

    // 결과를 출력한 연산 저장
    public void insertResult(char operate, double firstNumber, double secondNumber){

        // 간접접근을 사용하여 클래스 필드를 지정(setter)
        OperateList ol = new OperateList();
        ol.setOperate(operate);
        ol.setFirstNumber(firstNumber);
        ol.setSecondNumber(secondNumber);
        operateList.add(ol);
    }

    // 저장된 연산 삭제
    public void removeResult() {

        // 리스트가 비었을 경우 출력
        if(operateList.isEmpty()) {
            System.out.println("저장된 연산이 없습니다.");
            return;
        }

        // 가장 오래된 연산을 삭제하고 무슨 연산을 삭제했는지 출력해준다.
        System.out.println("오래된 연산 삭제");
        OperateList pre_operate = operateList.remove(0);
        System.out.println("삭제된 연산: " + pre_operate.toString());
    }
}