//Write a program to create a TreeSet of String type and add five elements to it. Then, use a for-each loop to print all the elements in the TreeSet.
import java.util.*;
 class ques8 
 {
    public static void main(String args[]) 
   {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Anil");
        treeSet.add("Basant");
        treeSet.add("Chirag");
        treeSet.add("Ravi");
        treeSet.add("Raman");

        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
