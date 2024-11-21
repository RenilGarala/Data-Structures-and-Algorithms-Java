import java.text.NumberFormat.Style;
import java.util.Scanner;
public class Assignment20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int n = sc.nextInt();
        
        p1(n);
        p2(n);
        p3(n);
        p4(n);
        p5(n);
    }

    //Program 1
    public static void p1(int n) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[n];
        System.out.println("Enter Array Element :");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array Element is : ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]+" ");
        }
    }

    //program 2
    public static void p2(int n) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[n];
        System.out.println("Enter Array Element :");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int large=arr[0];
        System.out.print("Greatest Element is : ");
        for(int i = 1; i < n; i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        System.out.println(large);
    }

    //progam 3
    public static void p3(int n){
        Scanner sc = new Scanner(System.in);
        int []arr = new int[n];
        System.out.println("Enter Array Element :");
        for (int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Smallest Element is : ");
        int small = arr[0];
        for (int i=1; i<n ; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println(small);
    }

    //program 4
    public static void p4(int n){
        Scanner sc =new Scanner (System.in);
        int []arr = new int[n];
        System.out.println("Enter Array Element : ");
        for (int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Sum of all Array element is : ");
        int sum = 0;
        for (int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

    //program 5
    public static void p5(int n){
        Scanner sc = new Scanner(System.in);
        int []arr = new int[n];
        System.out.println("Enter Array Element");
        for (int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Avrage of n element is : ");
        int sum = 0;
        for(int i = 0 ; i<n; i++){
            sum += arr[i];
        }
        System.out.println(sum/n);
    }
}