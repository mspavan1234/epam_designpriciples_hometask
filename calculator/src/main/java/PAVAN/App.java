package PAVAN;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter number-1:" );
        int num1 = sc.nextInt();
        System.out.println( "Enter operator:" );
        String op = sc.next();
        System.out.println( "Enter number-2:" );
        int num2 = sc.nextInt();
        Operator result = new Operator(num1,op,num2);
        String res = result.getResult();
        System.out.println( "Result: "+res );
        sc.close();
    }
}
