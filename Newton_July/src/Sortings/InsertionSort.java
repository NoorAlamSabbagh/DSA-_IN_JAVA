package Sortings;
import java.util.*;

/*public class InsertionSort  {
    public static void main(String[] args) {
        int a[] = {1,3,6,7,10,20,0};
        int n= 6;
        int key = 4;


        int j = n-1;

        while(j>=0){
            if (a[j] > key)
                a[j + 1] = a[j];
            else {
                a[j + 1] = key;
                n++;
                break;
            }
            j--;
        }
        for(int i=0; i<n;i++)
            System.out.print(a[i] + " ");
    }
}
 */


public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {3,5,8,6,4};
        int n = a.length;

        //All the keys
        for(int i=1; i<n; i++) {
            int key = a[i];

            //Insertion Logic
            int j = 0;
            for (j=i-1; j >= 0; j--) {


                if (a[j] > key)
                    a[j + 1] = a[j];
                else {
                    a[j + 1] = key;
                    break;
                }
            }
            if(j<0){
                a[j + 1] = key;
            }
        }
        for(int i=0; i<n;i++)
            System.out.print(a[i] + " ");
    }
}