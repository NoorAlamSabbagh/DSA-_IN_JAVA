
package main.sortings;

public class QuickSort26{

    public static int partition(int A[], int low, int high)
    {
        int pivot = A[low];
        int i = low + 1;
        int j = high;
        int temp;

        do
        {
            while (i<= high && A[i] <= pivot)
            {
                i++;
            }

            while (j>= low && A[j] > pivot)
            {
                j--;
            }

            // Swap A[i] and A[j]
            if (i < j)
            {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }while (i < j);

        // Swap A[low] and A[j]
        temp = A[low];
        A[low] = A[j];
        A[j] = temp;

        return j;
    }


    public static void quickSort(int A[], int low, int high)
    {
        int partitionIndex; // Index of pivot after partition

        if (low < high)
        {
            partitionIndex = partition(A, low, high);
            quickSort(A, low, partitionIndex - 1);  // sort left subarray
            quickSort(A, partitionIndex + 1, high); // sort right subarray
        }
    }

    public static void main(String[] args) {

//        int a[] = {10, 4, 5, 2, 6, 8};
        int a[] = {2, 10};
        int n = a.length;

        quickSort(a, 0, n-1);

        for(int i=0; i<n;i++)
            System.out.print(a[i] + " ");
    }
}