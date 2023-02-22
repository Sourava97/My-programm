import java.util.Scanner;
class teen
{
  public static void main(String args[])
  {
    int age;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the age:");
    age= sc.nextInt();
 if(age>=13)
    {
  if(age<=19){
    System.out.println("He/She is teeneger:");
    }
      else{
        System.out.println("He/She is adult:");
      }
    }
    else

   {
    System.out.println("He/She is not teeneger/adult:");
   }
     
 }  
  }
