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

    public int getSign(int c) {
        int result = 0;

        if (c > 0) {
            result = 1;
        } else if (c < 0) {
            result = -1;
        }

        return result;

    }

    public int abs(int с) {
       return this.counter = Math.abs(с);
    }

    public int factorial(int c) {
        int result = 1;
        int x = 1;

        for (c = 4; c > x; c --) {

            result = result * x * c;

        }

        return result;
    }

    public int square() {

        return this.counter * this.counter;
    }
}
