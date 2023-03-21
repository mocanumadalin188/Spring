package concurrency.example;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main
{
    public static void main(String[] args) throws Exception
    {

        // FutureTask is a concrete class that
        // implements both Runnable and Future
        FutureTask[] randomNumberTasks = new FutureTask[6];
        randomNumberTasks[5] = new FutureTask(new RunnableImpl(), 111);
        for (int i = 0; i < 6; i++)
        {
            Callable<Integer> callable = new CallableImpl();

            // Create the FutureTask with Callable
            if(i != 5){
                randomNumberTasks[i] = new FutureTask(callable);
            }

            // As it implements Runnable, create Thread
            // with FutureTask
            Thread t = new Thread(randomNumberTasks[i]);
            t.start();
        }
        Thread.sleep(2000);

        for (int i = 0; i < 6; i++)
        {
            // As it implements Future, we can call get()
            System.out.println(randomNumberTasks[i].get());

            // This method blocks till the result is obtained
            // The get method can throw checked exceptions
            // like when it is interrupted. This is the reason
            // for adding the throws clause to main
        }
    }
}
