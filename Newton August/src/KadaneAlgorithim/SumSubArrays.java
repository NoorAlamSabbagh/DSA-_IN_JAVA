package KadaneAlgorithim;

import java.util.HashMap;
import java.util.Map;

public class SumSubArrays {
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

