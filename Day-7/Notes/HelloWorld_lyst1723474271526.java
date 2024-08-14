//Hello world Program
/* 
 * This is a comment included in documentation.
 * This is another comment  included in documentation.
 */
public class HelloWorld {
    public static void main(String []args){
        int price=calculateFare('F', 5);
        System.out.println("Ticket Fare is "+price);  
    }
    public static void isPositive(int num){
        System.out.println(num>0?"Positive":"Non Positive");
    }
    public static int calculateFare(char gender, int age){
        if(gender=='M'){
            if(age>50)
                return 10;
            else
                return 20;
        }
        else
        {
            if(age<30)
                return 50;
            else
                return 40;
        }

    }
}
/*
value of x is 5
 This is first line of comment.
 This is second line of comment.
 */

