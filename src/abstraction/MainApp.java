package abstraction;

public class MainApp {
    public static void main(String[] args) {
        AccountFactory factory=new AccountFactory();
        Account acc1=factory.openAccount("SAVINGS", 2500);

        double amt1=acc1.deposit(2500);
        System.out.println(amt1+" CREDITED TO YOUR ACCOUNT");

        double amt2=acc1.withdraw(1000);
        System.out.println(amt2+" DEBITED FROM YOUR ACCOUNT");

        double amt3=acc1.checkBalance();
        System.out.println("ACCOUNT BALANCE IS "+amt3);
    }

}
