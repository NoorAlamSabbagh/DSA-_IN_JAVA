package Queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Equalizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayDeque<Integer> a = new ArrayDeque<>();
        ArrayDeque<Integer> b = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();//I just take single integer from input like 1 and store in Queue
            a.addLast(sc.nextInt());
        }

        for (int i = 0; i < n - 1; i++)
            b.addLast(sc.nextInt());

        while (!a.isEmpty() && !b.isEmpty()) {
            if (a.peekFirst() == b.peekFirst()) {
                a.removeFirst();
                b.removeFirst();
            } else {
                break;
            }
        }


        while (!a.isEmpty() && !b.isEmpty()) {
            if (a.peekLast() == b.peekLast()) {
                a.removeLast();
                b.removeLast();
            } else {
                break;
            }
        }

        if (a.size() == 1 && b.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


//Code 2 By sir with some modification
/*import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayDeque<Integer> a = new ArrayDeque<>();
        ArrayDeque<Integer> b = new ArrayDeque<>();

        for(int i=0; i<n; i++)
        {
//            int x = sc.nextInt();
            a.addLast(sc.nextInt());
        }

        for(int i=0; i<n-1; i++)
            b.addLast(sc.nextInt());

        while( !b.isEmpty()){
            if(a.peekFirst() == b.peekFirst()){
                a.removeFirst();
                b.removeFirst();
            }
            else if(a.peekLast() == b.peekLast()){
                a.removeLast();
                b.removeLast();
            }
            else{
                break;
            }
        }

        // while(!a.isEmpty() && !b.isEmpty()){
        //     if(a.peekLast() == b.peekLast()){
        //         a.removeLast();
        //         b.removeLast();
        //     }
        //     else{
        //         break;
        //     }
        // }


        if(a.size() == 1){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}


 */