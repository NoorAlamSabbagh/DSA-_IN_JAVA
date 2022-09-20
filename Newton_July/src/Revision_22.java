/*
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class  Revision_22 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int a[] = new int[n];
            int ans[] = new int[n];

            int m = 0;
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();

                if(a[i] < 0)
                    m++;

                a[i] = a[i] * a[i];
            }

            int i = m-1;
            int j = m;
            int k = 0;
            while(i>=0 && j<n){
                if(a[i] < a[j]){
                    ans[k++] = a[i--];
                }
                else{
                    ans[k++] = a[j++];
                }
            }

            while(i>=0){
                ans[k++] = a[i--];
            }
            while(j<n){
                ans[k++]= a[j++];
            }

            for(i=0; i<n; i++)
                System.out.print(ans[i] + " ");
        }
    }
}
*/
//code Ass 2: check if array  is sorted and rotated clockwise