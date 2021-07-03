package interfaces.p2;

public class E implements C,D{
    @Override
    public void test1() {
        System.out.println("from test1");
    }

    @Override
    public void test2() {
        System.out.println("from test2");
    }

    @Override
    public void test3() {
        System.out.println("from test3");
    }

    public static void main(String[] args) {
        E e1=new E();
        e1.test1();
        e1.test2();
        e1.test3();
    }
}
