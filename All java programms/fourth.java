import java.util.*;
 class fourth
   {
    public static void main(String args[]) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i=0;i<a.length;i++) 
        {
            a[i] = sc.nextInt();
        }
        sc.close();
        insertionSort(a);
    }
    public static void insertionSort(int[] a)
     {
        int i,j,t;
        System.out.println("The Elements Before Sorting is:");
        for (i=0;i<a.length;i++)
          {
            System.out.println("\t" +a[i]);
           }
        for (i=1; i<= a.length-1; i++)
          {
            for (j=i;j>0 && a[j-1]>a[j];j--)
              {
                t = a[j];
                a[j] = a[j-1];
                a[j-1] = t;
            }
        }
        System.out.println("The Elements After Sorting is:");
        for (i=0; i<a.length; i++) 
        {
            System.out.println("\t"+a[i]);
        }
    }
}
   
