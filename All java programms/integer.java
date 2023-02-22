import java.io.*;
class integer
  {
    public static void main(String args[]) throws IOException
    {
      InputStreamReader in= new InputStreamReader(System.in);
      BufferedReader br= new BufferedReader(in);
      int n;
      System.out.println("Enter any integer:");
       n=Integer.parseInt(br.readLine());

      System.out.println("The given integer value is:"+n);
    }
  }