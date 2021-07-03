package interfaces.p1;

public interface C {
   //  private void test();
   // protected void test1();
    /*private and protected modifiers are not allowed in an interface.
    * if you not specify any modifier then method will not be default but it will
    * be public by default*/

    //void test2(){

   // } // only abstract methods are allowed in interface
        int a=10; // any variable declared in an interface is always static and final.

//    {
//        a = 20; //
//    }
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(a);
    }
}
