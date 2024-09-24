public class HelloWorld {
    public static void main(String[] args){
        A1 a1 = new A1();
        a1.accessBClasses();
    }
}
class A1 {
    public void accessBClasses() {
        B1 b1 = new B1();
        B2 b2 = new B2();

        b1.displayMessage();
        b2.displayMessage();
    }
}