// student marks and grades

import java.util.Scanner;
class Mark
  {
    public static void main(String args[])
    {
      int max,phy,che;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the marks of mathametics:");
      max=sc.nextInt();
      System.out.println("enter the marks of physics:");
      phy=sc.nextInt();
      System.out.println("enter the marks of chemistry:");
      che=sc.nextInt();
      int avg=(max+phy+che)/3;
      if(max>=40 && phy>=40 && che>=40){
       System.out.println("The student is passed");
        if(avg==50){
          System.out.println("the student got passed C grade");
        }
          else if(avg>=51 && avg<=70){
          System.out.println("Student got passed and he got B grade");
          }
          else if(avg>=71 && avg<=80){
          System.out.println("Student got passed and he got A grade");
          }
          else {
          System.out.println("Student pass in distenction");
          }
          }
          
      else {
        System.out.println("The student is failed");
      }    
    }
  }