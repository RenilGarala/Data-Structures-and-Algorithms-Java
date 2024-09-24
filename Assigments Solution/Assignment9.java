public class Assignment9{
    public static void main(String[] args){
        p1();
        p2();
        p3();
        p4();
        p5();
    }
    protected static void p1(){
        Circle c = new Circle();
        c.setRadius(3);
        c.getRadius();
        c.getArea();
        c.circumference();
    } 

    // Car ક્લાસમાંથી એક ઓબ્જેક્ટ બનાવાયો

    protected static void p2(){
        Marksheet m = new Marksheet();
        m.setter(79,68,79,97,56);
        m.getter();
    }
    protected static void p3(){
        Marksheet m = new Marksheet();
        m.setter(92,48,69,97,76);
        m.findMaxNumber();
    }

    protected static void p4(){
        Marksheet m = new Marksheet();
        m.setter(92,48,69,97,76);
        m.averageMark();
    }

    protected static void p5(){
        Marksheet m = new Marksheet();
        m.result(92,33,69,97,76);
    }

}
class Circle{
    Integer radius;
    void setRadius(Integer radius){
        this.radius = radius;
    }
    void getRadius(){
        System.out.println("radius is " + radius);
    }
    void getArea(){
        System.out.println("area is " + 3.14*radius*radius);
    }
    void circumference(){
        System.out.println("circumference is " + 2*3.14*radius);
    }
} 

class Marksheet{
    Integer physics, mathematics, chemistry, english, hindi;

    protected void setter(Integer p, Integer m, Integer c, Integer e, Integer h ){
        physics= p;
        mathematics = m;
        chemistry = c;
        english = e;
        hindi = h;
    }
    protected void getter (){
        System.out.println("physics mark is " + physics);
        System.out.println("mathematics mark is "+ mathematics );
        System.out.println("chemistry mark is "+ chemistry);
        System.out.println("english mark is "+ english);
        System.out.println("hindi mark is "+ hindi);
    }

    protected void findMaxNumber (){
        if (physics > mathematics && physics > chemistry && physics > english && physics >hindi){
            System.out.println("max mark in physics is "+ physics);
        }
        else if (mathematics > physics && mathematics > chemistry && mathematics > english && mathematics >hindi){
            System.out.println("max number in mathematic is "+ mathematics);
        }
        else if (chemistry > physics && chemistry > mathematics && chemistry > english && chemistry >hindi){
            System.out.println("max number in chemistry is "+ chemistry);
        }
        else if (english > physics && english > mathematics && english > chemistry && english > hindi){
            System.out.println("max number in english is "+ english);
        }
        else if (hindi > physics && hindi > mathematics && hindi > english && hindi > chemistry){
            System.out.println("max number is hindi is "+hindi);
        }
    }

    protected void averageMark(){
        Float avg= (mathematics+ chemistry + english + hindi + physics)/5f;
        System.out.println("average is alml sunject is "+avg);
    }

    protected void result(Integer p, Integer m, Integer c, Integer e, Integer h ){
        if (p>33 && m>33 && c>33 && e>33 && h>33){
            System.out.println("Congress you are pass with "+ (p+m+c+e+h)/5 + "%");
        }
        else{
            System.out.println("Sorry, you are fail! better luck next time");
        }
    }
}

