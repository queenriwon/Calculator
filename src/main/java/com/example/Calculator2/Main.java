package com.example.Calculator2;

import java.util.Scanner;
import com.example.Calculator2.Calculator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            // 계산 내용 입력 (입력 형식: 숫자 연산자 숫자)
            System.out.print("계산 식을 입력하세요(remove:연산자 삭제, exit:종료) >> ");
            String ans = scanner.nextLine();

            if(ans.equals("remove")){
                calculator.removeResult();
                continue;
            } else if(ans.equals("exit")) break;

            String[] ansArray = ans.split(" ");

            if(ansArray.length != 3){
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            char operate = ansArray[1].charAt(0);
            double firstNumber = Double.parseDouble(ansArray[0]);
            double secondNumber = Double.parseDouble(ansArray[2]);

            double result = calculator.calculate(operate, firstNumber, secondNumber);

            if (!Double.isNaN(result)){
                System.out.println(result);
            }
        }
        System.out.println("계산기를 종료합니다.");
        scanner.close();
    }
}
