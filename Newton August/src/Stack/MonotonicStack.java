package Stack;
import java.util.*;

/*public class MonotonicStack {
    static void nextSmall(int a[], int n){
        Stack<Integer> myStack = new Stack<>();
        for(int i=0; i<n; i++){

            int x = a[i];
            if(myStack.isEmpty() || myStack.peek() < x){
                myStack.push(x);
            }
            else{
                while(!myStack.isEmpty() && myStack.peek() >=x){
                    System.out.println(myStack.pop() + "-->" +x);
                }
                myStack.push(x);
            }
        }
        while(!myStack.isEmpty()){
            System.out.println(myStack.pop() + "-->" + -1);
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 6, 1, 3, 4, 7, 5};
        int n = a.length;
        nextSmall(a, n);
    }
}

 */


//Code 2 : Just optimize above code
/*public class MonotonicStack {
    static void nextSmall(int a[], int n) {
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < n; i++){

            int x = a[i];
            while(!myStack.isEmpty() && myStack.peek() >=x){
                System.out.println(myStack.pop() + "-->" +x);
            }
        myStack.push(x);
    }

            while(!myStack.isEmpty()){
                System.out.println(myStack.pop() + "-->" + -1);
            }
    }

    public static void main(String[] args) {
        int a[] = {5, 6, 1, 3, 4, 7, 5};
        int n = a.length;
        nextSmall(a, n);
    }
}

 */

//Code 3
public class MonotonicStack {
    static class Pair{
        int value;
        int index;

        Pair(int value, int index){
            this.value = value;
            this.index = index;
        }
    }

    static void nextSmallOrder(int a[], int n){
        Stack<Pair> myStack = new Stack<>();
        int res[] = new int[n];
        for (int i = 0; i < n; i++){
            int value = a[i];
            int index = i;

            while(!myStack.isEmpty() && myStack.peek().value >=value){
//                System.out.println(myStack.pop() + "-->" +x);
                res[myStack.pop().index] = value;
            }

//            Pair p = new Pair(value, index);
            myStack.push(new Pair(value, index));
        }

        for (int i = 0; i < n; i++){
            System.out.println(a[i] + " --> " + res[i]);

        }
    }

    static void nextSmall(int a[], int n) {
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < n; i++){

            int x = a[i];
            while(!myStack.isEmpty() && myStack.peek() >=x){
                System.out.println(myStack.pop() + "-->" +x);
            }
            myStack.push(x);
        }

        while(!myStack.isEmpty()){
            System.out.println(myStack.pop() + "-->" + -1);
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 6, 1, 3, 4, 7, 5};
        int n = a.length;
        nextSmallOrder(a, n);
    }
}