package concurrency.example1;

class Operation {
    public void operate() {
        try {
            for(int i = 5; i > 0; i--) {
                // 55 44 33 22 11
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "Counter "  + i);
            }
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
}

