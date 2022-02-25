package com.ylab.lecture1.fibonachi;

/**
 * Вычисление n-го числа фибоначи с сокращением памяти.
 */
public class FibLoopMemoryReduce {

    public static long fib(int n) {
        if (n < 0 || n > 92) {
            throw new IllegalArgumentException();
        }
        long[] cache = new long[2];
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 1; i <= n; i++) {
            cache[i % 2] = cache[0] + cache[1];
        }
        return cache[n % 2];
    }
}
