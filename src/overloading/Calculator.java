package overloading;

public class Calculator {
    // method overloading
    void addition(int a, int b) {
        System.out.println(a + b);
    }

    void addition(double a, double b) {
        System.out.println(a + b);
    }

    void addition(int a, double b) {
        System.out.println(a + b);
    }

    void addition(double a, double b, double c) {
        System.out.println(a + b + c);
    }
}