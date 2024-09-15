import java.util.Scanner;

public class Assignment12 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        // p1();
        // p3();
        // p4();
        // p5();
        // p6();
        // p7();
        // p8();
        // p9();
        p10();
    }

    //program 1 
    protected static void p1(){
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i );
        }
    }

    //program 2 is same as program 1 

    //program 3 
    protected static void p3(){
        Integer n = sc.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    //progrem 4
    protected static void p4(){
        Integer n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        } 
    }

    //program 5
    protected static void p5(){
        Integer n = sc.nextInt();

        for (int i =n; i >= 0 ; i--){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }

    //program 6 
    protected static void p6(){
        Integer n = sc.nextInt();

        for( int i=0; i<=n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    // program 7
    protected static void p7(){
        Integer n = sc.nextInt();
        
        for (int i = n ; i >= 0 ; i--){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    //program 8
    protected static void p8(){
        Integer n  = sc.nextInt();

        for(int i = 0 ; i <= n ; i++){
            System.out.println(i*i);
        }
    }

    //program 9 
    protected static void p9(){
        Integer n = sc.nextInt();

        for (int i = 0; i <= n ; i++){
            System.out.println(i*i*i);
        }
    }

    //program 10 
    protected static void p10(){
        Integer n = sc.nextInt();

        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(n+ " * "+ i + " = "+ n*i);
        }
    }
}
