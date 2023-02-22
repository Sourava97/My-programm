//Abstraction class and methods ...//


abstract class input
{
   abstract void calculate(int n,int a);
}
class add extends input
{
  void calculate(int n,int a)
  {
      int c = n + a;
      System.out.println("The addition of given numbers is :" +c);
  }
}
class subs extends input
{
  void calculate(int n,int a )
  {
      int c = n - a;
      System.out.println("The subtraction of given numbers is :" +c);
  }
}
class multi extends input
{
  void calculate(int n,int a)
  {
      int c = n * a;
      System.out.println("The multiplication of given numbers is :" +c);
  }
}
public class abstracts
{
	public static void main(String[] args) {
	    add s1 = new add();
	    subs s2 = new subs();
	    multi s3 = new multi();
	    s1.calculate(10,20);
	    s2.calculate(40,20);
	    s3.calculate(10,20);
	}
}