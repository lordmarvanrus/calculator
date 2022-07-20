package com.calculator.calculator.vladimir;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements  CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);

    }

    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);

    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new NullPointerException("На ноль делить нельзя!");
        }
            return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
