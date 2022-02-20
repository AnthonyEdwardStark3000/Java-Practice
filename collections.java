import java.util.*;
public class collections {
    public static void main(String args[])
    {
     ArrayList<String> slist = new ArrayList<>();
     Scanner sc = new Scanner(System.in);
     for(int i=0; i<5;i++)
     {
         System.out.print("Enter any string :");
         String data = sc.nextLine();
         slist.add(data);
     }
     slist.add("Thank you");
     System.out.println(slist);
    }
}
