import java.io.*;
class Character
  {
    public static void main(String args[]) throws IOException
    {
      InputStreamReader in= new InputStreamReader(System.in);
      BufferedReader br= new BufferedReader(in);
      char ch;
      System.out.println("Enter any chararcter:");
      ch=(char)br.read();

      System.out.println("The given chararcter is:"+ch);
    }
  }