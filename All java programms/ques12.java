// Write a program to find the sum of all the elements in a LinkedList of integers.
 import java.util.*;
 class ques12
  {
    public static void main(String args[]) 
  {
  LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(70);
        list.add(10);

        int sum =0;
        for (int i:list) 
        {
            sum = sum+i;
        }

  System.out.println("Sum of all elements in the LinkedList: " +sum);
    }
}

