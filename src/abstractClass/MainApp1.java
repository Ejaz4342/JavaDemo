package abstractClass;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHECK INTEREST RATE");
        System.out.println("1: SBI");
        System.out.println("2: HDFC");
        int choice = sc.nextInt();
        Rbi r1=null;

        if(choice==1){
            r1=new Sbi(); //upcasting
        }
        else if(choice==2){
            r1=new Hdfc(); //upcasting
        }
        r1.rateOfInterest();
    }
}
