// Write a JAVAprogram to input any alphabet and check whether it is vowel or consonant using if else.
import java.util.Scanner;
class eightt
{
  public static void main(String args[])
  {  

char ch;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the character:");
ch= sc.next().charAt(0);


if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u' )
{
  System.out.println("Character is a vowel:");
}
else{
  System.out.println("Character is a consonant:");

}
}
}
