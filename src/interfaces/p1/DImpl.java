package interfaces.p1;

public class DImpl implements D{
    @Override
    public void test() {
        System.out.println("from test");
    }

    public static void main(String[] args) {
        D d1=new DImpl(); // upcasting // we can not create object of an interface
        // but we can create its reference variable
        d1.test();
    }
}
