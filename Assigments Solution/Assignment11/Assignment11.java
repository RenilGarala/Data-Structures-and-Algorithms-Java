package Assignment11;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.Random;
class Assignment11{
    public static void main(String[] args){
        p1();
        p2();
        p3();
        p4();
    }
    protected static void p1() {
        Date d1 = new Date();
        System.out.println("Current Date is = "+d1.toString());
    }

    protected static void p2(){
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println("Current Time is = "+t1.toString());
    }

    protected static void p3(){
        Random rand = new Random();
        int number = rand.nextInt(100,200);
        System.out.println(number);
    }
    
    protected static void p4(){
        
    }
}
