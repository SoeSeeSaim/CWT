package Basic.Hello;

public class WhileStatement {
    public static void main(String[] args) {
        int a=5;
        while(a<10){
            System.out.println(a+" is less than 10");
            a++;
        }
        int b=5;
        do {
            System.out.println(b);
            b+=1;
        } while(b<10);
    }
}
