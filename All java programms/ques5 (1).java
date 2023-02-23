//Write a program to create a PriorityQueue of Double type and add ten elements to it. Then, use a for-each loop to print all the elements in the PriorityQueue.
import java.util.*;
class ques5
  {
    public static void main(String args[]) 
    {
     PriorityQueue<Double> du = new PriorityQueue<>();

        du.add(1.2);
        du.add(2.2);
        du.add(3.2);
        du.add(0.2);
        du.add(5.2);
        du.add(4.2);
        du.add(9.2);
        du.add(8.2);
        du.add(7.2);
        du.add(6.2);

        for (double d : du) {
            System.out.print(d + " ");
        }
    }
}
