package Sortings;

import java.util.Scanner;

public class SortByAbsDiff {
    public static int partition(int A[], int B[], int low, int high) {
        int pivot = A[low];
        int i = low + 1;
        int j = high;
        int temp;

        do {
            while (i <= high && A[i] < pivot) {
                i++;
            }

            while (j >= low && A[j] >= pivot) {
                j--;
            }

            if (i < j) {
                // Swap A[i] and A[j]
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;

                // Swap B[i] and B[j]
                temp = B[i];
                B[i] = B[j];
                B[j] = temp;
            }
        } while (i < j);

        // Swap A[low] and A[j] -->for Pivot swap
        temp = A[low];
        A[low] = A[j];
        A[j] = temp;

        // Swap A[low] and A[j]
        temp = B[low];
        B[low] = B[j];
        B[j] = temp;

        return j;
    }

    public static void quickSort(int A[], int B[], int low, int high) {
        int partitionIndex; // Index of pivot after partition

        if (low < high) {
            partitionIndex = partition(A, B, low, high);
            quickSort(A, B, low, partitionIndex - 1);  // sort left subarray
            quickSort(A, B, partitionIndex + 1, high); // sort right subarray
        }
    }

    public static void main(String[] args) {
        //int b[] = {10, 5, 3, 9, 2}; //let original array b
        int b[] = {2, 6, 8, 3}; //let original array b
        int n = b.length;
//        int k = 7;
        int k = 5;

        int a[] = new int[n];//get array from absolute difference

        for (int i = 0; i < n; i++)
            a[i] = Math.abs(k - b[i]);

        quickSort(a, b, 0, n - 1);

        for (int i = 0; i < n; i++)
            System.out.print(b[i] + " ");
    }
}


