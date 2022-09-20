import java.util.*;
//code 1
/*public class L10_GCDSearching9July  {
    public static void main(String[] args) {
        int arr[] = {10, 5, 30, 2, 6, 7};
        int n = arr.length;
        int x = 6;

        System.out.println(arr.length);

        for(int i=0; i<n; i++)
            System.out.println(arr[i] + " ");

        int pos = -1;
        for(int i=0; i<n; i++){
            if (arr[i] == x)
                pos = i;
        }

        if(pos == -1)
            System.out.println("Element not present: " +pos);
        else
            System.out.println("Element present at position: " +pos);
    }
}
 */

//code 2
public class L10_GCDSearching9July  {
    public static void main(String[] args) {
        int [] arr = {2, 4, 5, 10, 20, 30, 60};
        int n = arr.length;
        int x = 30;

        int l = 0;
        int r = n-1;
        int m = -1;

        while(l<=r){
            m = l + (r-l)/2;
            if(arr[m]==x)
                break;
            else if (arr[m]<x)
                l = m+1;
            else
                r = m-1;
        }

        if(l>r)
            System.out.println("Element not present: " +(-1));
        else
            System.out.println("Element present at position: " +m);
    }
}
