import java.util.Scanner;
class palindrome
  {
    public static void main(String args[])
    {
      String st1;
      String rev= "";
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the string:");
      st1= sc.next();
      for(int i =st1.length()-1;i>=0;i--)
        {
          char ch= st1.charAt(i);
          rev=rev+ch;
        }
      if(st1.equals(rev))
        {
        System.out.println("The string is a palindrome:" +st1);
        }
      else
      {
        System.out.println("The string is not a palindrome:" +st1);
      }
    }
  }