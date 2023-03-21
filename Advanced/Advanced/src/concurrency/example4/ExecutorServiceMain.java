package concurrency.example4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("ExecutorService");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        executorService.execute(new Runnable() {

            @Override
            public void run() {
                System.out.println("ExecutorService2");

            }
        });
        executorService.shutdown();
    }

}
