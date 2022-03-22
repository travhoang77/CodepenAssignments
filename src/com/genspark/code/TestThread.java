package com.genspark.code;

//Try to print number from 1 to 10 using three different threads. Thread 1 should print 1, 4, 7 and thread 2 should print 2, 5, 8 and likewise.
public class TestThread {
    public static void main(String[] args) {
        ThreadCount threadCount1 =  new ThreadCount(1);
        ThreadCount threadCount2 =  new ThreadCount(2);
        ThreadCount threadCount3 =  new ThreadCount(3);
        threadCount1.start();
        threadCount2.start();
        threadCount3.start();
    }
}
