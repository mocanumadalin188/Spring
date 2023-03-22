package concurrency.example;

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println("Running on " + Thread.currentThread().getName());
        //            Thread.sleep(6000);
    }
}
