import java.io.*;
import java.util.Scanner;
class grade
{
public static void main(String args[])
   {
   float total=0,avrg=0;
   float marks[];
   marks= new float[5];
   System.out.println("Grade calculator\nEnter your marks in five subjects:");
   Scanner sc= new Scanner(System.in);
   for(int i=0;i<=4;i++)
       {
         marks[i]=sc.nextFloat();
        }
   for(int i=0;i<=4;i++)
      {
      System.out.println("Your mark"+i+" is "+marks[i]);
      total+=marks[i];
       }
   System.out.println("Your total is:"+total);
   avrg=total/5;
   System.out.println("Your average is:"+avrg);
   grade(avrg);  
     }

public static void grade(float a)
      {
       if(a>=90 && a<100)
           {
          System.out.println("You have secured A+ Grade");
             } 
       else if(a>=85 && a<90)
           {
          System.out.println("You have secured A Grade");
             } 
       else if(a>=70 && a<85)
           {
          System.out.println("You have secured B Grade");
             } 
      else
          {
         System.out.println("You have secured C Grade");
            }

        }

}