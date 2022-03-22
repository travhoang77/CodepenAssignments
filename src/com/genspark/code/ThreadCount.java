package com.genspark.code;

public class ThreadCount implements Runnable {
    private Thread thread;
    int start;

    public ThreadCount(int start) {
        this.start = start;
    }

    public void run() {
        String result =  "";
        while (start < 10) {
            result = result.concat(String.valueOf(start));
            start = start + 3;
        }
        System.out.println(result);
    }

    public void start() {
        System.out.println("Starting Thread-"  + String.valueOf(start));
        if(thread == null) {
            thread = new Thread(this, String.valueOf(start));
            thread.start();
        }
    }
}

