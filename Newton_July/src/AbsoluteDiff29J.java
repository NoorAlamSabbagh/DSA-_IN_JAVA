//QuickSort
// Sort by Absolute Difference - Quick Sort - Post Class (Incomplete)

import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class AbsoluteDiff29J {
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
            int n = sc.nextInt();
            int k = sc.nextInt();

            int b[] = new int[n];
            for(int i=0;i<n;i++)
                b[i] = sc.nextInt();

            int a[] = new int[n];
            for(int i=0; i<n; i++)
                a[i] = Math.abs(k - b[i]);

            quickSort(a, b, 0, n-1);

            for(int i=0; i<n;i++)
                System.out.print(b[i] + " ");

            System.out.println();
        }
    }
}
/*
Input:
3
5 7
10 5 3 9 2
5 6
1 2 3 4 5
4 5
2 6 8 3

Output:
5 9 10 3 2
5 4 3 2 1
6 3 2 8
 */


