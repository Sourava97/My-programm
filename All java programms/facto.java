class facto1
  {
    int fact(int n)
    {
      if(n==1)
        return 1;
      else
        return n*fact(n-1);
    }
  }
class facto
  {
    public static void main(String args[])
    {
      facto1 f1= new facto1();
      int n= f1.fact(8);
      System.out.println("The factorial value is:"+n);
    }
  }