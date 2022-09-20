/*import java.util.*;

public class L7_1D_Array4July {
    public static int table(int n) {
        if(n<=0)
            return 0;

        System.out.println("Table of " + n + " is: ");

        int i = 0;
        do {
            System.out.println(n + " * " + i + " = " + n * i);
            i++;
        } while (i <= 10);

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = table(x);
        if(result == 1)
        {
            System.out.println("Table printed Successfully!");
        }
        else{
            System.out.println("Error: Please give Positive value!");
        }
    }
}
 */
import java.util.*;

public class L7_1D_Array4July {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        for(int i=0; i<n; i++)
            System.out.println(arr[i]);

        System.out.println("Size of Array is => " +arr.length);
    }
}