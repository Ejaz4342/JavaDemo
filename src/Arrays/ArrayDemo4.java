package Arrays;

public class ArrayDemo4 {

    public static void main(String[] args) {
        double[] marks=new double[5];
        marks[0]=55.7;
        marks[1]=60.25;
        marks[2]=50.20;
        marks[3]=70.83;
        marks[4]=65.11;
        double sum=0;
        double avg;
        for (int row=0;row<=4;row++){
            sum=sum+marks[row];
        }
        System.out.println("sum of marks is "+sum);
        avg=sum/5;
        System.out.println("Average of marks is "+avg);


    }
}
