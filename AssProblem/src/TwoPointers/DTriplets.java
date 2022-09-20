package TwoPointers;

import java.util.*;

public class  DTriplets {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //int n = 5;
        long p = sc.nextLong();//long p = 4;

        long[] a = new long[n];//long[] a = {1,3,2,5,9};

        for(int i=0; i<n; i++)
            a[i] = sc.nextLong();

        Arrays.sort(a);

        int i=0, j=2;

        long ans=0;

        while(j!=n){

            if(i==j-1){
                j++;
                continue;
            }

            if((a[j]-a[i])>p){
                i++;
            }
            else{
                int x = j-i;
                ans += (x*(x-1))/2;
                j++;
            }
        }
        System.out.println(ans);
    }
}

/*
Sample Input:-
5 4
1 3 2 5 9

Sample Output:-
4

Explanation:-
(1, 3, 2), (1, 3, 5), (1, 2, 5), (2, 3, 5) are the required triplets

Sample Input:-
5 3
1 8 4 2 9

 */