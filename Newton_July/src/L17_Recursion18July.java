import java.util.*;
//Code 1
/*
public class L17_Recursion18July {
    public static void message(){
        System.out.println("Alam... you can do it");
    }
    public static void main(String[] args) {
        fun();
    }

    public static void fun(){
        System.out.println("Don't Give Up");
        message();
    }
}
 */

//Code 2
/*
public class L17_Recursion18July {

    public static void fun(){
        //fun();  //memory crashed nothing print.....
        System.out.println("Alam... you can do it");
        fun();//infinte print
    }
    public static void main(String[] args) {
        fun();

    }
}

 */

//Code 3
/*
public class L17_Recursion18July {

    public static void fun(int i) {
        if(i==10)
            return;

        System.out.println(i + "FUN!");
        fun(i+1);

    }

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Fun!");
//
//        }
        fun(0);
    }
}

 */

//Code 4

/*public class L17_Recursion18July {

    public static void printDigitsWithRecursion(int n) {
        if(n==0)
            return;

        int r = n%10;
        //System.out.println(r);
        printDigitsWithRecursion( n/10);
        System.out.print(r);
    }

    public static void printDigits(int n){

        while(n>0){
            int r = n%10;
            System.out.println(r);
            n = n/10;
        }
    }

    public static void main(String[] args) {

        int n = 1024;
        printDigitsWithRecursion(n);

    }
}

 */

//Code 5

public class L17_Recursion18July {

    public static void printDigitsWithRecursion(int n) {
        if(n==0)
            return;

        int r = n%10;
        //System.out.println(r);
        printDigitsWithRecursion( n/10);
        System.out.print(r);
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