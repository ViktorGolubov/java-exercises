package tech.bts.javaexamples.simplecalculator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Test
    public void add() {

        SimpleCalculator с = new SimpleCalculator(0);
        с.add(2);
        с.add(1);
        assertEquals(с.getCounter(), 3);
    }

    @Test
    public void multiply() {
        SimpleCalculator с = new SimpleCalculator(3);
        с.multiply(4);
        assertEquals(с.getCounter(), 12);
    }
}