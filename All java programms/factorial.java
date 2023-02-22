import java.util.Scanner;
class factorial
  {
    public static void main(String args[])
    {
      int i=1,fact=1,num;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number:");
      num= sc.nextInt();
     
      while(i<=num)
        {
          fact= fact*i;
          i++;
        }
      System.out.println("Factorial of number is:" +fact);
    }
  }