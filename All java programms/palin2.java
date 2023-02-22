import java.util.*;
class palin2
  {
    public static void main(String args[])
    {
       int i,num;
      boolean res;
       Scanner sc=new Scanner(System.in);
    System.out.println("Enter Any Number:");
      num=sc.nextInt();
      Palindrome p1=new Palindrome();
      res=p1.palin(num);
      if(res==true)
      System.out.println("Its Palindrome Number");
      else
     System.out.println("Its Not Palindrome Number");   
    }
  }



