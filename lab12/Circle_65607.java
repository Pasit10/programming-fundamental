public class Circle_65607 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1.getArea());
    }
}

class Circle{
    double radius = 1;
    Circle(){
        radius = 1.0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    double getArea(){
        return Math.PI * radius *radius;
    }
    double getCircumference(){
        return radius*2*Math.PI;
    }
    public String toString(){
        return "Cirle[radius=” + radius + “]”";
    }
}
