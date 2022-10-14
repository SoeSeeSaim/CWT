package Basic.Hello;

public class DataType {
    public static void main(String[] args) {

        byte num1 = -128;//-128 to 127
        short num2 = -32768;//-32768 to 32767
        int num3 = 4;
        long num4 = 65789465986L;
        float num5 = 49.5158F;
        double num6 = 3.1245546845;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

        boolean flag=6>9;//default value >>false
        System.out.println(flag);
        boolean flag1=num1<num3;
        System.out.println(flag1);

        char a='S';
        char b=83;//ASCII
        System.out.println(a);
        System.out.println(b);
    }
    }
