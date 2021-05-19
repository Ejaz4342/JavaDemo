package Arrays;

public class ArrayDemo6 {

    public static void main(String[] args) {
        String[] cources=new String[4];
        cources[0]="Java";
        cources[1]="SQL";
        cources[2]="J2EE";
        cources[3]="Java Script";
        displayArray(cources);
    }

    static void displayArray(String[] arr){
        for (int row=0;row<=3;row++){
            System.out.println(arr[row]);
        }
    }
}
