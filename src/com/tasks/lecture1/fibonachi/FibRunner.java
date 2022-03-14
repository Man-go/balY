package com.tasks.lecture1.fibonachi;

public class FibRunner {

    public static void main(String[] args) {
        System.out.println(FibRecursive.fib(10));
        System.out.println(FibLoop.fib(90));
        System.out.println(FibRecursiveCache.fib(90));
        System.out.println(FibLoopMemoryReduce.fib(90));
        System.out.println(Long.MAX_VALUE);
        //9_223_372_036_854_775_807
    }
}
