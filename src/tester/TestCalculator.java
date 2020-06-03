package tester;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.app.*;

public class TestCalculator {
    public static void main(String[] args)
    {
        Calculator c = new Calculator();
        Scanner input = new Scanner(System.in);
        
        do
        {
            try{
                
            System.out.println("Enter two numbers: ");
            c.setFirst(input.nextDouble());
            c.setSecond(input.nextDouble());
            System.out.println("Enter a choice of operation :");
            System.out.println("  1.  Add");
            System.out.println("  2.  Subtract");
            System.out.println("  3.  Multiply");
            System.out.println("  4.  Divide");
            System.out.println("  5. Exit");
            int ch;
            try{
            ch = input.nextInt();
            
            Double result;
            if(ch>0 && ch<6){
            switch(ch)
            {
                case 1:
                {
                    result = c.add();
                    System.out.println("Result is :  "+c.getFirst()+" + "+c.getSecond()+" = "+ result);
                }
                break;
                case 2:
                {
                    result = c.subtract();
                    System.out.println("Result is :  "+c.getFirst()+" - "+c.getSecond()+" = " + result);
                }
                break;
                case 3:
                {
                    result = c.multiply();
                    System.out.println("Result is :  "+c.getFirst()+" * "+c.getSecond()+" = " + result);
                }
                break;
                case 4:
                {
                    result = c.divide();
                    System.out.println("Result is :  " +c.getFirst()+" / "+c.getSecond()+" = "+ result);
                }
                break;
                case 5:
                    System.exit(0);
                break;

            } 
            }
            else
            {
                System.out.println("Enter a valid choice");
            }
            }catch(InputMismatchException e)
            {
                System.out.println("Choice must be integer.");
            }
        }catch(InputMismatchException e)
        {
            System.out.println("Must be numbers.");
            System.exit(1);
        }
        }while(true);
        
    }
}