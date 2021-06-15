package overriding;

//Java Program to demonstrate the real scenario of Java Method Overriding
//where three classes are overriding the method of a parent class.

public class BankMainApp {
    public static void main(String[] args) {
        HDFCBank h1=new HDFCBank();
        ICICIBank i1=new ICICIBank();
        Axis a1=new Axis();
        System.out.println("Hdfc Bank rate of interest : "+h1.rateOfInterest());
        System.out.println("ICICI Bank rate of interest : "+i1.rateOfInterest());
        System.out.println("Axis bank rate of interest : "+a1.rateOfInterest());
    }
}
