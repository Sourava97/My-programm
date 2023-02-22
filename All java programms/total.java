//Write a JAVAprogram to find total number of alphabets, digits or special character in a string. 
import java.util.Scanner;
class total
  {
    public static void main(String args[])
    {
      String st1;
      int i,alp=0,dig=0,spl=0;
      char ch;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the string:");
      st1= sc.nextLine();
      for(i=0;i<st1.length();i++)
        {
          ch= st1.charAt(i);
          if(ch>='A' && ch<='z' || ch>='a' && ch<='z')
          {
            alp++;
          }
          else if(ch>='0' && ch<='9')
          {
            dig++;
          }
          else
          {
            spl++;
          }
        }
      System.out.println("The alphabet letters are:" +alp);
      System.out.println("The digits are:" +dig);
      System.out.println("The special characters are:" +spl);
    }
  }