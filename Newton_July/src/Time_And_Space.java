import java.util.*;

public class Time_And_Space {
    public static void main(String[] args) {
    /*
        int arr[] = {30,1,2,7,10,15,3};
    int n = arr.length;
    int x = 15;

    int ans = -1;
    for(int i=0; i<n; i++){
        if(arr[i] == x){
            ans = i;
            break;
        }
    }
        System.out.println("Position: " + ans);

     */

        /*
        int n = 5;

        for(int i=0;i<n; i++){
            for(int j=0;j<n; j++)
                System.out.print(j + " ");
                System.out.println();
        }
        */

        /*
        //Algo to print n numbers

        int n = 5;

         //O(n)
        for(int j=0;j<n; j++)
            System.out.print(j + " ");

        // O(1)
        System.out.println();

        //O(n)
        for(int j=0;j<n; j++)
            System.out.print(j + " ");
        */
        //code 5
/*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //2bytes => O(1)

        int[] arr = new int[n];//2*n bytes => O(n)

        //i 2bytes => O(1)
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //i 2bytes => O(1)
        int sum = 0;
        for(int i = 0; i<n; i++)
            sum += arr[i];

            System.out.print(sum);

 */
        //code 6
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int x = 0;

        for(int i = 0; i<n; i++){
            x = sc.nextInt();
            sum += x;
        }
        System.out.println(sum);
        */

        //code 7
        //S => O(n)
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        //S => O(n)
        int output[] = new int[n];

        //T => O(n^2)
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j)
                    prod = prod * arr[j];
            }
            output[i] = prod;
        }
        for (int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
    }
}
