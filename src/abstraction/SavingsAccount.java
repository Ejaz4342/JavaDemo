package abstraction;

public class SavingsAccount implements Account{
    double accountBalance;
    double rateOfInterest=4.0;

    public SavingsAccount(double accountBalance) {
        this.accountBalance = accountBalance;
        System.out.println("Saving Account Opened Successfully");
    }

    @Override
    public double deposit(double amt) {
        accountBalance+=amt;
        accountBalance=accountBalance+(accountBalance*0.04);
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
