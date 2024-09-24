public class Assignment14{
    public static void main(String[] args){
        // program 1

        Person p1 = new Person("renil", 19);
        System.out.println("Person name is "+p1.getName()+" and age is "+p1.getAge());

        // i solve program 2 and program 3 in Assignment 14 folder 

        // program 4

        Employee e1 =new Employee();
        e1.nameSetter("renil");
        e1.empidSetter(101);
        e1.salarySetter(10000);
        e1.getter();

        //program 5

        Box b1 =new Box();
        b1.setter(10,20,30);
        b1.getter();
        System.out.println("volume : "+b1.volume());
        System.out.println("Surface : "+b1.surface());
    }
}
class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age= age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

// program 4 class

class Employee {
    int empid;
    String name;
    int salary;

    protected void empidSetter( int empid){
        this.empid = empid;
    }
    protected void nameSetter( String name){
        this.name = name;
    }
    protected void salarySetter( int salary){
        this.salary = salary;
    }
    protected void getter(){
        System.out.println("Employe id = "+ empid+" name "+name +" salary "+salary);
    }
}

// program 5 class 

class Box{
    private int length;
    private int breadth;
    private int height;

    void setter(int length,int breadth, int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    void getter(){
        System.out.println("length "+length+" breadth "+breadth+" height "+height);
    }

    int volume(){
        return length*breadth*height;
    }
    int surface(){
        int a = 2*length*breadth;
        int b = 2*breadth*height;
        int c = 2*height*length;
        return a+b+c;
    }
}


