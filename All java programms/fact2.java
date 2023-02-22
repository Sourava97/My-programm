import java.util.Scanner;
class fact2
  {
    public static void main(String args[])
    {
      int i=1,fact=1,num;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number:");
      num= sc.nextInt();
     
       do
        {
           System.out.println(i);
          fact= fact*i;
          i++;
        }  while(i<=num);
     
    }
  }