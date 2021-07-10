package abstraction;

public class CurrentAccount implements Account{
    double accountBalance;

    public CurrentAccount(double accountBalance) {
        this.accountBalance = accountBalance;
        System.out.println("Current Account Opened Successfully");
    }

    @Override
    public double deposit(double amt) {
        accountBalance+=amt;
        return amt;
    }

    @Override
    public double withdraw(double amt) {
        if(amt<=accountBalance){
            accountBalance-=amt;
        }
        return amt;
    }

    @Override
    public double checkBalance() {
        return accountBalance;
    }
}
