import java.io.*;
import java.util.*;

public class vector {
    public static void main(String args[])
    {
        Vector list = new Vector();
        int n = args.length;
        System.out.println("Allocated memory is :"+n);
        for (int i=0; i<n; i++)
        {
            list.addElement(args[i]);
        }
        for (int i=0; i<n; i++)
        {
            System.out.println(list.elementAt(i));
        }
        list.insertElementAt("Test", 1);

        for (int i=0; i<n; i++)
        {
            System.out.println(list.elementAt(i));
        }
        int size = list.size();
        System.out.println("Size:"+size);
        String name [] = new String[size];
        list.copyInto(name);
        for(int i=0;i<n;i++)
        {
            System.out.print(name);
        }
    }

}
