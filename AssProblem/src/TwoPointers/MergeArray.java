package TwoPointers;
import java.util.*;

class Main {
    public static void main (String[] args) {
        int i=0;
        int j=0;
        int k=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];

        for(i=0; i<n; i++)
            a[i] = sc.nextInt();

        for(i=0; i<m; i++)
            b[i] = sc.nextInt();

        int ans[] = new int[n+m];

        i=0;
        j=0;
        k=0;
        while(i<n && j<m){
            if(a[i] < b[j]){
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
/*3 4
1 4 7
1 3 3 9

Sample Output:-
1 1 3 3 4 7 9

 */