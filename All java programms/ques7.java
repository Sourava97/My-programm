//Write a program to create a Stack of Integer type and push five elements to it. Then, use a while loop to pop all the elements from the Stack.
import java.util.*;
 class ques7 
{
    public static void main(String args[])
  {
     Stack<Integer> stack = new Stack<>();

        stack.push(40);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
