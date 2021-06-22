package encapsulation;

public class MainApp1 {
    public static void main(String[] args) {
        Customer c1=new Customer();
        long accountNo = c1.getAccountNo();
        System.out.println(accountNo);
        int pin = c1.getPin();
        System.out.println(pin);
    }

}
