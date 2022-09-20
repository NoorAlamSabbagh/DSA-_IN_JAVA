import java.util.*;
//code 1
/*
public class L15_TimeAndSpaceComplexity14July {
    public static void main(String[] args) {


        int n = 2; //0.1sec

//      x = y;
//      sum =0;

        //0.1 = n sec
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1);//0.1sec
        }
    }
}
 */

//code 2
/*import java.util.*;

public class L15_TimeAndSpaceComplexity14July {
    public static void main(String[] args) {
        int n = 81;

//     3^n
//        for (int i=0; i < Math.pow(3, n); i++) {
//            System.out.println(i+1);

       // log n base 3
        for(int i=n; i>0; i= i/3) {
            System.out.println(i);
        }
    }
}
 */

//code 3
/*
import java.util.*;
public class L15_TimeAndSpaceComplexity14July {
    public static void main(String[] args) {

        int arr[] = {30, 1, 2, 7, 10, 15, 3};
        int n = arr.length;
        int x = 15;

        int ans = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                ans = i;
                break;
            }
        }

        System.out.println("Position: " +ans);
    }
}
 */

//code 4
/*public class L15_TimeAndSpaceComplexity14July {
    public static void main(String[] args) {

        //Algo to print n number

        int n = 10;
       for(int i=0; i<n; i++)//O(n)
        System.out.println(i+1);
    }
}

 */

//code 5
/*public class L15_TimeAndSpaceComplexity14July {
    public static void main(String[] args) {

        //Algo to print n number
        //Time Complexity: n^2
        int n = 5;
        for (int i = 0; i < n; i++) {//O(n)
            for (int j = 0; j < n; j++)//O(n)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}

 */


//code 6
/*public class L15_TimeAndSpaceComplexity14July {
    public static void main(String[] args) {

        //Algo to print n number
        //Time Complexity: 2n+1 = 2n

        int n = 5;

        for (int i = 0; i < n; i++) {//O(n)
            System.out.print(i + " ");

            //O(1)
            System.out.println();

            //O(n)
            for (int j = 0; j < n; j++)
                System.out.print(j + " ");


        }
    }
}

 */

//code 7
/*public class L15_TimeAndSpaceComplexity14July {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 2 bytes  => O(1)

        int[] arr = new int[n]; // 2*n bytes  => O(n)

        //i 2bytes => O(1)
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
    }

            for (int i=0; i<n; i++)
                System.out.print(arr[i] + " ");


        }
    }

 */

//code 8
/*public class L15_TimeAndSpaceComplexity14July {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 2 bytes  => O(1)
        int[] arr = new int[n]; // 2*n bytes  => O(n)

        //i 2bytes => O(1)
        for (int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
        }

        //i 2bytes => O(1)
        int sum = 0;
        for (int i=0; i<n; i++)
            sum += arr[i];

            System.out.print(sum);


    }
}
 */

//code 9
/*public class L15_TimeAndSpaceComplexity14July {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 2 bytes  => O(1)
       // int[] arr = new int[n]; // 2*n bytes  => O(n)

        int sum = 0;
        int x = 0;

        //T => O(n)
        //S => O(1)
        for (int i=0; i<n; i++) {
            x = sc.nextInt();
            sum += x;
        }

        System.out.print(sum);


    }
}

 */

//code 10
public class L15_TimeAndSpaceComplexity14July {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //S => O(n)
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        //S => O(n)
        int output[] = new int[n];

       //t => 2(n^2)
        //
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++){
                if (i != j)
                    prod = prod * arr[j];
        }
        output[i] = prod;
    }
        //T => O(n)
        for(int i=0; i<n; i++)
          System.out.print(output[i] + " ");
    }
}