package Stack;
import java.util.*;

import java.util.Stack;


//Code 1
/*
public class MinimumSubArraySum {

    //Using this pair I am creating my Stack
    static class Pair{
        int data;
        int count;

        Pair(int data,  int count){
            this.data = data;
            this.count = count;
        }

    }

    public static void main(String[] args) {
        int a[] = {5, 6, 1, 3, 4, 7, 5};
        int n = a.length;

        Stack<Pair> myStack = new Stack<>();
        long L[] = new long[n];
        long R[] = new long[n];


        for(int i=0;i<n;i++){
            int data = a[i];
            int count = 1;

            while (!myStack.isEmpty() && myStack.peek().data >= data) {
                count += myStack.pop().count;
            }

//            Pair p = new Pair(data, count);
            myStack.push(new Pair(data, count));//I have push here all left value
            L[i] = count;
        }

        for(long x : L)
            System.out.print(x + " ");

    }
}
 */






//Code 2
/*
public class MinimumSubArraySum {

    //Using this pair I am creating my Stack
    static class Pair{
        int data;
        int count;

        Pair(int data,  int count){
            this.data = data;
            this.count = count;
        }

    }

    public static void main(String[] args) {
        int a[] = {5, 6, 1, 3, 4, 7, 5};
        int n = a.length;

        Stack<Pair> myStack = new Stack<>();
        long L[] = new long[n];
        long R[] = new long[n];


        for(int i=0;i<n;i++){
            int data = a[i];
            int count = 1;

            while (!myStack.isEmpty() && myStack.peek().data >= data) {
                count += myStack.pop().count;
            }

//            Pair p = new Pair(data, count);
            myStack.push(new Pair(data, count));//I have push here all left value
            L[i] = count;
        }

        for(long x : L)
            System.out.print(x + " ");

        //Right Side
        myStack.clear();//java package to clear stack
        for(int i=n-1;i>=0; i--){
            int data = a[i];
            int count = 1;

            while (!myStack.isEmpty() && myStack.peek().data >= data) {
                count += myStack.pop().count;
            }

//            Pair p = new Pair(data, count);
            myStack.push(new Pair(data, count));//I have push here all left value
            R[i] = count;
        }

        System.out.println();
        for(int x : a)
            System.out.print(x + " ");

        System.out.println();
        for(long x : R)
            System.out.print(x + " ");

    }
}

 */


//Code 3
public class MinimumSubArraySum {

    //Using this pair I am creating my Stack
    static class Pair{
        int data;
        int count;

        Pair(int data,  int count){
            this.data = data;
            this.count = count;
        }

    }

    public static void main(String[] args) {
        int a[] = {5, 6, 1, 3, 4, 7, 5};
        int n = a.length;

        Stack<Pair> myStack = new Stack<>();
        long L[] = new long[n];
        long R[] = new long[n];


        for(int i=0;i<n;i++){
            int data = a[i];
            int count = 1;

            while (!myStack.isEmpty() && myStack.peek().data >= data) {
                count += myStack.pop().count;
            }

//            Pair p = new Pair(data, count);
            myStack.push(new Pair(data, count));//I have push here all left value
            L[i] = count;
        }

        for(long x : L)
            System.out.print(x + " ");

        //Right Side
        myStack.clear();//java package to clear stack
        for(int i=n-1;i>=0; i--){
            int data = a[i];
            int count = 1;

            while (!myStack.isEmpty() && myStack.peek().data >= data) {
                count += myStack.pop().count;
            }

//            Pair p = new Pair(data, count);
            myStack.push(new Pair(data, count));//I have push here all left value
            R[i] = count;
        }

        System.out.println();
        for(int x : a)
            System.out.print(x + " ");

        System.out.println();
        for(long x : R)
            System.out.print(x + " ");

        System.out.println();
        //I just multiply  here
        int sum = 0;
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(a[i] * L[i] * R[i] + " ");
            sum += a[i] * L[i] * R[i];
        }

        System.out.println();
        System.out.println(sum);
    }
}




/*
// Arena question - Subarray minima

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    static class Pair{
        long value;
        long count;

        Pair(long value, long count){
            this.value = value;
            this.count = count;
        }
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        long L[] = new long[n];
        long R[] = new long[n];
        Stack<Pair> myStack = new Stack<>();

        for(int i=0;i<n;i++){
            long value = a[i];
            long count = 1;

            while (!myStack.isEmpty() && myStack.peek().value >= value) {
                count += myStack.pop().count;
            }

            Pair p = new Pair(value, count);
            myStack.push(p);
            L[i] = count;
        }

//        for(int x : L)
//            System.out.print(x + " ");


        //Right Side
        myStack.clear();
        for(int i=n-1;i>=0;i--){
            long value = a[i];
            long count = 1;

            while (!myStack.isEmpty() && myStack.peek().value >= value) {
                count += myStack.pop().count;
            }

            Pair p = new Pair(value, count);
            myStack.push(p);
            R[i] = count;
        }

//        System.out.println();
//        for(int x : R)
//            System.out.print(x + " ");

        long ans = 0;
        for(int i=0; i<n; i++){
            ans += a[i] * L[i] * R[i];
        }

        System.out.println(ans);
    }
}


 */

/*
Sample Input
3
1 2 3

Sample Output
10

Explaination
all subarrays [1] [1,2] [1,2,3] [2] [2,3] [3]
Sum of minimums : 1 + 1 + 1 + 2 + 2 + 3 = 10
 */