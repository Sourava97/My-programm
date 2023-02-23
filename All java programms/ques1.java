//1.Write a program to create an ArrayList of String type and add five elements to it. Then, use a for-each loop to print all the elements in the ArrayList.
import java.util.*;
class ques1 
{
    public static void main(String[] args)
  {
        ArrayList<String> list = new ArrayList<>();
    
        list.add("Sourav");
        list.add("Swammy");
        list.add("Ravi");
        list.add("Nagendra");
        list.add("Nageshwar");

        for (String element: list)
          {
            System.out.println(element);
        }
    }
}
