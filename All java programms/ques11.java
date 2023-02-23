// Write a program to remove all the duplicates from an ArrayList of Strings.
import java.util.*;
class ques11
  {
    public static void main(String args[]) 
    {
     ArrayList<String> list = new ArrayList<String>();
        list.add("Harsh");
        list.add("Mokel");
        list.add("Asit");
        list.add("Chinmaya");
        list.add("Sharma");

        HashSet<String> set = new HashSet<String>(list);
      
        list.clear();
        list.addAll(set);

       
  System.out.println("ArrayList with duplicates removed: " +list);
    }
}
