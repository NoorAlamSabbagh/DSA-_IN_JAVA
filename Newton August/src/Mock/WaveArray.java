package Mock;
import java.util.*;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        for(int i=1; i<a.length; i+=2){
            System.out.print(a[i] + " " + a[i-1] + " ");
        }
    }
}






/*
Given an array of integers,  sort the array into a wave like array and return it,

In other words, arrange the elements into a sequence such that  a1 >= a2 <= a3 >= a4 <= a5.....

Example

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]
NOTE : If there are multiple answers possible, return the one thats lexicographically smallest.

So, in example case, you will return [2, 1, 4, 3]


public int[] solve(int[] arr) {
 // complete the method
}
 */