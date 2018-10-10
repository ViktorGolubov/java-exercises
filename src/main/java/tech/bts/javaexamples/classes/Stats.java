package tech.bts.javaexamples.classes;

public class Stats {

    private double number;
    private double sum;
    private int count;
    private double result;
    private double max;
    private double min;


    public Stats() {
        this.number = 0;
        this.sum = 0;
        this.count = 0;
        this.result = 0;

    }


    public void add (double x) {
        this.sum += x;
        this.count++;
        this.max = max;
        this.min = x;

        min = x;

        if (min > max) {
            max = x;
        }

    }

    public double getSum() {
        for (int i = 0; i <= number; i++) {

        }

        return sum;
    }

    public int getCount () {

        return count;
    }

    public  double getAverage () {

       result = getSum() / getCount();

        return result;
    }

    public double getMax() {

        return max;
    }

}
