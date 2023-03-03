package practice.interfacePrac;

interface Imp{

    void meth1();
    void metho2();
    public static void meth3(){
        System.out.println("Hihi");
    }

    default void meth4(){
        System.out.println("hihi");
    }

}

class TempImp implements Imp{

    @Override
    public void meth1() {

    }

    @Override
    public void metho2() {

    }
    public void meth3(){
        System.out.println("Hey");
    }
}

public class InterfacePrac1 {

    public static void main(String[] args) {
        TempImp test = new TempImp();
        test.meth3();
    }

}
