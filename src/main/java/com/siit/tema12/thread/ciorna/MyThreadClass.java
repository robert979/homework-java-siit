package com.siit.tema12.thread.ciorna;

import lombok.SneakyThrows;

public class MyThreadClass extends Thread {
    @SneakyThrows
    @Override
    public void run() {
        Thread.currentThread().setName("my first thread");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        for (int i=1; i<=100; i++){
        System.out.println(Thread.currentThread().getName() +" " + i);
        Thread.sleep(10);
        }
    }
}
