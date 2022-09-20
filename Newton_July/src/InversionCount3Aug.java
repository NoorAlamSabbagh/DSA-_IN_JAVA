package main;

public class InversionCount3Aug {
    static int countMerges = 0;
    public static void merge(int a[], int l, int m, int r){
        int n1 = m-l + 1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        //Copy Values
        for(int i=l, j=0; i<=m; i++, j++){
            L[j] = a[i];
        }

        for(int i=m+1, j=0; i<=r; i++, j++){
            R[j] = a[i];
        }

        //Merge
        int i = 0;
        int j = 0;
        int k = l;
        while(i<n1 && j<n2){
            if(L[i] < R[j]){
                a[k++] = L[i++];
            }
            else{
                a[k++] = R[j++];
            }
        }

        while(i<n1){
            a[k++] = L[i++];
        }

        while(j<n2){
            a[k++] = R[j++];
        }
    }

    public static void mergeSort(int a[], int l, int r){
        if(l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
            countMerges+=1;
        }
    }

    public static void main(String[] args) {
        int a[] = {3, 7, 10, 1, 5, 15, 3};
        int n = a.length;

        int l = 0;
        int r = n-1;
        mergeSort(a,  l, r);

        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");

        System.out.println("\n\n" + countMerges);
    }
}
