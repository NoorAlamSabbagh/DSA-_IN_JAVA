//Using Binary Search with some modification
package binarySearch;

public class FloorAndCeil {
    public static void binarySearch(int arr[],int n, int x) {

        int l = 0;
        int r = n - 1;
        int m = 0; //M

        while (l <= r) {
            m = l + (r - l) / 2;//int m :M

            if (arr[m] == x) {
                System.out.println(x + " " + x); //Modification in BS Code
                return;
            } else if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        // Value not found
        int a[] = new int[3];
        a[0] = m - 1 < 0 ? -1 : a[m - 1];
        a[1] = a[m];
        a[2] = m + 1 > 0 ? -1 : a[m + 1];

        int min = -1, max = -1;//M

        //M
        //min
        for (int i = 0; i < 3; i++) {
            if (a[i] <= x)
                min = a[i];
        }

        //M
        //max
        for (int i = 2; i >= 0; i--) {
            if (a[i] >= x)
                max = a[i];
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 6, 11, 15};
        int n = arr.length;
        int x = 2;

        binarySearch(arr, n, x);
    }

}