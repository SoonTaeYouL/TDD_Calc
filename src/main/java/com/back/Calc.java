package com.back;

public class Calc {
    public static int run(String exp){
        String[] expression = exp.split(" ");

        int num1 = Integer.parseInt(expression[0]);
        String operator = expression[1];
        int num2 = Integer.parseInt(expression[2]);

        int result = 0;

        if (operator.equals("+")) {
             result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        }
        return result;
    }
}
