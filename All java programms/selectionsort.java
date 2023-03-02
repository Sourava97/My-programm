import java.util.ArrayList;
class selection
{

    void Sort(ArrayList<Integer> arr) 
  {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) 
        {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (arr.get(j) < arr.get(min_idx)) 
                {
                    min_idx = j;
                }
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(min_idx));
            arr.set(min_idx, temp);
        }
    }
}
class selectionsort
{
    public static void main(String args[]) 
  {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        arr.add(64);
        arr.add(34);
        arr.add(25);
        arr.add(12);
        arr.add(22);
        arr.add(11);
        arr.add(90);
        
        System.out.println("Before Sort array:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        selection sc = new selection();
        sc.Sort(arr);

        System.out.println("\nAfter Sorted array:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}