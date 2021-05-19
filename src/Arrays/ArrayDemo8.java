package Arrays;

public class ArrayDemo8 {
    public static void main(String[] args) {
        int[] numbers1={10,20, 30, 40, 50, 60, 70}; // Array Literal
        int[] numbers2={1,2, 3, 4, 5, 6, 7};        // Array literal
        int size=numbers1.length+numbers2.length;
        int[] result=new int[size];
        int position=0;

        // copy elements from numbers1[] to result[]
        for (int row=0;row<numbers1.length;row++){
            result[row]=numbers1[row];
            position++;
        }

        // copy elements from numbers2[] to result[]
        for (int row=0;row<numbers2.length;row++){
            result[position]=numbers2[row];
            position++;
        }

        // print result[]
        for (int row=0;row<result.length;row++){
            System.out.println(result[row]);
        }

    }
}
