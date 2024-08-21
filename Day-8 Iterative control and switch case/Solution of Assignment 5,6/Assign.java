class Assign{

    //1. Write a program to print MySirG 5 times on the screen
    public static void p1(){
        int i=0;
        while(i<5){
            System.out.println("MySirG");
            i++;
        }
    }

    //2. Write a program to print the first 10 natural numbers.
    public static void p2(){
        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }
    }

    //3. Write a program to print the first 10 natural numbers in reverse order
    public static void p3(){
        int i = 9;
        while (i>=0){
            System.out.println(i);
            i--;
        }
    }

    //4. Write a program to print the first 10 odd natural numbers
    public static void p4(){
        int i=0;
        while(i!=20){
            if(i%2==1){
                System.out.println(i);
            }
            i++;
        }
    }

    //5. Write a program to print the first 10 odd natural numbers in reverse order.
    public static void p5(){
        int i=20;
        while(i!=0){
            if(i%2==1){
                System.out.println(i);
            }
            i--;
        }
    }

    //6. Write a program to print the first 10 even natural numbers
    public static void p6(){
        int i=0;
        while(i!=20){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
    //7. Write a program to print the first 10 even natural numbers in reverse order
    public static void p7(){
        int i=18;
        while(i!=-1){
            if(i%2==0){
                System.out.println(i);
            }
            i--;
        }
    }

    //8. Write a program to print squares of the first 10 natural numbers
    public static void p8(){
        for (int i = 0; i < 10 ; i++){
            System.out.println(i*i*i);
        }
    }

    //9. Write a program to print cubes of the first 10 natural numbers
    public static void p9(){
        for (int i = 9; i > -1 ; i--){
            System.out.println(i*i*i);
        }
    }

    //10. Write a program to print a table of 5.
    public static void p10(){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("5 * "+i+" = "+5*i);
        }
    }
}