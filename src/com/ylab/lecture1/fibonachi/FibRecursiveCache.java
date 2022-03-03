package com.ylab.lecture1.fibonachi;

/**
 * Вычисление n-го числа фибоначи при помощи рекурсии и кэширования
 * вычисленных элементов.
 */
public class FibRecursiveCache {
    static long[] cache = new long[92];

    public static long fib(int n) {
        if (n < 0 || n > 92) {
            throw new IllegalArgumentException();
        }

        if (cache[n] == 0) {
            if (n == 1 || n == 2) {
                cache[n] = 1;
            } else {
                cache[n] = fib(n - 1) + fib(n - 2);
            }
        }
        return cache[n];
    }
}
