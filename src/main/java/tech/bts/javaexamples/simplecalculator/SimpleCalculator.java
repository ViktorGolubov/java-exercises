package tech.bts.javaexamples.simplecalculator;

public class SimpleCalculator {

    private int counter;

    public SimpleCalculator(int c) {
        this.counter = c;
    }


    public int getCounter() {
        return counter;
    }

    public void add(int с) {

        this.counter += с;


    }

    public void multiply(int c) {

        this.counter = this.counter * c;

    }

    public void subtract(int с) {

        this.counter = this.counter - с;
    }

    public void divide(int с) {

        this.counter = this.counter / с;
    }
}
