package com.geekbrains.lesson3;

import com.geekbrains.lesson3.Lock.FlowSafeCounter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FlowSafeCounter co = new FlowSafeCounter();
        Thread thredInc = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                co.increment();
            }
        });

        Thread threadDec = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                co.decrement();
            }
        });
        thredInc.start();
        threadDec.start();
        thredInc.join();
        threadDec.join();

        System.out.println(co.getCount());
    }
}
