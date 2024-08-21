public class Assign1{

    public static void p1(){
        char c = 'A';
        c++;
        System.out.println(c);
    }
    public static void p2(){
        char c = '+';
        int unicode = (int) c;
        System.out.println(unicode);
    }
     public static void p3(){
        int num = 1234;
        int lastdigit= num % 10;
        num = num - lastdigit;
        System.out.println(num);
    }

    public static void p4(){
        int num = 363;
        int temp = 0;
        temp = num % 10;
        num /=10;
        temp += num % 10;
        num /= 10;
        temp += num % 10;
        System.out.println(temp);
    }
    public static void p5(){
        // System.out.println(-5>4>3);

        //show error: first type: boolean
        //            second type: int
    }

    public static void p6(){
        // boolean cannot be converted to int

        // int x = (int)true;
        // System.out.println(x);
    }

    public static void p7(){
        // bad operand type int for unary operator '!'

        // int x = !5>-2;
        // System.out.println(x);
    }

    public static void p8(){
        // possible lossy conversion from double to int

        // int x = 5.5%1.5;
        // System.out.println(x);
    }
    
    public static void p9(){
        int num = 123;
        int first = num / 100;          
        int second = (num / 10) % 10;         
        int third = num % 10;  

        num = (third*100) + (second*10) + (first);
        System.out.println(num);
    }

     public static void p10(){
        int num = 100;
        char c = (char) num;
        System.out.println(c);
    }
}