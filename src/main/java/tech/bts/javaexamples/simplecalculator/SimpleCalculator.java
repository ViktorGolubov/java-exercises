package tech.bts.javaexamples.simplecalculator;

public class SimpleCalculator {

    private int counter;

    public SimpleCalculator(int c) {
        this.counter = c;
    }


    public int getCounter() {
        return add(0);
    }

    public int add(int с) {

         int result = this.counter += с;
         return result;

    }

    public int multiply(int c) {

        int result = this.counter * c;
        return result;
    }
}
