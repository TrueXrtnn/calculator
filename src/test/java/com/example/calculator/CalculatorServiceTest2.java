package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest2 {
    CalculatorService service = new CalculatorService();
    CalculatorController controller = new CalculatorController(service);
    int num1, num2 , num3, num4;
    String expected;
    @BeforeEach
    void setUp() {
        num1 = 1;
        num2 = -1;
        num3 = 4;
        num4 = 0;
        expected = controller.welcomeCalculator();
    }

    @Test
    void welcomeCalculator() {
        assertEquals("<b>Добро пожаловать в калькулятор!</b>", expected);
    }

    @Test
    void plus() {
        assertEquals("1+-1=0", controller.plus(num1, num2));
        assertEquals("4+0=4", controller.plus(num3, num4));

    }

    @Test
    void minus() {
        assertEquals("1--1=2", controller.minus(num1, num2));
        assertEquals("4-0=4", controller.minus(num3, num4));
    }

    @Test
    void multiply() {
        assertEquals("1*-1=-1", controller.multiply(num1, num2));
        assertEquals("4*0=0", controller.multiply(num3, num4));
    }

    @Test
    void divide() {
        assertEquals("1/-1=-1.0", controller.divide(num1, num2));
        assertEquals("0/4=0.0", controller.divide(num4, num3));
    }
}