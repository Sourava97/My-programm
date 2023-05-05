import java.util.Scanner;
class student
{
  public static void main(String args[])
  {
    char ch;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Alphabet:");
   ch= sc.next().charAt(0);
   

 if(ch=='a'|| ch=='A')
    {
    System.out.println("It is vowel:");    
    }
    else
   if(ch=='e'|| ch=='E')
 {
    System.out.println("It is vowel:");
 } 
    else
     if(ch=='i'|| ch=='I')
   {
      System.out.println("It is vowel:");
   }
    else
      if(ch=='o'|| ch=='O')
      {
         System.out.println("It is vowel:");
      }
    else
      if(ch=='u'|| ch=='U')
      {
         System.out.println("It is vowel:");
      }
   
    else
          {
             System.out.println("It is a consonant:");
          }
  }
}