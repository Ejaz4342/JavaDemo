package ArrayAssignment;
// this is an example of multi dimensional array

import java.util.Scanner;

public class NoteBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of pages ");
        int pages= sc.nextInt();  // row
        System.out.println("Enter total number of lines on each page ");
        int lines=sc.nextInt();   // col
        System.out.println("Enter total number of words on each row");
        int words=sc.nextInt();    // col of col
        String[][][] bookArray=new String[pages][lines][words];
        System.out.println("enter "+(pages*lines*words)+" words");

       //  Accept words from end user
        for (int i=0;i<bookArray.length;i++){
            for (int j=0;j<bookArray[i].length;j++){
                for (int k=0;k<bookArray[i][j].length;k++){
                   bookArray[i][j][k]=sc.nextLine();//[0][0][0]=1
                    //[0][0][1]=2
                    //[0][1][0]=3
                    //[0][1][1]=4
                    //[1][1][0]=5
                    //[1][1][1]=6
                }
            }
            System.out.println();
        }

        // print data
        for (int i=0;i<bookArray.length;i++){
            System.out.println("page number : "+(i+1));
            for (int j=0;j<bookArray[i].length;j++){
                System.out.println("Line no : "+(j+1));
                for (int k=0;k<bookArray[i][j].length;k++){
                    System.out.print(bookArray[i][j][k]+"\t");
                }

            }
            System.out.println();
        }




    }
}
