// Write a JAVAprogram to check whether a number is negative, positive or zero.
import java.util.Scanner;
class third
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number:");
      n= sc.nextInt();
      if(n<0)
      {
        System.out.println("The number is negative:");
      }
      else if(n>0){
        System.out.println("The number is positive:");
      }
      else{
        System.out.println("The number is zero:");
      }
    }
  }