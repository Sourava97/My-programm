//Write a JAVAprogram to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;
class fourth
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a number:");
      n= sc.nextInt();
      if (n%5==0 && n%11==0)
      {
  System.out.println("\n Given number " + n + " is Divisible by 5 and 11");
      }
      else{
  System.out.println("\n Given number " + n + " is not Divisible by 5 and 11");
      }
    }
  }