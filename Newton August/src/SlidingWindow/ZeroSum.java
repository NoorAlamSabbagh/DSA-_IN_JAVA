package SlidingWindow;

public class ZeroSum {
    public static void main(String[] args) {
//        int a[] = {1, 0, -1, 1};
        int a[] = {-1, -1, -1, 0, 0, 1, 1, 1, 1, -1};
//        int n = 4;
        int n = 10;
//        int k = 3;
        int k = 4;

        int sum = 0;
        for(int i=0; i<k; i++)
            sum += a[i];

        if(sum == 0){
            System.out.println(1);
        }
   else
       for(int i=k; i<n; i++) {
           sum += a[i];
           sum -= a[i - k];

           if (sum == 0) {
               System.out.println(i - k + 2);
               break;
           }
       }
    }
}

//Zero Window Sum

/*
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    //  int a[] = {1, 0, -1, 1};
    //     int n = 4;
    //     int k = 3;

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    int a[] = new int[n];
    for(int i=0; i<n; i++){
        a[i] = sc.nextInt();
    }

        long sum = 0;
        int i=0;
        for(i=0; i<k; i++)
            sum += a[i];

        if(sum == 0){
            System.out.println(1);
        }
   else
       for(i=k; i<n; i++) {
           sum += a[i];
           sum -= a[i - k];

           if (sum == 0) {
               System.out.println(i - k + 2);
               break;
           }
       }
       if(i==n){
           System.out.println(-1);
       }
    }
}
 */

/*
Sample Input 1:
4 3
1 0 -1 1

Sample Output 1:
1
 */