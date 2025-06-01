package com.back;

public class Calc {
    public static int run(String exp){
        String[] expression = exp.split(" \\+ ");

        int num1 = Integer.parseInt(expression[0]);
        int num2 = Integer.parseInt(expression[1]);

        return num1 + num2;
    }
}
