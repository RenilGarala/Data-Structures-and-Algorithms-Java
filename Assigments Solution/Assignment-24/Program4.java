public class Program4 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() { 
        try {
            Thread.sleep(3000); 
            System.out.println("Thread woke up after 3 seconds!");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}
