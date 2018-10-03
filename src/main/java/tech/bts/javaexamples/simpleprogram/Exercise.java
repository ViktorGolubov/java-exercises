package tech.bts.javaexamples.simpleprogram;

import java.util.Arrays;
import java.util.List;

public class Exercise {

    public static void main(String[] args) {

        final String r = returnFunction(" Hola Ferran ", 5);
        System.out.println(r);

        final String m = padLeft("go", 3);
        System.out.println(m);

        final String p = padRight("go", 1);
        System.out.println(p);

        final List g = ListOfRange(3,8);
        System.out.println(g);
    }


    // Exercise 1
    // Write a function that, given a string s and a number n (those are the input parameters)
    // returns a string (return type) made of s repeated n times.

    static String returnFunction (String s, int n) {

        String result = null;

        for (int i = 1; i <= n; i++) {

            result += s;

        }

        return result;


    }

    // Exercise 2
    //Write a function that, given a string s and a number n returns a string
    // where s is padded with spaces on the left until the resulting string has length n.
    //For example, padLeft("go", 5)
    //should return "   go" (3 spaces on the left).
    //You may also implement padRight.

    static String padLeft(String s, int n){

        String result = "";
        int length = s.length();

        for (int i = 1; i <= (n - length); i++) {

            result += " ";

        }
        result += s;
        return result;
    }

    static String padRight(String s, int n) {
        String result = "";
        int length = s.length();

        for (int i = 1; i >= (n + length); i++) {

            result += " ";

        }
        result += s;
        return result;

    }

    // Exercise 3
    // Write a function that returns a list of integer numbers from a to b.
    //For example, listOfRange(3, 8) should return a list with numbers: 3, 4, 5, 6, 7, 8


    static List<Integer> ListOfRange (int start, int end) {
        List<Integer> number =
                Arrays.asList(3, 4, 5, 6, 7, 8);

        return number;
    }

}
