import java.util.Scanner;
public class Assignment13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer b = sc.nextInt();// for find large number 
        Integer c = sc.nextInt();// for find large number 

        p1(n);
        p2(n,b,c);
        p3(n);
        p4(n);
        p5(n);
        p6(n);
        p7(n);
        p8(n);
        p9(n);
        p10(n);

    }
    protected static void p1(Integer n) {
        if(n%2==1){
            System.out.println("number is odd");
        }
        else {
            System.out.println("number is even");
        }
    }

    protected static void p2(Integer a, Integer b, Integer c) {
        if(a>b){
            if(a>c){
                System.out.println("a is greater number");
            }
            else{
                System.out.println(" c is greater number");
            }
        }
        else{
            if(b>c){
                System.out.println("b is greater number");
            }
            else{
                System.out.println("c is greater number");
            }
        }
    }

    protected static void p3(Integer n) {
        Integer temp = 0;
        while (n!=0){
            temp++;
            n = n / 10;
        }
        System.out.println("total digits in number is "+temp);
    }

    protected static void p4(Integer n) {
        Integer temp = 0, rev=0;
        while (n!=0){ 
            temp = n % 10;
            rev = rev * 10 + temp;
            n = n / 10;
        }
        System.out.println("reavers number is "+rev);
    }

    protected static void p5(Integer n) {
        int sum= 0;
        for (int i=0; i<=n; i++) {
            sum = sum +i;
        }
        System.out.println("Sum of n number is "+sum);
    }

    protected static void p6(Integer n) {
        int sum= 0;
        for (int i=0; i<=n; i++) {
            if(i%2==1){
                sum = sum +i;
            }
        }
        System.out.println("sum of odd number is "+sum);
    }

    protected static void p7(Integer n) {
        int sum= 0;
        for (int i=0; i<=n; i++) {
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println("sum of even number is "+sum);
    }

    protected static void p8(Integer n) {
        int sum= 0;
        for (int i=0; i<=n; i++) {
                sum = sum + (i*i);
        }
        System.out.println("sum of square number is "+sum);
    }

    protected static void p9(Integer n) {
        Integer temp = 0;
        while (n!=0){ 
            temp += n % 10;
            n = n / 10;
        }
        System.out.println("sum of all digits in number is "+temp);
    }

    protected static void p10(Integer n) {
        int factorial = 1;
        for (int i=2; i<=n; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of n number is "+factorial);
    }
}