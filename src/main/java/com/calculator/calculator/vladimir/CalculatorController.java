package com.calculator.calculator.vladimir;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }
    @GetMapping( "/plus")
    public String plus(@RequestParam (name = "num1", required = false) Integer num1, @RequestParam (name = "num2", required=false) Integer num2) {
        return calculatorService.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam (name = "num1", required = false) Integer num1, @RequestParam (name = "num2", required=false) Integer num2) {
        return calculatorService.minus(num1, num2);
    }
    @GetMapping( "/multiply")
    public String multiply(@RequestParam (name = "num1", required = false) Integer num1, @RequestParam (name = "num2", required=false) Integer num2) {
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping( "/divide")
    public String divide(@RequestParam (name = "num1", required = false) Integer num1, @RequestParam (name = "num2", required=false) Integer num2) {
        return calculatorService.divide(num1, num2);
    }
}
