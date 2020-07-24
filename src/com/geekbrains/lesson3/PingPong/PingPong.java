package com.geekbrains.lesson3.PingPong;

public class PingPong {
    public static void main(String[] args) {
        Object m = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (m) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Ping");
                        try {
                            m.notify();
                            Thread.sleep(700);
                            m.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    m.notify();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (m) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Pong");
                        try {
                            m.notify();
                            Thread.sleep(700);
                            m.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    m.notify();
                }
            }
        }).start();
    }
}
