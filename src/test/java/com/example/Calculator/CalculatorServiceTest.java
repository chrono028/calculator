package com.example.Calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    private CalculatorService calculatorService = new CalculatorService();

    @Test
    public void sum_shouldReturn_correctValue() {
        int a = 3;
        int b = 3;
        int  sum = 6;


        assertEquals(calculatorService.getSum(a,b),sum);
    }
}
