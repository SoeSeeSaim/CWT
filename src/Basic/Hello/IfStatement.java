package Basic.Hello;

public class IfStatement {
    public static void main(String[] args) {
        int a=13;
        int b=9;
        if(a<9)
        {
            System.out.println(a +" is smaller than "+ b);
            System.out.println("First statement is "+ (a<b));
        }
        else {
            System.out.println(a + " is greater than " + b);
            System.out.println("Second statement is " + (a > b));
        }

        int mark=70;
        if(mark<40)
        {
            System.out.println("Fail");
        }
        else if(mark>=40 & mark<80)
        {
            System.out.println("Pass");
        }
        if(mark>=80)
        {
            System.out.println("Outstanding");
        }
    }

}
