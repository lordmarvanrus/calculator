package com.calculator.calculator.vladimir;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ApplicationTests {

    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("providePlus")
    void plus(int num1, int num2, int expected) {
        assertEquals(expected, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideMinus")
    void minus(int num1, int num2, int expected) {
        assertEquals(expected, calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideMultiply")
    void multiply(int num1, int num2, int expected) {
        assertEquals(expected, calculatorService.multiply(num1, num2));
    }

    @Test
    public void divideThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(7.0, 0.0), "На ноль делить нельзя!");
    }
    @ParameterizedTest
    @MethodSource("provideDivision")
    void divide(double num1, double num2, double expected) {
        assertEquals(expected, calculatorService.divide(num1, num2));
    }

    private static Stream<Arguments> providePlus() {
        return Stream.of(
                Arguments.of(4, 2, 6),
                Arguments.of(10, -5, 5),
                Arguments.of(7, 2, 9),
                Arguments.of(7, 0, 7)
        );
    }
    private static Stream<Arguments> provideMinus() {
        return Stream.of(
                Arguments.of(4, 2, 2),
                Arguments.of(10, -5, 15),
                Arguments.of(7, 2, 5),
                Arguments.of(7, 0, 7)
        );
    }
    private static Stream<Arguments> provideMultiply() {
        return Stream.of(
                Arguments.of(4, 2, 8),
                Arguments.of(10, -5, -50),
                Arguments.of(7, 2, 14),
                Arguments.of(7, 0, 0)
        );
    }
    private static Stream<Arguments> provideDivision() {
        return Stream.of(
                Arguments.of(4, 2, 2),
                Arguments.of(10, -5, -2),
                Arguments.of(7, 2, 3.5),
                Arguments.of(-10, 2, -5)
        );
    }


}
