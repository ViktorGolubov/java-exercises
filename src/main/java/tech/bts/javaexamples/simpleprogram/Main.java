package tech.bts.javaexamples.simpleprogram;

import tech.bts.javaexamples.classes.MathUtil;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(" Hello ");

        // Declare a variable
        int age;
        String name;

        // Assign a value
        age = 15;

        // Declare and assign
        double weight = 40.5;

        if (age <= 18) {
            System.out.println("adult");

        } else {
            System.out.println("kid");
        }


        //for
        for (int i = 1; i <=10; i++ ) {
            System.out.println("i = " + i);
        }

        //while
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        // Create an empty list an add values
        List<String> names = new ArrayList<>();
        names.add("potato");
        names.add("carrot");

        System.out.println(names.get(0));

        // Create a list with some values
        List<Integer> number =
                Arrays.asList(8, 4, 6, 5);
        // Cant do it: numbers.add(3);

        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 30);
        ages.put("Mary", 25);
        System.out.println(ages.get("John"));

        double price = 200;
        double discount = 10;
        final double finalPrice = price - discount;
        System.out.println("The final price is  " + finalPrice);
        // Cant do it: finalPrice = price;

        printHello("John", 30);
        printHello("Mary", 25);

        final double p = MathUtil.power(2,10);
        System.out.println(" 2^10 " + p);


    }



    /** prints hello */
    static void printHello(String name, int age){
        System.out.println("Hello " + name + " you are " + age);

    }



}
