//code1
/*import java.util.*;

public class insertion_sort {
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

//code 2

/*import java.util.*;
public class insertion_sort {
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
                    n++;
                    break;
                }
            }
            if(j<0){
                a[j + 1] = key;
            }
        }
        for(int i=0; i<n;i++)
            System.out.println(a[i] + " ");
    }
}


 */
//assignment code
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void insertionSort(int a[], int n){

        // All the keys
        for(int i=1; i<n; i++){
            int key = a[i];

            //Insertion Logic
            int j = 0;
            for(j=i-1; j >= 0; j--) {


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
        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");

    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            int a[] = new int[n];

            for(int i=0; i<n; i++)
                a[i] = sc.nextInt();

            insertionSort(a,n);
            System.out.println();
        }

    }
}

/*
input
2
5
4 1 3 9 7
10
10 9 8 7 6 5 4 3 2 1
 */

/*
output
1 3 4 7 9
1 2 3 4 5 6 7 8 9 10
 */