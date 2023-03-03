package practice.oops;

abstract class Super{
    public Super(){
        System.out.println("This is super constructor");
    }
    public void display(){
        System.out.println("This is display of super");
    }
    public abstract void display2();
}

class Subclass extends Super{
    @Override
    public void display2() {
        System.out.println("This is in SUB");
    }

    public void display3(){
        System.out.println("This is display3");
    }
}

public class AbstractPrac {
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.display();
    }
}
