package encapsulation;

public class MainApp2 {
    public static void main(String[] args) {
        Customer c1=new Customer();
        c1.setAccountNo(53748265386l);
        c1.setPin(2836);
        long accountNo = c1.getAccountNo();
        System.out.println(accountNo);
        int pin = c1.getPin();
        System.out.println(pin);
    }
}
