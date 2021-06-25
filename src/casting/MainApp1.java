package casting;

public class MainApp1 {
    public static void main(String[] args) {
      Child c=new Child();
        c.m1();
        c.m2();
        ((Parent)c).m1();
       // ((Parent)c).m2();


    }


}
