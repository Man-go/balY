package com.tasks.lecture1.fibonachi;

/**
 * Вычисление n-го числа фибоначи с использованием памятию
 */
public class FibLoop {

    public static long fib(int n) {
        if (n < 0 || n > 92) {
            throw new IllegalArgumentException();
        }

        long prev = 0;
        long next = 1;
        long temp;
        for (int i = 0; i < n; i++) {
            temp = next;
            next = prev + next;
            prev = temp;
        }
        return prev;
    }
}
