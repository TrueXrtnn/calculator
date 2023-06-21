package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.calculator.Numbers.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest3 {

    private CalculatorService service;

    @BeforeEach
    public void sutUp() {
        service = new CalculatorService();
    }

    public static Stream<Arguments> provideParamsForTheTests() {
        return Stream.of(
                Arguments.of(num1, num2),
                Arguments.of(num3, num4)
        );
    }

    public static Stream<Arguments> provideParamsForTheDivideNullTests() {
        return Stream.of(
                Arguments.of(num1, numZero),
                Arguments.of(num3, numZero)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTheTests")
    public void plusParametrizedTest(int num1, int num2) {
        int actual = service.plus(num1, num2);
        int expected = num1 + num2;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTheTests")
    public void minusParametrizedTest(int num1, int num2) {
        int actual = service.minus(num1, num2);
        int expected = num1 - num2;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTheTests")
    public void multiplyParametrizedTest(int num1, int num2) {
        int actual = service.multiply(num1, num2);
        int expected = num1 * num2;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTheTests")
    public void divideParametrizedTest(double num1, double num2) {
        double actual = service.divide(num1, num2);
        double expected = num1 / num2;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTheDivideNullTests")
    public void divideNullParametrizedTest(int num1, int numZero){
        assertThrows(IllegalArgumentException.class, () -> service.divide(num1, numZero));
    }
}