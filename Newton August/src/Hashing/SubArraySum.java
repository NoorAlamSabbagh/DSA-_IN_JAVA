package Hashing;

/*public class SubArraySum {
    public static void main(String[] args) {
        int a[] = {-5, 8, -14, 2, 4, 12};
//        int a[] = {2, 7, 10, 15};
        int n = a.length;
        int reqSum = -5;

        int maxLength  = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
//                System.out.println(sum);

                if(sum == reqSum && j-i+1 > maxLength)
                    maxLength = j-i+1;
            }
        }
                System.out.println(maxLength);
    }
}

 */


import java.util.HashMap;

//Using HashMap
import java.util.*;
public class SubArraySum {
    public static void main(String[] args) {
        int a[] = {-5, 8, -14, 2, 4, 12};
//        int a[] = {2, 7, 10, 15};
        int n = a.length;
        int k = -5;

        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += a[i];

            if (sum == k)
                maxLength = i + 1;

            if (myMap.containsKey((sum - k))) {
                int pos = myMap.get(sum - k);
                int len = i - pos;
                maxLength = Math.max(maxLength, len);

            }
            if (!myMap.containsKey(sum))
                myMap.put(sum, i);
        }
        System.out.println(maxLength);
    }
}

