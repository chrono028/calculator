package com.example.Calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int getSum(int a, int b){
        return a + b;
    }
}
