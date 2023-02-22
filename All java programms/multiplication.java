import java.util.Scanner;
class multiplication
  {
    public static void main(String args[])
    {
      int i=1,num;
        Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number");
      num= sc.nextInt();
      while(i<=10)
        {
          System.out.println(num+"X"+i +"=" +i*num);
          i++;
        }
      
    }
  }