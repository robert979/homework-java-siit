package com.siit.tema12.thread.ciorna;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        MyThreadClass myfirstThread = new MyThreadClass();
        myfirstThread.start();
        for (int i=0; i<= 100; i++){

        System.out.println(Thread.currentThread().getName() + " " + i);

        }
    }
}
