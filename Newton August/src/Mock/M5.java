package Mock;

/*public class M5 {
    public static void binarySearch(int a[], int first, int last, int key){
        int mid = (first + last)/2;
        while(first<=last){
            if(a[mid]<key){
                first = mid +1;
            } else if (a[mid] == key) {
                System.out.println("Element at index :  " +  mid);
                 break;
            }else{
                last = mid-1;
            }

        }
        if(first>last){
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        int a[] = {10, 20 ,30, 40, 50};
        int key = 30;
        int last = a.length-1;
        binarySearch(a,0,last,key);
    }
}


 */

//Problem 2
/*You are given an array. Find pairs in the given array whose sum is equal to K

        I/p: 1,2,3,4,5,6 K= 9 O/p: 3,6 4,5

        Explanation: In the given array there are two pairs 3,6 and 4,5 whose sum is equal to K(9).

 */

import java.util.*;
public class M5 {
    static boolean findPair(int a[], int size, int K){
        for(int i= 0; i<size-1; i++){
            for(int j=(i+1); j< size; j++){
                if(a[i]+ a[j] == K){
                    System.out.println("Pair " + K +" is (" +a[i]+ " , "+a[j]+  ") ");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = { 1,2,3,4,5,6 };
        int k = 9;
        int size = a.length;

        if(findPair(a,size,k)){
            System.out.println("Pair Exit");
        }
        else {
            System.out.println("Pair not Exit");
        }
    }
}