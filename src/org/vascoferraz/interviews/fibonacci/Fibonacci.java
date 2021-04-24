package org.vascoferraz.interviews.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {

        List<Integer> fibonacciNumber = new ArrayList();

        fibonacciNumber.add(0);
        fibonacciNumber.add(1);

        for (int i = 2; i <= 1000; i++) {
            fibonacciNumber.add(fibonacciNumber.get(i-1) + fibonacciNumber.get(i-2));
        }

        System.out.println(fibonacciNumber);
    }
}
