//class book implements Runnable{
//    public void run()
//    {
//        for(int i=0;i<5;i++)
//        {
//            System.out.println("Update");
//            try
//            {
//                Thread.sleep(8000);
//            }
//            catch(Exception e)
//            {
//                System.out.println(e);
//            }
//        }
//    }
//
//}
//class num extends Thread{
//    public void run()
//    {
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(i);
//            try
//            {
//                Thread.sleep(3000);
//            }
//            catch(Exception e)
//            {
//                System.out.println(e);
//            }
//        }
//    }
//
//}
//public class multithread {
//    public static void main(String args[]) throws InterruptedException
//    {
//        book b = new book(); //acts like an thread
////        b.update();
//        Thread t1 = new Thread(b);
//        t1.start();
//        num n = new num(); //made it another thread
////        n.print();
//        n.start();
//
////        book.join();
////        num.join();
//
//        System.out.println("End of main thread");
//    }
//}

class multithreadExample extends Thread
{
    public void run()
    {
        System.out.println("Current Thread is :"+Thread.currentThread().getId());
    }
}
class multithread {
    public static void main(String args[])
    {
        int n =8;
        System.out.println("Multithreading");
        for(int i=0;i<n;i++)
        {
            multithreadExample t1 = new multithreadExample();
            t1.start();
        }
    }

}
