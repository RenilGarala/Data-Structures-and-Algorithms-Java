public class Program1 {
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
class A implements Runnable{
    public void run(){
        p1();
    }
    void p1(){
        for (int i=1; i<=10; i++){
            System.out.println("i = "+ i);
        }
    }
}
class B implements Runnable{
    public void run(){
        p2();
    }
    void p2(){
        for (int j=1; j<=10; j++){
            System.out.println("J = "+ j);
        }
    }
}