import java.util.Scanner;
class product
  {
    public static void main(String args[])
    {
      int pno;
      String pname;
      float pcost;
      float pqt;
      float bamt;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter product number:");
      pno = sc.nextInt();
      System.out.println("Enter product name:");
      pname = sc.next();
      System.out.println("Enter product cost:");
      pcost = sc.nextFloat();
      System.out.println("Enter product quantity:");
      pqt = sc.nextFloat();
      bamt= (pqt*pcost);
      System.out.println(" Enter bill amount:" +bamt);
    
      
    }
  }