package casting;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("PLEASE SELECT MACHINE TYPE");
        System.out.println("1: LAPTOP");
        System.out.println("2: AC");
        int choice= sc1.nextInt();

        Machine m1=null;

//        Machine m2=new Laptop();
//        m2.getMachineType();

        if(choice==1){
            m1=new Laptop();  //upcasting
        }
        else if(choice==2){
            m1=new AC();      //upcasting
        }
        m1.getMachineType();
    }

}

