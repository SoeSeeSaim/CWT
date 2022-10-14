package Basic.Hello;

import java.util.Arrays;
import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter first and second numbers: ");
        int firstNum= scanner.nextInt();
        int secNum= scanner.nextInt();

        Scanner read= new Scanner(System.in);
        System.out.print("Enter operator(+,-,*,/,%) : ");
        String operator= read.nextLine();

        int result=0;
        if(operator.equals("+"))
        {
           result= firstNum+secNum;
        }
        else if(operator.equals("-"))
        {
            result= firstNum-secNum;
        }
        else if(operator.equals("*"))
        {
            result= firstNum*secNum;
        }
        else if(operator.equals("/"))
        {
            result= firstNum/secNum;
        }
        else if(operator.equals("%"))
        {
            result= firstNum%secNum;
        }
        System.out.println("The result is  " + result);

    }
}
