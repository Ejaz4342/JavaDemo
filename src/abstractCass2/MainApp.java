package abstractCass2;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        HDFC h1=new HDFC();
        Icici c1=new Icici();
        Axis a1=new Axis();
        System.out.println("plz enter your choice");
        System.out.println("1:HDFC 2:ICICI 3:Axis");
        int i=sc.nextInt();
        if(i==1)
        {
            h1.interestRate();
        }else if(i==2)
        {
            c1.interestRate();
        }
        else if(i==3)
        {
            a1.interestRate();
        }
        else
        {
            System.out.println("Invalied Choice");
        }
    }
}
