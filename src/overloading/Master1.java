package overloading;

public class Master1 {
    static void test(String arg){
        System.out.println("ARG VALUE IS "+arg);
    }
    static int test(char arg){
        char ch='A';
        return ch+arg;
    }

}
