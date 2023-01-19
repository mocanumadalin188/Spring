package syncronization;

public class Operation {

    public void operate() throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " counter " + i);
        }
    }

}
