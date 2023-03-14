import java.util.*;
class constructer
  {
    int x,y;
    public constructer()
    {
      x=5;
      y=9;
    }
    public static void main(String args[])
    {
      constructer myobj= new constructer();

      System.out.println("x="+myobj.x);
      System.out.println("y="+myobj.y);
    }
  }