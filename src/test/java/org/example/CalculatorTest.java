package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


/**
 * Unit test for simple App.
 */
public class CalculatorTest {

    @Test
    public void twoPlusTwo(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.sum(2, 2), 4);
    }

    @Test
    public void twoPlusOne(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.sum(2, 1), 3);
    }

    @Test
    public void fiveMinusThree(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.substraction(5, 3), 2);
    }

    @Test
    public void sixByTwo(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.division(6, 2), 3);
    }

    @Test
    public void fourTimesFour(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.multiplication(4, 4), 16);
    }
    
    @Test
    public void fiveTimesTwo(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.multiplication(5, 2), 10);
    }
}
