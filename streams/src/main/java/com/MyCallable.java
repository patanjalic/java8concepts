package com;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by pchinigi on 1/24/2017.
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }

    public static void main(String... args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<String>> results = new ArrayList<>();
        Callable<String> task = new MyCallable();
        for(int i = 0; i < 100; i++) {
            Future<String> fut = executor.submit(task);
            results.add(fut);
        }
        for(int i = 0 ; i < 100; i++) {
            try {
                System.out.println(new Date() + "::" + results.get(i).get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
