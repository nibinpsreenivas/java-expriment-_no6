import java.util.*;
import java.io.*;
class program2 
  {
    public static void main(String args[])
    {
       int acc =1000,wid,bal;
       Scanner obj = new Scanner(System.in);
       System.out.println("enter the amaount");
       wid = obj.nextInt();
       bal=acc-wid;
      if(bal<500)
         throw new ArithmeticException("balance less than 500");
      else
       System.out.println("balance is :"+bal);
     
     
     }
  }
                 
