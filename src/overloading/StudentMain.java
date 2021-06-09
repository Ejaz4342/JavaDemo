package overloading;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Student s1=new Student();

        System.out.println("SELECT SEARCH CRITERIA");
        System.out.println("1: BY USING STUDENT ID");
        System.out.println("2: BY USING STUDENT NAME");
        int choice= sc1.nextInt();

        if(choice==1){
            System.out.println("PLEASE ENTER STUDENT ID");
            int id= sc1.nextInt();
            s1.searchStudentDetails(id);
        }
        else if(choice==2){
            System.out.println("PLEASE ENTER STUDENT NAME");
            String name= sc1.next();
            s1.searchStudentDetails(name);
        }
        else{
            System.out.println("PLEASE PROVIDE VALID CRITERIA");
        }
    }

}
