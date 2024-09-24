import java.util.Scanner;
public class Assignment15 {
    public static void main(String[] args) {
        //program 1
        // Person p1 = new Person(); 

        //program 2 
        // Employee e1 = new Employee();
        // e1.getEmpDetail();

        //prohgram 3
        // Box b1 = new Box(12,123,12);

        // program 4
        // Time t1 = new Time(1,10,00);

        // program 5
        Customer c1 = new Customer(101, "renil", 1020304050L);
        c1.getCustomerInfo();

    }
}

// program 1 class
class Person{
    private String name;
    private int age;

    public Person(){
        System.out.println("Without argument constructer called");
    }
    public Person (String name){
        System.out.println("Name argument constructer called");
    }
    public Person (int age){
        System.out.println("Age argument constructer called");
    }
    public Person(String name, int age){
        System.out.println("Name and Age argument constructer called");
    }
}

//proghram 2 class
class Employee {
    Scanner sc = new Scanner(System.in);
    private static int empid=0;
    private int salary;
    private String name;

    private void setEmpid(int empid){
        this.empid = empid;
    }

    public Employee(){
        salary = sc.nextInt();
        name = sc.next();
        setEmpid(empid+1);
    }

    public void getEmpDetail(){
        System.out.println("Employee id = "+empid+" name = "+name+"Salary = "+salary);
    }
}

// program 3 class 
class Box{
    private int length;
    private int breadth;
    private int height;

    public Box(){
        System.out.println("Without argument constructor called");
    }

    public Box(int length){
        System.out.println("one argument constructor called");
    }

    public Box(int length, int breadth, int height){
        System.out.println("three arguments constructor called");
    }
}

//program 4
class Time{
    private int hr, min, sec;
    public Time(){
        System.out.println("Without argument constructor of time class called ");
    }

    public Time(int hr){
        this.hr= hr;
        System.out.println("one argument constructor called is hour: "+hr);
    }

    public Time(int hr, int min, int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
        System.out.println("three arguments constructor called which is hour min second = "+hr+":"+min+":"+sec);
    }
}

// program 5
class Customer {
    int id;
    String name, email = null;
    long mobileNumber;

    public Customer(int id, String name, String email, long mobileNumber){
        this.id=id;
        this.name=name;
        this.email=email;
        this.mobileNumber=mobileNumber;
    }

    public Customer(int id, String name, long mobileNumber){
        this.id=id;
        this.name=name;
        this.mobileNumber=mobileNumber;
    }

    public void getCustomerInfo(){
        System.out.println("Customer id is "+ id);
        System.out.println("Customer name is "+ name);
        System.out.println("Customer email is "+ email);
        System.out.println("Customer mobile number is "+ mobileNumber);
    }
}