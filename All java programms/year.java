import java.util.Scanner;
class year
{
  public static void main(String args[])
  {
    int year;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year:");
    year= sc.nextInt();
    if ((year%4==0) && (year%100!=0) || (year%400==0))
    {
    System.out.println(year+ "It is a leap year:");
    }
    else
 {
    System.out.println(year+"It is not a leap year:");
 }  
  
  }
}