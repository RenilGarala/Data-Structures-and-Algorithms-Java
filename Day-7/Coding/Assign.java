public class Assign {

    //1. Write a program to check whether a given number is divisible by 5 or not

    public static void p1(){
        int number = 12;
        if(number %5==0){
            System.out.println("number is divisble by 5");
        }
        else{
            System.out.println("number is not divisble by 5");
        }
    }

    //2. Write a program to check whether a given number is even or odd

    public static void p2(){
        int number = 5;
        if(number % 2 == 0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }

    //3. Write a program to check whether a given number is even or odd without modulo operator

    public static void p3(){
        int number = 112;
        if((number & 1) == 0 ){
            System.out.println("number is even without modulo operator");
        }
        else{
            System.out.println("number is odd without modulo operator");
        }
    }

    // 4. Write a program to check whether a given number is positive or non positive 

    public static void p4(){
        int number = 10;
        if(number > 0){
            System.out.println("number is positive number");
        }
        else{
            System.out.println("number is non positive number");
        }
    }

    // 5. Write a program to print greater between two numbers.

    public static void p5(){
        int num1 = 10;
        int num2 = 20;
        if(num1>num2){
            System.out.println("number 1 is greater then number 2");
        }
        else{
            System.out.println("number 2 is greataer then number 1");
        }
    }

    //6. Write a program to check whether a given number is positive, negative or zero.

    public static void p6(){
        int number = 10;
        if(number > 0){
            System.out.println("number is positive number");
        }
        else if(number < 0){
            System.out.println("number is negative number");
        }
        else{
            System.out.println("number is zero");
        }
    }

    // 7. Write a program to print greater among three numbers

    public static void p7(){
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;
        if(number1>number2){
            if(number1>number3){
                System.out.println("number 1 is greater");
            }
            else{
                System.out.println("number 3 is greater");
            }
        }
        else{
            if(number2>number3){
                System.out.println("number 2 is greater");
            }
            else{
                System.out.println("number 3 is greater");
            }
        }
    }

    //Write a program to check whether a character is an alphabet, a digit or some other

    public static void p8(){
        char ch = 'A';

        if(Character.isLetter(ch)){
            System.out.println("char is alphabet");
        }
        else if(Character.isDigit(ch)){
            System.out.println("char is digit");
        }
        else{
            System.out.println("character is some other not digit and alphabet");
        }
    }

    //9. Write a program to check whether a given number is a three digits number or not.

    public static void p9(){
        int number = 101;
        if(String.valueOf(number).length() == 3){
            System.out.println("number have  three digit ");
        }
        else{
            System.out.println("number not have three digit ");
        }
    }

    // 10. Write a program to check whether a given number is divisible by 5 or 7.

    public static void p10(){
        int number = 10;
        if(number % 5 == 0 || number % 7 == 0 ) {
            System.out.println("number is 5 or 7");
        } 
        else {
            System.out.println("number is not divide by 5 or 7");
        }
    }
}