//Write a program to create a Hashtable of Integer, String type and add five key-value pairs to it. Then, use a for-each loop to print all the keys and values in the Hashtable.
import java.util.*;
 class ques9 
{
    public static void main(String args[]) 
  {
   Hashtable<Integer, String> hashtable = new Hashtable<>();

       
        hashtable.put(1, "One");
        hashtable.put(7, "Seven");
        hashtable.put(9, "Nine");
        hashtable.put(4, "Four");
        hashtable.put(8, "Eight");

        
 for (Map.Entry<Integer, String> entry : hashtable.entrySet()) 
 {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
