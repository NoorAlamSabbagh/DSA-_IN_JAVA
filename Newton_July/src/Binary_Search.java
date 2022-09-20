/*package main;

public class Binary_Search{

    public static void PrintDigitsWithRecursion(int n){
        if(n==0)
            return;

        int r = n%10;

        PrintDigitsWithRecursion( n/10);
        System.out.print(r);
    }
    public static int binarySearch(int arr[],int n, int x) {

        int l = 0;
        int r = n-1;

        while (l<=r) {
            int m = l + (r-l)/2;

            if(arr[m] == x){
                return m;
            }
            else if(arr[m]<x){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        // Value not found
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {10,25,30,42,100};
        int n = arr.length;
        int x = 30;
        System.out.println(binarySearch(arr,n,x));
    }

}

 */
/*package main;

public class Binary_Search{

    public static int binarySearchWithRecursion(int arr[],int n, int x,int l, int r){
        if(l>r)
            return -1;

        int m = l + (r-l)/2;
        if(arr[m] == x)
            return m;

        if(arr[m]<x)
          //  l = m+1;
            return binarySearchWithRecursion(arr,n,x,m+1,r);
        else
          //  r = m-1;
            return binarySearchWithRecursion(arr,n,x,l,m-1);
    }

    public static int binarySearch(int arr[],int n, int x){

        int l = 0;
        int r = n-1;

        while (l<=r) {
            int m = l + (r-l)/2;

            if(arr[m] == x){
                return m;
            }
            else if(arr[m]<x){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        // Value not found
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {10,25,30,42,100};
        int n = arr.length;
        int x = 30;
        System.out.println(binarySearch(arr,n,x));
    }

}


 */

//Code 5
import java.util.*;
public class Binary_Search {

//    public static void printDigitsWithRecursion(int n) {
//        if(n==0)
//            return;
//
//        int r = n%10;
//        //System.out.println(r);
//        printDigitsWithRecursion( n/10);
//        System.out.print(r);
//    }

    public static int binarySearch(int arr[],int n, int x){

        int l = 0;
        int r = n-1;

        while (l<=r) {
            int m = l + (r-l)/2;

            if(arr[m] == x){
                return m;
            }
            else if(arr[m]<x){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        // Value not found
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {10,25,30,42,100};
        int n = arr.length;
        int x = 30;
        System.out.println(binarySearch(arr,n,x));
    }

}

