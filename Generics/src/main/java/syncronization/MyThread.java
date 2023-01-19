package syncronization;

public class MyThread extends Thread{

    private Thread t;
    private String name;
    private Operation op;

    public MyThread(String name, Operation op) {
        this.name = name;
        this.op = op;
    }

    public void run(){
        try {
            synchronized(op){
                op.operate();
            }
            System.out.println("Thread " + name + " exiting");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void start(){
        System.out.println("Thread " + name + " starting");
        if (t == null){
            t = new Thread(this, name);
            t.start();
        }
    }
// TODO Future, FutureTask, ExecutorService, Callable - de citit despre
// TODO MUTEX, SEMAPHORE, LATCH, BARRIER - mecanisme de sincronizare
// TODO DEADLOCK, STARVATION - probleme de concurenta
// TODO Formularul de feedback - de completat

}
