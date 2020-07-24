package com.geekbrains.lesson3.Lock;

import java.util.concurrent.locks.ReentrantLock;

public class FlowSafeCounter extends Thread {

    private ReentrantLock lock = new ReentrantLock();
    private int count;

    @Override
    public void run() {
        while (count != 20) {
            increment();
        }
    }

    public void increment() {
        lock.lock();
        try {
            count++;
            System.out.println(count);
        } finally {
            lock.unlock();
        }
    }

    public void decrement() {
        lock.lock();
        try {
            count--;
            System.out.println(count);
        } finally {
            lock.unlock();
        }
    }

    public int getCount(){
        return count;
    }

}