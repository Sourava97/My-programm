//Write a JAVAprogram to find maximum between three numbers
import java.util.Scanner;
class second
{
  public static void main(String args[])
  {
    int a,b,c;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the numbers:");
    a= sc.nextInt();
    b= sc.nextInt();
    c= sc.nextInt();
 if(a>b)
    {
  if(a>c){
    System.out.println("A is big:");
    }
      else{
        System.out.println("C is big:");
      }
    }
    else

   if(b>c){
    System.out.println("B is big:");
   }
     else
   {
     System.out.println("C is big:");
   }
    
 }  
  }
