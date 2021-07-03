package encapsulation;

public class MainApp5 {
    public static void main(String[] args) {
        Demo1 d1=new Demo1() {
            @Override
            public void test() {
                System.out.println("test method");
            }
        };
        d1.test();
    }

}
