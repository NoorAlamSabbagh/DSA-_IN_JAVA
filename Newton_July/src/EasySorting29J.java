import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


public class EasySorting29J{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 5;

        String[] a = new String[n];

        for(int i=0; i<n; i++)
            a[i] = sc.next();

        //All the keys
        for(int i = 1; i<n; i++) {

            String key = a[i];

            //Insertion Logic
            int j = 0;
            for (j = i-1; j >= 0; j--) {

//                if (a[j] > key)
                if(a[j].compareTo(key) > 0)
                    a[j + 1] = a[j];
                else {
                    a[j + 1] = key;
                    break;
                }
            }

            if(j < 0){
                a[j + 1] = key;
            }
        }

        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");


    }
}

// InPut = AS KF ER DD JK
// Output = AS DD ER JK KF