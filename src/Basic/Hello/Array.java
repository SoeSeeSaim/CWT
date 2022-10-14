package Basic.Hello;

import java.util.Arrays;

public class Array {
        public static void main(String[] args) {
            /* One dimensional Array */
            int[] arr = new int[10];//"new" is 'cause array is obj
            arr[0]=2;
            arr[2]=4;
            arr[8]=20;
            System.out.println(arr[0]);//an index value
            System.out.println(Arrays.toString(arr));//the whole array
            System.out.println(arr.length);//array size
            int[] arr2={10,20,30,40};
            System.out.println(arr2[2]);
            //double>>0.0
            //boolean>>false

            //Two dimensional array
            int[][] matrix={
                    {1,2,3,8,9},
                    {4,5,6}
            };
            System.out.println(matrix[1][2]);
            System.out.println(Arrays.deepToString(matrix));
            System.out.println(matrix[0].length);
            System.out.println(matrix[1][2]);

            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i])+"\t");
            }

            //jagged array
            int numbers[][]=new int[3][];
            numbers[0]= new int[5];
            numbers[1]=new int[2];
            numbers[2]=new int[4];


            //sorting
            int[] arr3={3,2,1};
            System.out.println(Arrays.toString(arr3));
            Arrays.sort(arr3);
            System.out.println(Arrays.toString(arr3));
        }
}

