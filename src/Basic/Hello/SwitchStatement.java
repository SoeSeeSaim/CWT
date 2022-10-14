package Basic.Hello;

public class SwitchStatement {
    public static void main(String[] args) {
        char a='.';
        int x=10;
        int y=5;
        switch(a){
            case '+':
                System.out.println(x+y);
                break;
            case '-':
                System.out.println(x-y);
                break;
            case '*':
                System.out.println(x*y);
                break;
            case '/':
                System.out.println(x/y);
                break;
            case '%':
                System.out.println(x%y);
                break;
            default:
                System.out.println("Enter an operator");
        }
    }
}
