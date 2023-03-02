import java.util.*;
class date
{
  public static void main(String args[])
    {
    Date dt= new Date();
    System.out.println("The date is:"+dt);
    System.out.println("The date is:"+dt.getDate());
  System.out.println("This month is:"+(dt.getMonth()+1));
    System.out.println("This year is:"+(dt.getYear()+1900));
    System.out.println("The day is:"+dt.getDay());
    System.out.println("The hours is:"+dt.getHours());
    System.out.println("The minutes is:"+dt.getMinutes());
    System.out.println("The seconds is:"+dt.getSeconds());
    }
}