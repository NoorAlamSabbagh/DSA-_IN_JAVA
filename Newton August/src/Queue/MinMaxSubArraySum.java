package Queue;

import java.util.ArrayDeque;

public class MinMaxSubArraySum {
    public static void main(String[] args) {
        int n = 7;
        int k = 4;

        int a[] = {2, 5, -1, 7, -3, -1, -2};

        ArrayDeque<Integer> s = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while (!s.isEmpty() && a[s.peekLast()] >= a[i]) {
                s.removeLast();
            }
            s.addLast(i);
        }
    }
}





/*
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        ArrayDeque<Integer> s = new ArrayDeque<>();
        ArrayDeque<Integer> g = new ArrayDeque<>();

        for(int i=0; i<k; i++){
            while(!s.isEmpty() && a[s.peekLast()] >= a[i]){
                s.removeLast();
            }

            while(!g.isEmpty() && a[g.peekLast()] <= a[i]){
                g.removeLast();
            }

            s.addLast(i);
            g.addLast(i);
        }

        long sumMin = 0;
        long sumMax = 0;
        for(int i=k; i<n; i++){
            sumMin += a[s.peekFirst()];
            sumMax += a[g.peekFirst()];

            while(!s.isEmpty() && s.peekFirst() <= i-k){
                s.removeFirst();
            }
            while(!g.isEmpty() && g.peekFirst() <= i-k){
                g.removeFirst();
            }

            while(!s.isEmpty() && a[s.peekLast()] >= a[i]){
                s.removeLast();
            }
            while(!g.isEmpty() && a[g.peekLast()] <= a[i]){
                g.removeLast();
            }

            s.addLast(i);
            g.addLast(i);
        }

        sumMin += a[s.peekFirst()];
        sumMax += a[g.peekFirst()];
//        System.out.println(sumMin + " " + sumMax);
        System.out.println(sumMin + sumMax);
    }
}
 */



/*
Sample Input:-
5 3
1 2 3 4 5

Sample Output:-
18

Explanation:-
For subarray 1 2 3 :- 1 + 3 = 4
For subarray 2 3 4 :- 2 + 4 = 6
For subarray 3 4 5 :- 3 + 5 = 8
total sum = 4+6+8 = 18

Sample Input:-
7 4
2 5 -1 7 -3 -1 -2

Sample Output:-
18
 */