package tech.bts.javaexamples.classes;

public class Stats {

    private double sum;
    private int count;
    private double max;
    private double min;


    public Stats() {
        this.sum = 0;
        this.count = 0;
        this.max = Double.MIN_VALUE;
        this.min = Double.MAX_VALUE;

    }


    public void add (double x) {
        this.sum += x;
        this.count++;

        if (max < x) {
            max = x;
        }

        if (min > x) {
            min = x;
        }
    }

    public double getSum() {

        return sum;
    }

    public int getCount () {

        return count;
    }

    public  double getAverage () {

      double average = getSum() / getCount();

        return average;
    }

    public double getMax() {

        return max;
    }

    public  double getMin () {

        return min;
    }

}
