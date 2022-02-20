class Table{
     synchronized void printTable(int n){
        for(int i=1; i<= 5; i++)
        {
            System.out.println(n*i);
            System.out.println("Current Thread is :"+Thread.currentThread().getId());
            try
            {
                Thread.sleep(3000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class synchronizedThread {
    public static void main(String args[])
    {
        Table t = new Table();
        Thread t1 = new Thread() {
            public void run()
            {
            t.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            public void run()
            {
                t.printTable(2);
            }
        };
        t1.start();
        t2.start();
    }
}
