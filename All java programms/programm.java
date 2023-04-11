import java.util.*;
class programm {
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    String rev="";
    // String st1="hello";
    System.out.println("Enter the string:");
    String st1=sc.nextLine();
    for(int i=st1.length()-1;i>=0;i--)
      {
        rev+=st1.charAt(i);
      }
    System.out.println(rev);
      }
  }

