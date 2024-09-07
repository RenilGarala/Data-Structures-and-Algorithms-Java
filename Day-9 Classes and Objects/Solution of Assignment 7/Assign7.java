class Assign7{

    //program 1
    public static void p1(){
        Complex c1 = new Complex();
        c1.setComplexNumber(4,5);
        c1.getComplexNumber();
    }

    //program 2
    public static void p2(){
        Time t1 = new Time();
        t1.setTimer(3,45,55);
        t1.getTimer();
    }

    //program 3
    public static void p3(){
        Cuboid c1 = new Cuboid();
        c1.setter(3,4,5);
        c1.getter();
    }

    //program 4
    public static void p4(){
        Employee e1 = new Employee();
        e1.setter(101, "chirag", 800000);
        e1.getter();
    }

    //program 5
    public static void p5(){
        Contact c1 = new Contact();
        c1.setter(101, "rohit" , "sharma", 1020304010 , "rohit@gmail.com");
        c1.getter();
    }

    //program 6
    public static void p6(){
        Quetion q1 = new Quetion();
        q1.setter(45, "who is the g.o.a.t of the cricket", "virat kohli" , "rohit sharma" , "bumrah", "Suryakumar Yadav" , "option b - rohit sharma");
        q1.getter();
    }

    //program 7
    public static void p7(){
        Course c1 = new Course();
        c1.setter(101, "bca" , "3 year", 25000);
        c1.getter();
    }

    //program 8
    public static void p8(){
        Distance d1 = new Distance();
        Distance d2 = new Distance();
        d1.setter(10,30,12);
        d2.setter(20,20,42);
        d1.addition(d2);
        d1.getter();
    }

    //program 9
    public static void p9(){
        Circle c1 = new Circle();
        c1.setter(3);
        c1.getter();
    }

    //program 10
    public static void p10(){
        Book b1 = new Book();
        b1.setter(10, "how to become full stack developer" , 300 , "renil garala");
        b1.getter();
    }
}
//program 1 class 
class Complex{
    int real;
    int imaginary;
    public void setComplexNumber(int r, int i){
        real = r;
        imaginary = i;
    }
    public void getComplexNumber(){
        System.out.println(real);
        System.out.println(imaginary);
    }
}

//program 2 class 
class Time{

    int hour;
    int minute;
    int second;
    void setTimer(int h, int m, int s){
        hour = h;
        minute = m;
        second = s;
    }
    void getTimer(){
        System.out.println(hour + " h1 "+minute+ " min "+ second + " sec " );
    }
}

//program 3 class 
class Cuboid{
    int length;
    int width;
    int height;
    void setter(int l, int w, int h){
        length = l;
        width = w;
        height = h;
    }

    void getter(){
        System.out.println("Area of Cuboid is "+ length*width*height);
    }
}

//program 4 class 
class Employee{
    int empId;
    String name;
    int salary;
    void setter(int e, String n, int s){
        empId = e;
        name = n;
        salary = s;
    }
    void getter(){
        System.out.println("Employee id is "+ empId);
        System.out.println("Employee name is "+ name);
        System.out.println("Employee salary is "+ salary);
    }
}

//program 5 class 
class Contact{
    int Id;
    String firstName;
    String lastName;
    long mobileNumber;
    String emailId;
    void setter(int id, String fn,String ln, long mn , String eid){
        Id = id;
        firstName = fn;
        lastName = ln;
        mobileNumber = mn;
        emailId = eid;
    }
    void getter(){
        System.out.println("Id is "+ Id);
        System.out.println("firstName is "+ firstName);
        System.out.println("lastName is "+ lastName);
        System.out.println("mobileNumber is "+ mobileNumber);
        System.out.println("emailId is "+ emailId);
    }
}


//program 6 class 
class Quetion{
    int queNo;
    String que;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String ans;
    void setter(int qNo, String qu, String oA,String oB, String oC , String oD , String an){
        queNo = qNo;
        que = qu;
        optionA = oA;
        optionB = oB;
        optionC = oC;
        optionD = oD;
        ans = an;
    }
    void getter(){
        System.out.println("Id is "+ queNo);
        System.out.println("Quetion 1 -  "+ que);
        System.out.println("option-A "+ optionA);
        System.out.println("option-B "+ optionB);
        System.out.println("option-C "+ optionC);
        System.out.println("option-D "+ optionD);
        System.out.println("Right Answer is "+ ans);
    }
}

//program 7 class
class Course{
    int courseId;
    String courseName;
    String duration;
    int fee;

    void setter(int cid, String cn, String d , int f){
        courseId = cid;
        courseName = cn;
        duration = d;
        fee = f;
    }

    void getter(){
        System.out.println(courseId);
        System.out.println(courseName);
        System.out.println(duration);
        System.out.println(fee);
    }
}


//program 8 class
class Distance{
    int km;
    int m;
    int cm;

    void setter(int km, int m,int cm){
        this.km = km;
        this.m = m;
        this.cm = cm;
    }

    void addition(Distance d){
        this.km += d.km;
        this.m += d.m;
        this.cm += d.cm;
    }
    void getter(){
        System.out.println("kilometer : "+km);
        System.out.println("meter : "+m);
        System.out.println("centimeter : "+cm);
    }
}


//program 9 class
class Circle{
    int radius;

    void setter(int r){
        radius = r;
    }

    void getter(){
        System.out.println("Area of circle is " + 3.14*radius*radius);
        System.out.println("circumference is " + 3.14*radius*2);
    }
}

//program 10 class
class Book{
    int bookId;
    String title;
    int price;
    String author;

    void setter(int b,String t,int p , String a){
        bookId = b;
        title = t;
        price = p;
        author = a;
    }

    void getter(){
        System.out.println(bookId + title + price + author);
    }
}