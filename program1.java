import java.util.*;
import java.io.*;
class program1
  {
    public static void main(String args[])
    {
      
      try
       {
           int div = 100/0;
       }catch(ArithmeticException e)
             { 
               System.out.println("ArithmeticException ");
             }
      try
       {
          
          int a[] = new int[10];
            a[20]=1;     
        }catch(IndexOutOfBoundsException e)
             { 
               System.out.println("ArrayIndexOutOfBounds");
             }
    try
     {
       FileInputStream fin = new FileInputStream("/s/n.txt");
     }catch(FileNotFoundException e)
             { 
               System.out.println("file not found");
             }
     }
  }
                 
