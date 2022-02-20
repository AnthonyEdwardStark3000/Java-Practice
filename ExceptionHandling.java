import java.io.*;
import java.util.Scanner;

class InsufficientFundException extends Exception{
    public InsufficientFundException(String msg){
        super(msg);
    }
}


public class ExceptionHandling {
    public static void main(String args[])
    {
        int a =100, b=0;
        int c =0;
        try {
            c= a/b;
            int arr[] = null;
            System.out.println(arr[2]);
            }
        catch(ArithmeticException e)
        {
            System.err.println("Stuck with an arithmetic exception :"+e);
        }
        catch(NullPointerException e)
        {
            System.err.println("Stuck with an Null pointer exception :"+e);
        }
        catch(Exception e)
        {
            System.out.println("Exception"+e);
        }
        finally{
            System.out.println("Handled the exceptions");
            }
        System.out.println(c+"\tEnd");
        System.out.println("File handling\n Checked exception duri  ng compile time");
        File file = new File("Sample.txt");
        try {
            FileInputStream fs = new FileInputStream(file);
        }
        catch(FileNotFoundException e){
//            System.err.print(e);
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any variable:");
        int testVariable = sc.nextInt();
        System.out.println(testVariable);
        System.out.println("Custom exception");
        int balance = 100, withdraw =200;
        try
        {
            if(withdraw > balance)
            {
                throw new InsufficientFundException("Sorry boss its month end");
            }
        } catch (InsufficientFundException e) {
//            e.printStackTrace();
            System.err.println(e.getMessage());
        }

    }

}
