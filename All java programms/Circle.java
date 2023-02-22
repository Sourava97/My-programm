import java.util.Scanner;

class Circle 
{
  public static void main(String args[])
    {
      int r;
      Float area;
      Float pi=3.14f;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the radius of circle:");
      r=sc.nextInt();
      area= pi*r*r;
      System.out.println("area of the circle:" +area);
      
      
    }
}
