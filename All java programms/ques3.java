// Write a program to create a TreeMap of String, Integer type and add five key-value pairs to it. Then, use a for-each loop to print all the keys and values in the TreeMap.
import java.util.*;
 class ques3 
 {
    public static void main(String[] args)
  {
   TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Asim",1);
        map.put("Amit",2);
        map.put("Rakesh", 3);
        map.put("Gurpreet", 4);
        map.put("Kashuik", 5);

     for (String key : map.keySet()) 
     {
        Integer value = map.get(key);
    System.out.println("  " + key + "  " +value);
        }
    }
}
