import java.util.Scanner;
class prime
{
  public static void main(String args[])
  {
    int i=1,num=1,c=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number:");
    c= sc.nextInt();
    while(i<=num)
      {
        if(num%i==0)
        {
          c++;
        }
        i++;
        if(c==2){
          System.out.println("It's a prime number");
        }
        else{
          System.out.println("It's not a prime number");
        }
        }
  }
}