package concurrency.example1;

public class TestThread {

    public static void main(String args[]) {
        Operation PD = new Operation();

        MyOperationThread T1 = new MyOperationThread( "Thread - 1 ", PD );
        MyOperationThread T2 = new MyOperationThread( "Thread - 2 ", PD );

        T1.start();
        T2.start();

        // wait for threads to end
        try {
            T1.join();
            T2.join();
        } catch ( Exception e) {
            System.out.println("Interrupted");
        }
    }
}
