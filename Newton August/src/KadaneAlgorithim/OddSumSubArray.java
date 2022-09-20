package KadaneAlgorithim;

public class OddSumSubArray {
    public static void main(String[] args) {
        int a[] = {2, 1, 3, 4, 5, 6};
        int n = a.length;

        int odd = 0, even = 0, totalOdds = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                sum = a[0];
            } else {
                sum = sum + a[i];
            }
            if (sum % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        totalOdds = odd;
        System.out.println(odd + "  " + even);
        for(int i=0; i<n-1; i++){
            if(a[i]%2 == 0){
                even--;
            }
            else{
                odd--;

                //Swap even and odd
                int temp = odd;
                odd = even;
                even = temp;
            }
            totalOdds += odd;
            System.out.println(odd + "  " + even);
        }
        System.out.println("\n\n" + totalOdds);
    }
}


//Assignment Problem : Number of SubArrays
/*
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        long odd = 0, even = 0, totalOdds = 0;
        long sum = 0;
        for(int i=0; i<n; i++){
            if(i==0){
                sum = a[0];
            }
            else{
                sum = sum + a[i];
             }

            if(sum%2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }

        totalOdds = odd;
//        System.out.println(odd + "   " + even);
        for(int i=0; i<n-1; i++){
            if(a[i]%2 == 0){
                even--;
            }
            else {
                odd--;

                //swap even and odd
                long temp = odd;
                odd = even;
                even = temp;
            }

            totalOdds += odd;
//            System.out.println(odd + "   " + even);
        }

        System.out.println(totalOdds);
    }
}
 */


/*
Sample Input 1:
3
1 3 5

Output
4

Explanation:
All subarrays are [1], [1, 3], [1, 3, 5], [3], [3, 5], [5]
All sub- arrays sum are [1, 4, 9, 3, 8, 5].
Odd sums are [1, 9, 3, 5] so the answer is 4.

Sample Input 2:
3
2 4 6

Output
0

Explanation:
All subarrays are [2], [2, 4], [2, 4, 6], [4], [4, 6], [6]
All sub- arrays sum are [2, 6, 12, 4, 10, 6].
All sub- arrays have even sum and the answer is 0.
 */