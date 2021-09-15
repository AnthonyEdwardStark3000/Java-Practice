import java.io.*;
import java.util.*;

interface mission
{
 void level();
  }

class play implements mission
    {   
 void resume()
   {
  System.out.println("Resuming the game from the last save point....");
    }

void restart()
   {
  System.out.println("Restarting the game");
    }
  
public void level()
    {
   System.out.println("\nPress 1 to resume or 0 to restart the mission :");
   Scanner sc = new Scanner(System.in);
   int ch=sc.nextInt();
   if(ch==1)
        {
      resume();
           }
    else if(ch==0)
          {
         restart();
            }
     else
           {
       System.out.println("Dear player please make an valid choice!");
             }
      }
 void me()
   {
   System.out.println("Level 21");
   }
 void error()
   {
   System.out.println("Error while parsing data");
   }

}

class overide extends play
  {
  void error()
     {
     System.out.println("Please quit some background apps to load the data");
       } 
   }


public class legendspot extends play
   {
    public static void main(String args[])
      {
     System.out.println("Welcome to the gamerspot\nSelect your game\n1.GOW\n2.FIFA\n3.GTA V\nEnter your option:");
     Scanner option = new Scanner(System.in);
     int ch=option.nextInt();
     play l= new play();
     l.level();
     System.out.println("Loading your profile");
     l.me();
     l.error();
     overide o = new overide();
     o.error();
      
        }
     }