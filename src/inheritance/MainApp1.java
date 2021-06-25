package inheritance;

public class MainApp1 {
    public static void main(String[] args) {
//        Child c1=new Child();
        Child2 c2=new Child2();
//        c1.parentProperty();
//        c1.childProperty();
//        System.out.println(c1.x);
//        c1.test();
        c2.parentProperty();
        c2.childProperty();
        c2.child2Method();
        System.out.println(c2.x);
        c2.test();

    }
}
