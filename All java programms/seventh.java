//Write a JAVAprogram to check whether a character is alphabet or not.
import java.util.Scanner;
class seventh
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a character:");
      ch= sc.next().charAt(0);
      if((ch>='a' && ch<='z') || (ch>='A' && ch<='z'))
      {
          System.out.println("It is an alphabet:");
      }
      else{
          System.out.println("It is not an alphabet:");
      }
    }
  }