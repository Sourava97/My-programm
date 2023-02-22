import java.util.Scanner;
class sum1
  {
    public static void main(String args[])
    {
      int i,num,sum=0;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the numbers:");
      i= sc.nextInt();
      num= sc.nextInt();
      sum= sc.nextInt();
      while(i<=num)
        {
          sum=sum+i;
          i++;
        }
        System.out.println("The sum of natural number:" +sum);
    }
  }
