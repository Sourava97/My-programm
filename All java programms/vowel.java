import java.util.Scanner;
class vowel
  {
    public static void main(String args[])
    {
      String st1;
      int i,vow=0,con=0,len;
      char ch;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the string:");
      st1=sc.next();
      for(i=0;i<st1.length();i++)
        {
          ch= st1.charAt(i);
          if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u')
          {
            vow++;
          }
          else
          {
           con++;  
          }
        }
      System.out.println("Total numbers of vowels are:"+vow);
      System.out.println("Total numbers of consonants are:"+con);      
      
        
      }
  }