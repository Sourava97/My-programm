import java.util.Scanner;
class fibonacci
  {
    public static void main(String args[])
    {
      int i,num,a=1,b=0,c=0;
        Scanner sc= new Scanner(System.in);
      System.out.println("Enter the any number:");
      num= sc.nextInt();

      for(i=1;i<=num;i++)
        {
          System.out.print("/"+c);
          c=a+b;
          a=b;
          b=c;
        
        }
    }
  }