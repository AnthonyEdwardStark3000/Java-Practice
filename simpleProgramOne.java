import java.util.*;
public class simpleProgramOne
        {
              public static int dummy=1;
               simpleProgramOne()
                    {
                     //Default constructor 
                        }
               simpleProgramOne(int a)
                            {
               System.out.println("Logged in successfully"); 
                 this.dummy=2;
                 
                              }
     public static void main(String args[])
                  {
                  System.out.println("Enter your PIN to continue:");
                  Scanner id= new Scanner(System.in);
   
                  int num= id.nextInt();
                  if(num==1234)
                      {
                  simpleProgramOne object =new simpleProgramOne(num);
                         }
                        else
                           {
                           System.out.println("OOps there is an issue in logging U in\nThough u cannot make purchase without loggingin enjoy unvieling new things by surfing");
                              }
                  double amount;
                  System.out.println("Welcome to Iworld\n1.Iphone xr\n2.Iphone 12\n3.Iphone 12 pro max\nPlease choose your mobile model to continue:");
                  Scanner sc= new Scanner(System.in);
                  int choice=sc.nextInt();//created object for reading input
                  System.out.println(choice);
                  revealThePrice(choice);
                  }
                public static void revealThePrice(int number) 
                                      {
                               if(number==1)
                                           {   
                                int amount_to_pay=1;
                              
                                  System.out.println("Please choose your storage: 1-64 gigs\n2-128gigs");
                                   Scanner storage= new Scanner(System.in);
                                   int value= storage.nextInt();
                                    if(value==1)
                                       {
                                        amount_to_pay=38000;
                                             }
                                          else if(value==2)
                                                 {
                                            amount_to_pay=52000;
                                                    }
                                    System.out.println("Choose your count");
                                    int count = storage.nextInt();
                                    revealThePrice(value,count,amount_to_pay); 
                                             }   
                                  else if(number==2)
                                               {
                                   int amount_to_pay=1;
                              
                               System.out.println("Please choose  your storage: 1-64 gigs\n2-256gigs");
                                   Scanner storage= new Scanner(System.in);
                                   int value= storage.nextInt(); 
                                    if(value==1)
                                       {
                                       amount_to_pay=56000;
                                             }
                                          else if(value==2)
                                                 {
                                         amount_to_pay=64000;
                                                    }
                                              System.out.println("Choose your count");
                                    int count = storage.nextInt();
                                    revealThePrice(value,count,amount_to_pay);
                                                    }

                                                    else if(number==3)
                                               {
                                   int amount_to_pay=1;
                              
                               System.out.println("Please choose  your storage: 1-128 gigs\n2-256gigs");
                                   Scanner storage= new Scanner(System.in);
                                   int value= storage.nextInt(); 
                                    if(value==1)
                                       {
                                       amount_to_pay=60000;
                                             }
                                          else if(value==2)
                                                 {
                                         amount_to_pay=79000;
                                                    }
                                              System.out.println("Choose your count");
                                    int count = storage.nextInt();
                                    revealThePrice(value,count,amount_to_pay);
                                                    }
                                                     
  
                                                     else
                                                     {
                                                   System.out.println("Please make an valid selection!");
                                                         }
                                                               }
                                
                               public static void revealThePrice(int choice, int count, int amount)
                                                                {
                                                               if(choice==1) 
                                                                              {
                                                                           int cashback=2500;
                                                                           int price=amount;
                                                                           float pay=price*count;
                                                                           
                                                                         System.out.println("You are supposed to pay :"+pay);
                                                                         System.out.println("You have received an cashback of rs. :"+cashback);
                                                                                
                                                                                  }
                                                                         
                                                               else if(choice==2) 
                                                                              {
                                                                          int cashback=3600;
                                                                          int price=amount;
                                                                           float pay=price*count;
                                                                         System.out.println("You are supposed to pay :"+pay);
                                                                         System.out.println("You have received an cashback of rs. :"+cashback);
                                                                                  }
                                                                      }             
           }