public class Assignment1 {
    public static void main(String[] args) {
        p1();
        p2();
        p3();
        p4();
        p5();
        p6();
    }

    public static void p1() {
        System.out.println("Hello Student");
    }

    public static void p2() {
        System.out.println("Hello \nStudent");// Escape ssequences
    }

    public static void p3() {
        System.out.println("\"MySirG\"");// Escape ssequences
    }

    public static void p4() {
        System.out.println("\"Teacher\'s Day\"");// Escape ssequences
    }

    public static void p5() {
        int age = 20;
        System.out.println("my age is " + age);
    }

    public static void p6() {
        float weigth = 62.7f;
        System.out.println("My weigth is " + weigth);
    }

    public static void p7() {
        /**
         * What is difference between pascal-case and snake-case and camel-case?
         * 
         * pascal-case:
         * 
         * pascal-case is used to define class name or array name in java
         * pascal case all word starting form capital letter(first latter capital)
         * ex: MyName;
         * 
         * snale-case:
         * 
         * snake-case is used to defiine varible name and method name in java
         * snake case all word saprated with _
         * In snake case all letters must be in lower case
         * ex: my_name_is;
         * 
         * camel-case:
         * 
         * camel-case is used to define varible and function name in java
         * In Camel case all word are saprated with -
         * camel- case all letter must be in lower case
         * ex: my-name-is;
         */
    }

    public static void p8() {
        /**
         * why main method is static in java?
         * 
         * In java, main method is first method called by jvm during execution so it's
         * entry pouint of program
         * when we use staic key word in main method that mean no need to create object
         * of this method.
         * no need to call main method.
         * because static help to call method without an object.
         * 
         * We cannot modify the syntax of main method.
         * 
         */
    }

    public static void p9() {
        /**
         * what is difference between print() and println() method of PrintStream class?
         * 
         * print():
         * print() method used to print value or string on console. this method passed
         * parameter in
         * differnt type value. this method print the value or text on the console and
         * cursor at the
         * end of the text at the console.
         * 
         * println():
         * println() method also used to print value or String on console. this method
         * paased parameter
         * in differnt type value. this method print the value or text on the console
         * but cursor at the
         * new line after executing text or value on the console
         */
    }

    public static void v10() {
        /**
         * what are the JRE in java
         * 
         * JRE stand on Java Runtime Environment.
         * JRE contain JVM - java vertual machine.
         * All the classes and libraries define in the JRE
         * Without JRE Byte code is not run on any os.
         * the JRE Enables the execution of java byte code file on different type of os.
         * JRE follow "write once and, run anywhere" principle
         * JRE contain diffrent code on different OS.
         * Example: linus have different JRE file
         * Mac OS have different JRE file
         * Window have different JRE file
         */
    }

}
