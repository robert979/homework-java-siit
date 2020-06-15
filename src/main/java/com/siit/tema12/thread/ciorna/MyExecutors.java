package com.siit.tema12.thread.ciorna;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyExecutors {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService myThreadPool = Executors.newSingleThreadExecutor();
        Future<String> futureResults = myThreadPool.submit(()->{
            Thread.sleep(5000);
                    System.out.println("process in: " + Thread.currentThread().getName());
                    return "results of processing";
                } ) ;
        System.out.println(LocalDateTime.now());
        String result = futureResults.get(); //aici threadul main asteapta ca taskul submis sa se termine
        System.out.println("result after" + LocalDateTime.now() + " = " + result);
        myThreadPool.shutdown();
    }
}

/*
  ExecutorService threadPool = Executors.newSingleThreadExecutor();//similar cu java.util.stream.Collectors

        Future<String> futureResult = threadPool.submit(() -> {
            //do some processing
            Thread.sleep(5000);
            System.out.println("process in: " + Thread.currentThread().getName());
            return "result of processing";
        });

        System.out.println(LocalDateTime.now());
        String result = futureResult.get(); //aici threadul main asteapta ca taskul submis sa se termine
        System.out.println("result after" + LocalDateTime.now() + " = " + result);
        threadPool.shutdown();
    }
}
 */