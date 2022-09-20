/*package main;

 public class Apple {
     public static void main(String[] args){

         int x = 77, n=6;
         if((x&(1<<(n-1)))==0)
         System.out.println("Zero");
        else
         System.out.println("One");
     }
}

 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int partition(int A[], int B[], int low, int high)
    {
        int pivot = A[low];
        int i = low + 1;
        int j = high;
        int temp;

        do
        {
            while (i<= high && A[i] < pivot)
            {
                i++;
            }

            while (j>= low && A[j] > pivot)
            {
                j--;
            }

            if (i < j)
            {
                // Swap A[i] and A[j]
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;

                // Swap B[i] and B[j]
                temp = B[i];
                B[i] = B[j];
                B[j] = temp;
            }
        }while (i < j);

        // Swap A[low] and A[j]
        temp = A[low];
        A[low] = A[j];
        A[j] = temp;

        // Swap A[low] and A[j]
        temp = B[low];
        B[low] = B[j];
        B[j] = temp;

        return j;
    }

    public static void quickSort(int A[], int B[], int low, int high)
    {
        int partitionIndex; // Index of pivot after partition

        if (low < high)
        {
            partitionIndex = partition(A, B, low, high);
            quickSort(A, B, low, partitionIndex - 1);  // sort left subarray
            quickSort(A, B, partitionIndex + 1, high); // sort right subarray
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();//4
            int k = sc.nextInt();// 5

            int b[] = new int[n];
            for(int i=0;i<n;i++)
                b[i] = sc.nextInt();// 2 6 8 3

            int a[] = new int[n];
            for(int i=0; i<n; i++)
                a[i] = Math.abs(k - b[i]);// 3 1 3 2

            quickSort(a, b, 0, n-1);

            for(int i=0; i<n;i++)
                System.out.print(b[i] + " ");

            System.out.println();
        }
    }
}