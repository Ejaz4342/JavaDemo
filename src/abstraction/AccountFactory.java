package abstraction;

public class AccountFactory {
    //Factory method
    Account openAccount(String type, double openingBalance){
        Account a1=null;
        if(type.equals("SAVINGS")){
            a1=new SavingsAccount(openingBalance);
        }
        else if(type.equals("CURRENT")){
            a1=new CurrentAccount(openingBalance);
        }
        return a1;
    }

}
