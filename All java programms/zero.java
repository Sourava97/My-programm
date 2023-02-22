import java.util.Scanner;
  class zero
    {
      public static void main(String args[])
      {
      int eno;
      String ename;
        float esal;

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter employee number:");
       eno=sc.nextInt();
        System.out.println("Enter employee name:");
        ename=sc.next();

        System.out.println("Enter employee salary:");
       esal=sc.nextFloat();
        
        System.out.println("The given employee number:" +eno);
        System.out.println("The given employee name:" +ename);
        System.out.println("The given employee salary:" +esal);
        
        
          }
    }