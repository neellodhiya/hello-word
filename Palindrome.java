import java.util.*;
class Palindrome
 {
  public static void main(String args[])
   {
     int reverse=0,rem;
    Scanner ob=new Scanner(System.in);
     System.out.println("enter number");
      int number=ob.nextInt();
      int temp=number;
      while(temp!=0)
      {
       rem=temp%10;
       reverse=reverse*10+rem;
       temp=temp/10;
      }
     if(reverse==number)
      {
      System.out.println("it is plaindrome");
      }
     else
      {
       System.out.println("it is not plaindrome");
      }
 }
 }