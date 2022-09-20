package TwoPointers;

import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class MinimumAbsoluteDifference {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        for(int i = 0; i<n; i++)
            a[i] = sc.nextInt();

        for(int i=0; i<n; i++)
            b[i] = sc.nextInt();

        int min = Math.abs(a[0] - b[0]);
        int i = 0;
        int j = 0;

        while(i<n && j<n){
            int diff = Math.abs(a[i] - b[j]);

            min = Math.min(min,diff);
            if(min == 0)
                break;
            if(a[i]<=b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(min);

    }
}
/*
Sample Input:
6
12 15 16 19 21 29
1 2 3 58 61 65

Sample Output:
9

Explanation : minimum absolute difference can be found between first element of first array
and third element of second array.
 */