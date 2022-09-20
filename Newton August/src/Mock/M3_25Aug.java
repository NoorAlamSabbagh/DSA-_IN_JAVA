package Mock;
import java.util.Arrays;
/*public class M3_25Aug {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        for (int i = 0; i < n; i++)
//            arr[i] = new.nextInt();

        Arrays.sort(arr);
        for (int i = 1; i < n; i += 2) {
            System.out.print(arr[i] + " " + arr[i - 1] + " ");
        }
        if (n % 2 == 1) {
            System.out.println(arr[n - 1]);
        }
    }
}

 */


//code 2
public class M3_25Aug {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        for (int i = 0; i < n; i++)
//            arr[i] = new.nextInt();

            Arrays.sort(arr);
        if (n % 2 == 1) {
            System.out.print(arr[n - 1] + " ");
        }
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i] + " " );
        }

    }
}




//problem 1
/*
Cyclically rotate an array by one

{1, 2, 3, 4, 5}

5 1 2 3 4
 */

/*
arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

{1,2,3,4,5}

2 1 4 3 5
 */