package concurrency.example;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableImpl implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Running on " + Thread.currentThread().getName());
        Random generator = new Random();
        int randomNumber = generator.nextInt(5);
//        Thread.sleep(2000);
        System.out.println("Random number generated :" + randomNumber);
        return randomNumber;
    }
}
