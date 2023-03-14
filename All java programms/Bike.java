import java.util.*;
class Bike
  {
    String model;
    String color;
    public static void main(String args[])
    {
      Bike myFirstBike= new Bike();
      myFirstBike.model= " Bajaj ";
      myFirstBike.color= "Black";

       Bike myNewBike= new Bike();
      myNewBike.model= " Pulsar ";
      myNewBike.color= "Blue";

      System.out.print("FirstBike:");
      System.out.println(myFirstBike.model+" "+myFirstBike.color);

      System.out.print("NewBike:");
      System.out.println(myNewBike.model+" "+myNewBike.color);
      
    }
  }