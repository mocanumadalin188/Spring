package concurrency.example2;

public class Threadjoiningmethod extends Thread{
    public void run(){
        for(int i=1;i<=4;i++){
            try{
                Thread.sleep(2000);
                System.out.println("Comes from thread "+ Thread.currentThread().getName() + " :" +i);
            }catch(Exception e){System.out.println(e);}
        }
    }
    public static void main(String args[]) throws InterruptedException {
        Threadjoiningmethod th1=new Threadjoiningmethod ();
        Threadjoiningmethod th2=new Threadjoiningmethod ();
        Threadjoiningmethod th3=new Threadjoiningmethod ();
        th1.start();
        try{
            //blocks until thread dies
            th1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }

        // 11 22 33 44
        th2.start();
//        th2.join();
        th3.start();
    }
}
