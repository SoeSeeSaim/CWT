package Basic.Hello;

import OOP.Example1;

public class Main{
    static int a=5; //static global variable
    int b=1;//instance variable
    public static void main(String[] args) {
        int a=3;//local variable
        System.out.println(a);
        System.out.println(Main.a);
        final float pi=3.414F;//constant
        System.out.println(pi);
    }
}
