// Write a program to create a HashMap of String, Integer type and add ten key-value pairs to it. Then, use a for-each loop to print all the keys and values in the HashMap.

import java.util.*;
class ques6 
{
    public static void main(String args[]) 
  {
     HashMap<String, Integer> map = new HashMap<>();

       
        map.put("pavan", 25);
        map.put("jay", 21);
        map.put("ajay", 30);
        map.put("Dinesh", 27);
        map.put("ravi", 29);
        map.put("Sameer", 50);
        map.put("Gita", 55);
        map.put("Harsh", 30);
        map.put("Rakesh", 45);
        map.put("Jack", 50);

for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
