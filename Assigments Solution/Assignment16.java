
public class Assignment16 {
    public static void main(String[] args){
        // Employee e1 = new Employee();
        // e1.setValues("Renil", 20, 3000);
        // e1.getValues();

        Customer customer = new Customer("John Doe", 12345, 1000);
        customer.checkBalance();    
        customer.deposit(500);
        customer.withdraw(200);
        customer.checkBalance(); 

    }
}
class Person{
    private String name;
    private int age;

    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age=age;
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}

class Employee extends Person{
    private int salary;

    public void setValues(String name, int age, int salary){
        this.salary = salary;
        setName(name);
        setAge(age);
    }

    public void getValues(){
        System.out.println("namae is :"+ getName());
        System.out.println("Age is : "+ getAge());
        System.out.println("Salary is : "+ salary);
    }
}

class Account {
    private int accountNumber;
    private int balance;

    // Constructor to initialize account number and balance
    public Account(int accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Protected method to access balance
    protected int getBalance() {
        return balance;
    }

    // Protected method to modify balance (for deposit and withdrawal)
    protected void setBalance(int balance) {
        this.balance = balance;
    }
}

class Customer extends Account {
    private String customerName;

    // Constructor to initialize customer and account details
    public Customer(String customerName, int accountNumber, int initialBalance) {
        super(accountNumber, initialBalance); // Call Account constructor
        this.customerName = customerName;
    }

    // Public method to deposit money
    public void deposit(int amount) {
        if (amount > 0) {
            int newBalance = getBalance() + amount;
            setBalance(newBalance);
            System.out.println("Deposit successful. New balance: " + newBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(int amount) {
        if (amount > 0 && getBalance() >= amount) {
            int newBalance = getBalance() - amount;
            setBalance(newBalance);
            System.out.println("Withdrawal successful. New balance: " + newBalance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + getBalance());
    }
}

//Program 3
class User {
    private String name;
    private String email;
    private String userId;

    public User(String name, String email, String userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getUserId(){
        return userId;
    }

    public void displayInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
class Learner extends User{
    private String courseEnrolled;
    private int progress;

    public Learner(String name, String email, String userId, String courseEnrolled) {
        super(name, email, userId); // Call User constructor
        this.courseEnrolled = courseEnrolled;
        this.progress = 0; // Default progress is 0%
    }

    // Method to update progress
    public void updateProgress(int progress) {
        if (progress >= 0 && progress <= 100) {
            this.progress = progress;
            System.out.println("Progress updated to " + this.progress + "% for " + getName());
        } else {
            System.out.println("Invalid progress percentage.");
        }
    }

    // Method to display Learner information
    public void displayLearnerInfo() {
        displayInfo(); // Display common user info
        System.out.println("Course Enrolled: " + courseEnrolled);
        System.out.println("Progress: " + progress + "%");
    }
}
class Admin{

}

//program 4
class Circle{
    int radius;
    void setRadius(int radius) {
        this.radius = radius;
    }
    int getRadius() {
        return radius;
    }
    void areaOfCircle(){
        System.out.println("Area of Circle"+ (3.14*radius*radius));
    }
}
class ThickCircle extends Circle{
    int thickness;
    void setThickness(int thickness) {
        this.thickness = thickness;
    }
    void areaOfThickCircle(){
        System.out.println("Area of ThickCircle"+  (3.14*thickness*thickness));
    }
}

