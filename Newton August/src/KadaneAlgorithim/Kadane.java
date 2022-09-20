package KadaneAlgorithim;

public class Kadane {
    public static void main(String[] args) {
//        int a[] = {2, 3, -4, 7, -30, 10};
//        int a[] = {2, 3, -4, 7, -30, 1};
        int a[] = {-5, -10, -3, -7};
        int n = a.length;

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += a[i];

            maxSum = Math.max(maxSum, sum);
            if(sum<0)
                sum = 0;
        }
        System.out.println(maxSum);
    }
}


//Maximum Contiguous SubArray Sum
/*
class Main {
    public static void main (String[] args) {
                      // Your code here
   Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int i=0; i<n; i++)
                a[i] = sc.nextInt();

            long maxSum = Integer.MIN_VALUE;
            long sum = 0;
            for(int i=0; i<n; i++){
                sum += a[i];

                maxSum = Math.max(maxSum, sum);
                if(sum < 0)
                    sum = 0;
            }

            System.out.println(maxSum);
        }

    }
}
 */

/*
Input:
1
5
1 2 3 4 -10

Output:
10

Explanation:-
1+2+3+4=10
 */