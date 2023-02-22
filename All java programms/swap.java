import java.util.Scanner;

class swap
{
  public static void main(String args[])
  {
    int x;
    int y;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of x:");
    x = sc.nextInt();
    System.out.println("Enter the value of y:");
     y = sc.nextInt();
    x = x+y;
    y = x-y;
    x = x-y;
    System.out.println("After swapping  numbers x value is:" +x);
    System.out.println("After swapping numbers y value is:" +y);
    
  }
}