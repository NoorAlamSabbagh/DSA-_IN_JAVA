/*
import java.util.*;

public class Pointers_Practice{
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];

        for(i=0; i<n; i++)
            a[i] = sc.nextInt();
        for(i=0; i<m; i++)
            b[i] = sc.nextInt();


        int ans[] = new int[n + m];

         i = 0;
         j = 0;
         k = 0;
        while(i<n && j<m){
            if(a[i] <= b[j]){
                ans[k++] = a[i++];
            }
            else{
                ans[k++] = b[j++];
            }
        }
        while(i<n){
            ans[k++] = a[i++];
        }

        while(j<m){
            ans[k++] = b[j++];
        }

        for(i=0; i<n+m; i++)
            System.out.print(ans[i] + " ");
    }
}

 */

//Code 2 = Minimum absolute difference
/*
import java.util.*;

public class Pointers_Practice{
    public static void main(String[] args) {
        int i = 0;
        int j = 0;


        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        for(i=0; i<n; i++)
            a[i] = sc.nextInt();
        for(i=0; i<n; i++)
            b[i] = sc.nextInt();


        int min = Math.abs(a[0] - b[0]);

        i = 0;
        j = 0;

        while(i<n && j<n){

            int diff =  Math.abs(a[i] - b[j]);
            min = Math.min(min, diff);

            if(a[i] <= b[j]){
                i++;
            }
            else{
                j++;
            }
        }
            System.out.println(min);
    }
}
*/
//
/*import java.util.*;

public class Pointers_Practice{
    public static void main(String[] args) {
        int n = 5;
        long p = 4;
        long[] a = {1,3,2,5,9};

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

 */

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



/*
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long p = sc.nextLong();

        long[] a = new long[n];

        for(int i=0; i<n; i++)
            a[i] = sc.nextLong();

        //int n = 5;
        //long p = 4;
        //long[] a = {1,3,2,5,9};

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
}*/