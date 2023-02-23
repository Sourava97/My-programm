//2.Write a program to create a HashSet of Integer type and add ten elements to it. Then, use an iterator to print all the elements in the HashSet.
import java.util.*;
 class ques2 
    {
    public static void main(String[] args) 
      {     
     HashSet<Integer> set = new HashSet<>();
       
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(25);
        set.add(30);
        set.add(35);
        set.add(40);
        set.add(45);
        set.add(50);

       
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
