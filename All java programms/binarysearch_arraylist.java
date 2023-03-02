//BinarySearch using ArrayList //
import java.util.ArrayList;

class BinarySearch 
{
    int binarySearch(ArrayList<Integer> arr, int key) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) == key) {
                return mid;
            } else if (arr.get(mid) < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

class binarysearch_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(11);
        arr.add(12);
        arr.add(22);
        arr.add(25);
        arr.add(34);
        arr.add(64);
        arr.add(90);
        
        
        System.out.println("Array list :");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        int key = 22;
        BinarySearch sc = new BinarySearch();
        int index =sc.binarySearch(arr, key);

        if (index == -1) {
            System.out.println("\nElement not found");
        } else {
            System.out.println("\nElement found at index " + index);
        }
    }
}