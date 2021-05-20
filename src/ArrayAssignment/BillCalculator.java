package ArrayAssignment;
import java.util.Scanner;

public class BillCalculator {

     static Scanner sc=new Scanner(System.in);
     static double tip;
    static int bills;
    static double[] billArray;
    public static void main(String[] args) {
        System.out.println("Enter total number of bills");
        bills=sc.nextInt();
        billArray=new double[bills];
        System.out.println("enter bill amount for "+bills+" Bills");
        // Store amounts in array
        for (int i=0;i<=bills-1;i++){
            billArray[i]= sc.nextDouble();
        }

      double[] total =billCalculatorMethod();
        double[] tipArr =tipCalculator();
        double sumOfBillAmt=0;
        double sumOfTipAmt=0;
        double sumOfTotalAmt=0;
        for (int i=0;i<=bills-1;i++){
            sumOfBillAmt=sumOfBillAmt+billArray[i];
            sumOfTipAmt=sumOfTipAmt+tipArr[i];
            sumOfTotalAmt=sumOfTotalAmt+total[i];
        }
        System.out.println("**** Final Bill Details****");
        System.out.print("Bill Amount");
        System.out.print("\t"+"Tip Amount");
        System.out.print("\t"+"Total Amount");
        for (int i=0;i<=bills-1;i++){
            System.out.print("\n"+ billArray[i] +"\t\t" +tipArr[i]+"\t\t"+total[i]);
        }
        System.out.println("\n==============================================");
        System.out.print(+sumOfBillAmt+"\t\t"+sumOfTipAmt+"\t\t"+sumOfTotalAmt);
    }
        // Tip Calculator method
    static double[] tipCalculator(){
        double[] tipArray=new double[bills];
        for (int i=0;i<=bills-1;i++){
            if(billArray[i]<=500){
                tip=billArray[i]*0.05;
            }else {
                tip=billArray[i]*0.07;
            }
            tipArray[i]=tip;
        }

        return tipArray;
    }

    // Bill Calculator method
    static double[] billCalculatorMethod(){
        double[] totalAmount=new double[bills];
        // calling tipCalculator method and storing values in tipArr[]
        double[] tipArr =tipCalculator();
        for (int i=0;i<=bills-1;i++){
            totalAmount[i]=billArray[i]+tipArr[i];
        }
        return totalAmount;
    }

}









