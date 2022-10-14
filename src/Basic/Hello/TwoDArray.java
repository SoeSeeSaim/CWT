package Basic.Hello;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3,},
                {3,5,7,9},
                {2,4,6,8,10,12,14}};
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(Arrays.toString(numbers[1]));
        System.out.println(numbers[2][4]);
        System.out.println(numbers[0].length);
        for (int i = 0; i < numbers[0].length; i++) {
            numbers[0][i]*=4;

        }
        System.out.println(Arrays.toString(numbers[0]));
        numbers[1][2]=numbers[1][2]-3;
        System.out.println(numbers[1][2]);
        for (int[] number : numbers) {
            for (int i = 0; i < number.length; i++) {
                System.out.print(number[i]+"\t");

        }
            System.out.println();

        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+"\t");

            }

        }
        System.out.println();
        int nums[][]=new int[3][];
        System.out.println(Arrays.toString(nums[0]));

        int nos[][]=new int[5][3];
        System.out.println(Arrays.toString(nos[0]));


        System.out.println("Enter a number");
        Scanner no= new Scanner(System.in);
        int num= no.nextInt();
        System.out.println("My Roll number is "+ num);



    }
}
