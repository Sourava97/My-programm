import java.util.Scanner;
class bill
  {
   public static void main(String args[])
    {
     int conu,pmr,lmr;
      String cname;
      double tu,bill;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the Consumer Number: ");
      conu=sc.nextInt();
      System.out.println("Enter the Consumer Name: ");
      cname=sc.next();
      System.out.println("Enter the Present month reading: ");
      pmr=sc.nextInt();
      System.out.println("Enter the Present month reading: ");
      lmr=sc.nextInt();
      tu=pmr-lmr;
      System.out.println("The Consumer Number is:" +conu);
      System.out.println("The Consumer Name is:" +cname);
      System.out.println("The Present Month reading is:" +pmr);
      System.out.println("The last Month reading is:" +lmr);
      System.out.println("The bill is:" +bill);
        System.out.println("Total unit is is:" +tu);
if(tu<=50)
{
bill=tu*1.45;
System.out.println("The Total Bill is:" +bill);
}
else if(tu<=100)
{
bill=((50*1.45)+(50*2.56)+(tu-100)+3.5);
System.out.println("The Total Bill is:" +bill);
}   
else if(tu<=200)
{
bill=((50*1.45)+(50*2.56)+(50*3.5)+(tu-200)*4.67);
  System.out.println("The Total Bill is:" +bill);
} 
else if(tu>300){
bill=(50*1.45)+(50*2.56)+(50*3.5)*(50*4.67)+(tu-300)*5.67;
System.out.println("The Total Bill is:" +bill);
} 
else
{
  System.out.println("Invalid ");
}
    }
  }