/*
public class Recursion {

    public static void printNumb(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumb(n);
    }
}
*/

//code 2
/*public class Recursion {
    public static void printNumb(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNumb(n);
    }
}
 */

//code 3
/*
public class Recursion {
    public static void printSum(int i, int n, int sum){
    if(i==n) {
        sum += i;
        System.out.println(sum);
        return;
    }
      sum += i;
    printSum(i+1, n, sum);
        //System.out.println(i);
        }

    public static void main(String[] args) {
        printSum(1,5,0);
       }
    }
*/

// code 4
/*public class Recursion {
    public static void printSum(int i, int n, int sum){
    if(i==n) {
        sum += i;
        System.out.println(sum);
        return;
    }
      sum += i;
    printSum(i+1, n, sum);
        //System.out.println(i);
        }

    public static void main(String[] args) {
        printSum(1,5,0);
       }
    }

 */

// code 5
public class Recursion {
    public static void printfib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfib(b, c, n - 1);
    }

    public static void main(String args[]) {
        int a =0, b = 1;
        System.out.println(a);

        int n = 7;
        printfib(a,b,n-2);
    }
}