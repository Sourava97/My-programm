import java.util.Scanner;
class positive
  {
    public static void main(String args[])
    {
      int num;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number:");
      num=sc.nextInt();
    
      if (num>=0)
      {
        System.out.println(" Number is positve:");
      }
      else{
        System.out.println("Number is negative:");
      }
      
    }
  }