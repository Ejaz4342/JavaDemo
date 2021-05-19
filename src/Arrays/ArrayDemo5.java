package Arrays;

import java.util.Scanner;

public class ArrayDemo5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter size of an array");
        int size = sc.nextInt();
        int[] arr=new int[size];
        System.out.println("please enter "+size+" Elements");

        for(int row=0;row<=size-1;row++){

            arr[row] = sc.nextInt();
        }
        System.out.println("******************************");

        for(int row=0;row<=size-1;row++){

            System.out.println(arr[row]);
        }

    }
}
