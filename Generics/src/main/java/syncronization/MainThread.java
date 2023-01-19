package syncronization;

public class MainThread {

    public static void main(String[] args) {

        Operation op = new Operation();
        MyThread t1 = new MyThread("T1", op);
        MyThread t2 = new MyThread("T2", op);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e){
            System.out.println("Interrupted");
        }

    }
}
