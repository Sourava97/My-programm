// Write a program to find the second highest element in an ArrayList of integers.
import java.util.*;
 class ques10
   {
    public static void main(String args[])
     {
     ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(30);
        list.add(40);

        
        Collections.sort(list, Collections.reverseOrder());

       
        int secondHighest = list.get(1);

        System.out.println("Second highest element: " +secondHighest);
    }
}

