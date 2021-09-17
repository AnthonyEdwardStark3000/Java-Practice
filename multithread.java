class demo extends Thread
      {
     public void run()
          {
           int count=1;
            try
              {
              if(count==1)
               {
              Thread.sleep(10);
                }
              else if(count==2)
               {
              Thread.sleep(20);
                }
              else
               {
              Thread.sleep(10);
                }
              count++;
               }
              catch(InterruptedException e)
                {
                System.out.println("Thread interrupted");
                  }
         String[] name={"Hi","Hello","Thank you"};
         for(int i=0;i<3;i++)
            {
           System.out.println(name[i]);
              }
      System.out.println(Thread.currentThread().getId());
             }
        }

public class multithread
            {
     public static void main(String args[])
                {
         for(int i=1;i<=3;i++)
               {
             demo d = new demo();
             d.start();
                 }
                   }
              }