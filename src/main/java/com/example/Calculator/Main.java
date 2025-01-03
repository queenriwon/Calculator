package com.example.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("계산 식을 입력하세요>> ");
            String ans = scanner.nextLine();

            if(ans.equals("exit")) break;

            String[] ansArray = ans.split(" ");

            if(ansArray.length != 3){
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            char operate = ansArray[1].charAt(0);
            double firstNumber = Double.parseDouble(ansArray[0]);
            double secondNumber = Double.parseDouble(ansArray[2]);

            switch (operate){
                case '+': System.out.println(firstNumber + secondNumber); break;
                case '-': System.out.println(firstNumber - secondNumber); break;
                case '*': System.out.println(firstNumber * secondNumber); break;
                case '/':
                    if(secondNumber == 0){
                        System.out.println("0으로 나눌 수 없습니다.");
                    } else{
                        System.out.println(firstNumber / secondNumber);
                    }
                    break;
                default: System.out.println("잘못된 연산자입니다.");
            }
        }
        System.out.println("계산기를 종료합니다.");
        scanner.close();
    }
}