package com.example;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import static org.testng.Assert.*;


public class CalculatorTest {
    private Calculator calculator;
    private WebDriver driver;

    @Test
    public void additionTest(){
        calculator = new Calculator();
        int result = calculator.add(4, 7);
        assertEquals(result,11);
    }

    @Test
    public void subtractTest(){
        calculator = new Calculator();
        int result = calculator.subtract(9, 6);
        assertEquals(result,3);
    }
    @Test
    public void divisionTest(){
        calculator = new Calculator();
        int result = calculator.divide(25, 5);
        assertEquals(result,5);
    }

    @Test
    public void multiplicationTest(){
        calculator = new Calculator();
        int result = calculator.multiply(7, 9);
        assertEquals(result,63);
    }

}
