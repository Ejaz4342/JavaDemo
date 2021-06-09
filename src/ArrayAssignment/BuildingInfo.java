package ArrayAssignment;

import java.util.Scanner;

public class BuildingInfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Accepting floors and flats from user
        System.out.println("Enter total number of floors ");
        int floors = sc.nextInt();  // rows
        System.out.println("Enter total number of flats on each floor ");
        int flats= sc.nextInt();  //columns

        // create 2d array for floors and flats

        int[][] flatDetails=new int[floors][flats];
        System.out.println("please enter flat numbers for "+floors*flats+" flats");

        for (int i=0;i<floors;i++){
            int k=0;
            if (i==0||i==20||i==30){
                k=i+1;
                System.out.println("Enter flat numbers for "+k+"st floor ");
            } else if (i==1||i==21||i==31){
                k=i+1;
                System.out.println("Enter flat numbers for "+k+"nd floor ");
            }else if (i==2||i==22||i==33){
                k=i+1;
                System.out.println("Enter flat numbers for "+k+"rd floor ");
            }
            else {
                k=i+1;
                System.out.println("Enter flat numbers for "+k+"th floor ");
            }

            for (int j=0;j<flats;j++){
                flatDetails[i][j]=sc.nextInt();
            }

        }

        for (int i=0;i<floors;i++){
            int k=0;
            if (i==0||i==20||i==30){
                k=i+1;
                System.out.println("Flat numbers on "+k+"st floor ");
            } else if (i==1||i==21||i==31){
                k=i+1;
                System.out.println("Flat numbers on "+k+"nd floor ");
            }else if (i==2||i==22||i==33){
                k=i+1;
                System.out.println("Flat numbers on "+k+"rd floor ");
            }
            else {
                k=i+1;
                System.out.println("Flat numbers on "+k+"th floor ");
            }
            for (int j=0;j<flats;j++){
                System.out.print( flatDetails[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
