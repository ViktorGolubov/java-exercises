package tech.bts.javaexamples.simplecalculator;

import org.junit.Test;

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
    public void divide() {
        SimpleCalculator calc = new SimpleCalculator(9);
        calc.divide(2);
        assertEquals(calc.getCounter(), 4);

    }

    @Test
    public void get_sign_0() {
        SimpleCalculator calc = new SimpleCalculator(0);
        calc.getSign(0);
        assertEquals(calc.getSign(0), 0);

    }

    @Test
    public void get_sign_1() {
        SimpleCalculator calc = new SimpleCalculator(5);
        calc.getSign(5);
        assertEquals(calc.getSign(1), 1);

    }

    @Test
    public void get_sign_less_than_0() {
        SimpleCalculator calc = new SimpleCalculator(-5);
        calc.getSign(-5);
        assertEquals(calc.getSign(-1), -1);

    }

    @Test
    public void abs() {
        SimpleCalculator calc = new SimpleCalculator(-5);
        calc.abs(-5);
        assertEquals(calc.getCounter(), 5);

    }
    @Test
    public void factorial() {
        SimpleCalculator calc = new SimpleCalculator(2);
        calc.add(2);
        calc.factorial(4);
        assertEquals(calc.factorial(4), 24);

    }

    @Test
    public void square () {
        SimpleCalculator calc = new SimpleCalculator(2);
        calc.add(2);
        calc.square();
        assertEquals(calc.square(), 16);

    }

}