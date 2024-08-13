
//>>>>>>>>assignment program write into this file and call from driver file<<<<<<<<<<<<<


public class Assign{

    // program 1 - Write a program to find and print unit digit of a number stored in a variable.
    
    public static void p1(){
        int num=59;
        int unit_digit = num % 10;
        System.out.println("unit digit is " + unit_digit);
    }

    // program 2 - Write a program to print a number stored in a variable without its last digit.

    public static void p2(){
        int num=4519;
        num = num / 10;

        System.out.println("variable value is " + num);
    }

    // program - 3 Write a program to swap values of two int variables.

    public static void p3(){
        int num1 = 10;
        int num2 = 20;
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("number 1 value is " + num1 + " and number 2 value is " + num2);
    }

    // program - 4 Write a program to swap values of two int variables without using third variable.

     public static void p4(){
        int num1 = 10;
        int num2 = 20;
        num2 = num2+num1;   //num2 = 30
        num1 = num2-num1;   //num1 = 30-10 = 20
        num2 = num2-num1;   //num2 = 30-20 = 10

        System.out.println("number 1 value is " + num1 + " number 2 value is " + num2);
    }


    // program - 5 How to identify whether a variable is a value type variable or nullable type variables?

    /**
     * if data type is not a class or any array variable then it is called value type variable for example
     * any variable have int , float , double data type then it is called value type variable 
     * it is not allowed to store nullble value
     */
     

    /**
     * if varible have class or array type data type then it is called nullable type varibles 
     * for example String , int[] rollno
     * it is allowed to store nullble value
     */

    // program - 6 Why there is an error in the Java statement - float x = 3.4;?

    /**
     * because 3.4 is not float value it's double value and double to float is narrowing conversion 
     * narowing conversion is not automatic it's manual 
     * so we need to write like that : float x = 3.4f;
     */


    //program - 7 What will be the result of an expression - 35&83;

    public static void p7(){
        int temp = 35&83;
        System.out.println("result of an expression 35 & 83 is = " + temp );
    }

    //program - 8 What will be the result of an expression - 47|29;

     public static void p8(){
        int temp = 47|29;
        System.out.println("result of an expression 347 | 29 is = " + temp );
    }

    //program - 9 What will be the result of an expression - 76^108;

     public static void p9(){
        int temp = 76^108;
        System.out.println("result of an expression 76 ^ 108 is = " + temp );
    }

    //program - 10 Write a program to rotate digits of a number towards right by one position.

     public static void p10(){
        int num = 1234;
        int lastdigit = num % 10;
        num = num / 10;
        System.out.println("otate digits of a number towards right by one position = " + lastdigit + num );
    }

}
