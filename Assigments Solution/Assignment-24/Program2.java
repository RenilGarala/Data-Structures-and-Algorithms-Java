public class Program2 {
    public static void main(String[] args){
        Counter c1 = new Counter();
        Thread t1 = new Thread(c1, "me");
        t1.start();
        Thread t2 = new Thread(c1, "tum");
        t2.start();
    }
}
class Counter implements Runnable {
    public void run() {
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
