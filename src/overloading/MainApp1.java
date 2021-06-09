package overloading;

public class MainApp1 {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.addition(12,58);
        c1.addition(12.65,78.25);
        c1.addition(70,65.25);
        c1.addition(78.25,25.36,55.24);
    }

}
