import java.util.*;
class Armstrongnumber
 {
  public static void main(String args[])
   {
     Scanner ob=new Scanner(System.in);
     System.out.println("enter number");
      int no=ob.nextInt();
       int x=no;
       int length=0;
       while(x!=0)
          {
           x=x/10;
           length=length+1;
           }
      int y=no;
      int no2=0;
      int rem;
      while(y!=0)
           {
            int mul=1;
             rem=y%10;
            for(int i=1;i<=length;i++)
             {
              mul=mul*rem;
             }
               no2=no2+mul;
              y=y/10;
           }
       if(no2==no)
        {
          System.out.println("it is armstrong number");
         }
       else
         {
          System.out.println("it is not armstrong number");
           }
   }
 }
           
      