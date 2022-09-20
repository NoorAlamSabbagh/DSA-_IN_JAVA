package Hashing;

//Print all SubArrays
/*
public class Subarrays {
    public static void main(String[] args) {
        int a[] = {2, 7, 10, 15};
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                for (int k = i; k < i + j + 1; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

 */


//Print sum of all SubArrays
/*public class Subarrays {
    public static void main(String[] args) {
        int a[] = {2, 7, 10, 15};
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int sum = 0;
                for (int k = i; k < i + j + 1; k++) {
                    System.out.print(a[k] + " ");
                    sum += a[k];
                }
                System.out.print(" ===> " + sum);
                System.out.println();
            }
        }
    }
}
 */


//
public class Subarrays {
    public static void main(String[] args) {
        int a[] = {-5, 8, -14, 2, 4, 12};
        int n = a.length;
        int reqSum = -5;

        int maxLength  = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int sum = 0;
                for (int k = i; k < i + j + 1; k++) {
                    System.out.print(a[k] + " ");
                    sum += a[k];
                }
                if(sum == reqSum && j+1 >maxLength)
                    maxLength = j+1;
                System.out.print(" ===> " + sum);
                System.out.println();
            }
        }
        System.out.println(maxLength);
    }
}