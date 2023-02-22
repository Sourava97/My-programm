//Create a program that uses a switch case statement to determine the number of days in a month based on the month number.
import java.util.*;
class sample1
  {
    public static void main(String args[])
    {
      int mnth;
      int days;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number of month");
      mnth= sc.nextInt();

     switch(mnth) {
    case 4:
    case 6:
    case 9:
    case 11:
    System.out.println("Months having 30 days");
    break;
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
    System.out.println("Months having 31 days");
    break;
     case 2:
     System.out.println("Months having 28 days");
     break;
    default:
    System.out.println("No months exists");
    
         
         
     }
    }
  }