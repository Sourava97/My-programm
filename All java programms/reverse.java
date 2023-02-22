import java.util.Scanner;
class reverse
  {
    public static void main(String args[])
    {
      String st1;
      String reverse="";
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the string");
      st1= sc.next();
     for(int i =st1.length()-1;i>=0;i--)
       {
         char ch= st1.charAt(i);
         reverse=reverse+ch;
       }
System.out.println("Thr reverse of the given string is:"+reverse);
    }
  }