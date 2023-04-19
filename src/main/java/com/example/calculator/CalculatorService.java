package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String welcomeCalculator() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    public String plus(int num1, int num2) {

        int sum = num1 + num2;
        return num1 + "+" + num2 + "=" + sum;

    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + "-" + num2 + "=" + result;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + "*" + num2 + "=" + result;
    }

    public String divide(int num1, int num2) {
        if (num2 != 0) {
            int result = num1 / num2;
            return num1 + "/" + num2 + "=" + result;
        } else return "На ноль делить нельзя!";
    }
}

