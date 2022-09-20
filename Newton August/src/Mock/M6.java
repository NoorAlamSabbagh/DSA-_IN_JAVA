package Mock;
import java.util.*;

public class M6 {
    public static void merge(int a[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i<l;  i++){
            L[i] = a[i];
        }

        for (int i = 0; i <= r; i++){
            R[i] = a[m + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                a[k++] = L[i++];
            } else {
                a[k++] = R[j++];
            }
        }

        while (i < n1) {
            a[k++] = L[i++];
        }
        while (j < n2) {
            a[k++] = R[j++];
        }
    }

    public static void mergeSort(int a[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;
        int l = 0;
        int r = n - 1;

        mergeSort(a, l, r);

        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }
}

