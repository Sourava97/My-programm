import java.util.*;
class Bubble 
{
    void Sort(ArrayList<Integer> arr) 
  {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
          {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr.get(j) > arr.get(j + 1))
                {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
                
            }
        }
    }
}    
    
class bubble1
{
    public static void main(String args[]) 
  {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(22);
        arr.add(34);
        arr.add(69);
        arr.add(66);
        arr.add(45);
        arr.add(67);
        arr.add(89);
        System.out.println("Before Sort array:");
        for (int i= 0;i< arr.size();i++) 
        {
            System.out.print(arr.get(i) + " ");
        }
        
        Bubble b = new Bubble ();
        b.Sort(arr);

        System.out.println("\nSorted array:");
        for (int i=0; i<arr.size();i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}