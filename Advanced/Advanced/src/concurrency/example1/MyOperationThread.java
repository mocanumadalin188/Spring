package concurrency.example1;

class MyOperationThread extends Thread {
    private Thread t;
    private final String threadName;
    final Operation PD;

    public MyOperationThread(String name, Operation pd) {
        this.threadName = name;
        this.PD = pd;
    }

    public void run() {
//        synchronized(PD) {
            PD.operate();
//        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName);
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
