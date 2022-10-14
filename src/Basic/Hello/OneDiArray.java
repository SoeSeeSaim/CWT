package Basic.Hello;

import java.util.Arrays;

public class OneDiArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,};
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length);
        System.out.println(nums[1]);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
        nums[0]=0;
        System.out.println(nums[0]);
        String[] names={"Harry Styles,Louis Tomlinson,Liam Pyane,Niall Horan,Zayn Malik"};
        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].toUpperCase());
            System.out.println(names[i].toLowerCase());

        }
        String[] colors=new String[5];
        colors[0]="Yellow";
        colors[1]="Red";
        colors[2]="Orange";
        colors[3]="Blue";
        colors[4]="Green";
        System.out.println(Arrays.toString(colors));
    }
}
