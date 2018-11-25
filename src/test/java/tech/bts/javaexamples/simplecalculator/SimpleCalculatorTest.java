package tech.bts.javaexamples.simplecalculator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Test
    public void add() {

        SimpleCalculator calc = new SimpleCalculator(0);
        calc.add(2);
        calc.add(1);
        assertEquals(calc.getCounter(), 3);
    }

    @Test
    public void multiply() {
        SimpleCalculator calc = new SimpleCalculator(3);
        calc.multiply(4);
        assertEquals(calc.getCounter(), 12);
    }

    @Test
    public void subtract() {
        SimpleCalculator calc = new SimpleCalculator(12);
        calc.subtract(3);
        assertEquals(calc.getCounter(), 9);
    }

    @Test
    public void divide(int с) {
        SimpleCalculator calc = new SimpleCalculator(9);
        calc.divide(2);
        assertEquals(calc.getCounter(), 4);

    }




}