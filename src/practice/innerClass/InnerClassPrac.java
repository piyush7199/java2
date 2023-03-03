package practice.innerClass;

class NestedOuterClass{
    int x = 20;
    void display(){
        NestedInnerClass nc = new NestedInnerClass();
        nc.display2();
        System.out.println(nc.y);
    }
    class NestedInnerClass{
        int y = 100;
        void display2(){}
    }
}

class StaticOuter{
    int x = 20;
    static int y = 178;
    void display(){
        NestedInnerClass nc = new NestedInnerClass();
        nc.display2();
        System.out.println(y);
    }
    static class NestedInnerClass{
        int z = 100;
        void display2(){
            System.out.println(y);
        }
    }
}

class LocalOuterClass{
    int x = 20;
    void display(){
        class NestedInnerClass{
            int y = 100;
            void display2(){}
        }
        NestedInnerClass ni = new NestedInnerClass();
        ni.display2();
    }
}

abstract class InnerClass{
    abstract void display();
    abstract void dislay2();
}
class AnonymusOuterClass{
    InnerClass in = new InnerClass() {
        @Override
        void display() {
            System.out.println("Hi");
        }

        @Override
        void dislay2() {

        }
    };
}

public class InnerClassPrac {
}
