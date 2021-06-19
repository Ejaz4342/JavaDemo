package interfaces;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("SELECT YOUR DESIGNATION");
        System.out.println("1: HR");
        System.out.println("2: MANAGER");
        int choice= sc1.nextInt();
        System.out.println("ENTER YOUR BASIC SALARY");
        double salary= sc1.nextDouble();
        Employee e=null;
        if(choice==1){
            e=new HR(); //upcasting
        }
        else if(choice==2){
            e=new Manager(); //upcasting
        }
        e.getDesignation();
        e.getSalaryDetails(salary);
    }

}
