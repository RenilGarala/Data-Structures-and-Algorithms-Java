public class Assignment17 {
    public static void main(String[] args) {
        ThickCircle c1 = new ThickCircle();
        c1.setRadius(10);
        c1.setThickness(5);
        c1.getThickness();
        System.out.println(c1.getThickArea());
    }
}
class Circle{
    int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}

class ThickCircle extends Circle{
    int thickness;
    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
    public int getThickness() {
        return thickness;
    }
    @Override
    public double getArea() {
        return super.getArea();
    }
    public double getThickArea() {
        double outerRadius = radius + thickness;
        return (3.14 * outerRadius * outerRadius) - super.getArea();
    }
}