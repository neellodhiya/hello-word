import java.util.*;
class Evenodd
 {
  public static void main(String args[])
   {
     
    Scanner ob=new Scanner(System.in);
     System.out.println("enter number");
      int x=ob.nextInt();
      
        if(x%2==0)
         System.out.println(" it is even number= "+x);
         else
          System.out.println("it is odd number="+x);
     }
  }
