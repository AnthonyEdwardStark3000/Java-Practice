import java.util.*;
public class QueueExample {
    public static void main(String args[])
    {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(1);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        q.add(110);
        q.add(120);
        q.add(130);
        q.add(140);
        q.add(150);
        q.add(160);
        System.out.println("The head is:"+q.peek());
        System.out.println("Removing the head :"+q.remove());
        System.out.println("New head :"+q.peek());
        System.out.println("All the elements in the queue are :"+q);



    }
}
