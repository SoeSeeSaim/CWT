package Basic.Hello;

public class ForStatement {
    public static void main(String[] args) {
        int i=5;
        int j;
        for(i=0;i<5;i++) {
            for (j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
