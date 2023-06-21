package com.example.calculator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    CalculatorService service = new CalculatorService();

    @Test
    void welcomeCalculator() {
        var expected = service.welcomeCalculator();
        assertEquals("<b>Добро пожаловать в калькулятор!</b>", expected);


    }

    @Test
    void plus() {
        var expected1 = service.plus(1, 2);
        var expected2 = service.plus(-4, 2);
        assertEquals("1+2=3", expected1);
        assertEquals("-4+2=-2", expected2);

    }

    @Test
    void minus() {
        var expected1 = service.minus(1, 2);
        var expected2 = service.minus(-4, 2);
        assertEquals("1-2=1", expected1);
        assertEquals("-4-2=-6", expected2);
    }

    @Test
    void multiply() {
        var expected1 = service.multiply(1, 2);
        var expected2 = service.multiply(-4, 2);
        assertEquals("1*2=2", expected1);
        assertEquals("-4*2=-8", expected2);
    }

    @Test
    void divide() {
        var expected1 = service.divide(1, 2);
        var expected2 = service.divide(-4, 2);
        assertEquals("1/2=0.5", expected1);
        assertEquals("-4/2=-2.0", expected2);
    }

    @Test
    void divideForZero() {
       assertThrows( IllegalArgumentException.class, ()-> service.divide(1, 0));
        assertThrows( IllegalArgumentException.class, ()-> service.divide(-7, 0));
    }
}