package practice.oops;

class Circle{
    private double radius;
    public Circle(){
        this.radius = 0.0;
    }
    public Circle(Double radius){
        this.radius=radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}

class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        this.height=0;
    }
    public Cylinder(double height){
        this.height=height;
    }
    public double volume(){
        return area()*height;
    }
}

class Sup{
    private void display(){
        System.out.println("This is super class");
    }
}

class Sub extends Sup{
    public void display(){
        System.out.println("This is sub class");
    }
}
public class OopsJava {
    public static void main(String[] args) {
        // Cylinder c = new Cylinder();
        Sup c= new Sub();
        ((Sub) c).display();
    }
}
