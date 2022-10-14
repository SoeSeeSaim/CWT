package Basic.Hello;

public class Operators {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int c=12;
        int d=16;
        int e=1;
        int result;

        result= (c+d)*a/b; //Arithmetic operator * / % + -
        System.out.println("The result is "+ result);

        //Relational or comparsion operator < > =< >= instanceof == !=
        boolean flag1= a>d;
        boolean flag2= a+d>c;
        boolean flag3=a*b+e==d;
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3+"\n");

        //Logical operator && ||
        boolean flag4= a>b && a<b;
        System.out.println(flag4);

        boolean flag5= a+b+c==d   || a==a;
        System.out.println(flag5+"\n");

        //bitwise AND &
        boolean bitAnd1= 3<4 & 6<5;//1 0
        System.out.println(bitAnd1);
        boolean bitAnd2 = 3>4 & 1==1;//0 1
        System.out.println(bitAnd2);
        boolean bitAnd3=2==3-1 & 4>1;//1 1
        System.out.println(bitAnd3);
        boolean bitAnd4= 1>4 & 7<3;//0 0
        System.out.println(bitAnd4);
        System.out.println("\n");

        //bitwise exclusive OR ^
        boolean bitEor1= 6>1 ^ 1+2==3;//1 1
        System.out.println(bitEor1);
        boolean bitEor2= 1>6 ^ 5>2;//0 1
        System.out.println(bitEor2);
        boolean bitEor3=1==1 ^ 3<2;//1 0
        System.out.println(bitEor3);
        boolean bitEor4=2>4 ^ 5<3;//0 0
        System.out.println(bitEor4+"\n");

        //Bitwise inclusive OR |
        boolean bitIor1= 6>1 | 1+2==3;//1 1
        System.out.println(bitIor1);
        boolean bitIor2= 1>6 | 5>2;//0 1
        System.out.println(bitIor2);
        boolean bitIor3=1==1 | 3<2;//1 0
        System.out.println(bitEor3);
        boolean bitIor4=2>4 | 5<3;//0 0
        System.out.println(bitIor4+"\n");

        //shift operator\
        //1.left operator
        int x=10;
        System.out.println(x<<2);
        System.out.println(x<<3);

        //2.right operator
        int y=20;
        System.out.println(y>>2);
        System.out.println(y>>3);

        //3.right shift 0 fills
        int z=30;
        System.out.println(z>>>2);

        //Ternary operator
        int num1=34;
        int num2=65;
        int ten=(num1<num2)?num1:num2;
        System.out.println("Smaller number "+ten);



    }
}
