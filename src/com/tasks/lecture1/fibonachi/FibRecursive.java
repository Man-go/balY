package com.tasks.lecture1.fibonachi;

/**
 * Вычисление n-го числа фибоначи при помощи рекурсии.
 */
public class FibRecursive {

    public static long fib(int n) {
        if (n < 0 || n > 92) {
            throw new IllegalArgumentException();
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
