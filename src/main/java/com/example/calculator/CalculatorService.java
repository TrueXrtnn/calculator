package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String welcomeCalculator() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    public int plus(int num1, int num2) {

        int sum = num1 + num2;
        return sum;

    }

    public int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else throw new IllegalArgumentException();
    }
}

