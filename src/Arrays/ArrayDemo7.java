package Arrays;

public class ArrayDemo7 {
    public static void main(String[] args) {

        char[] arr2 = creatArray();

        for (int row=0;row<=3;row++){
            System.out.println(arr2[row]);
        }

    }

    static char[] creatArray(){
        char[] arr1=new char[4];
        arr1[0]='A';
        arr1[1]='B';
        arr1[2]='C';
        arr1[3]='D';
        return arr1;
    }
}
