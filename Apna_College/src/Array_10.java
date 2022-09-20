/*
import java.util.*;


public class Array_10 {
    public static void main(String[] args) {
        // int marks[] = new int[3];
        int[] marks = {97,98,95};
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 95;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        for(int i=0; i<3; i++)
            System.out.println(marks[i]);
    }
}


 */

// code 2
/*import java.util.*;

public class Array_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++){
             numbers[i] = sc.nextInt();
        }

        //output
        for(int i=0; i<size; i++)
            System.out.println(numbers[i]);
    }
}

 */

//code 3
/*import java.util.*;

public class Array_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //output
        for(int i=0; i< numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index: " +i);
            }
        }

    }

}

 */

// code 4
import java.util.*;

public class Array_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        //input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //output
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

                System.out.println("Size of Array is =>" + arr.length);
            }
        }

    }