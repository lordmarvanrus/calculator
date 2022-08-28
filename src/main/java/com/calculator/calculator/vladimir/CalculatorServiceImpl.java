package com.calculator.calculator.vladimir;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Не был передан один из параметров");
        }
        return num1 + num2;
    }

    public int minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Не был передан один из параметров");
        }
        return num1 - num2;

    }

    public int multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Не был передан один из параметров");
        }
        return num1 * num2;

    }

    public double divide(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Не был передан один из параметров");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return num1 / num2;
    }
}
