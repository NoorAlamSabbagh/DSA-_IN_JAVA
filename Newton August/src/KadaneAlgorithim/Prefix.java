package KadaneAlgorithim;
   /*
    public class Prefix {
        public static void main(String[] args) {
//            int a[] = {2, 7, 10, 15};
            int a[] = {1, 3, 5};
            int n = a.length;

            for (int i=0; i<n; i++) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum = sum + a[j];
                    System.out.println(sum);

                }
            }
        }
}
    */

public class Prefix {
    public static void main(String[] args) {
//            int a[] = {2, 7, 10, 15};
        int a[] = {1, 3, 5};
        int n = a.length;

        int countOdd = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + a[j];

                if(sum%2 == 1){
                    countOdd++;
                }
//                System.out.println(sum);

            }
        }
        System.out.println(countOdd);
    }
}



/*
public class Prefix {
    public static void main(String[] args) {
        int a[] = {2, 5, 10, 6, 40};
        int n = a.length;

        int prefixSum[] = new int[n];

        prefixSum[0]= a[0];
        for(int i=1; i<n; i++)
            prefixSum[i] = prefixSum[i-1] + a[i];

        for(int i=0; i<n; i++)
            System.out.print(prefixSum[i] + " ");

    }
}

 */

//Code 2
/*
public class Prefix {
    public static void main(String[] args) {
        int a[] = {1, 3, 5};
        int n = a.length;

        int countOdd = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + a[j];

                if (sum % 2 == 1) {
                    countOdd++;
                }
                System.out.println(sum);

            }
        }
        System.out.print(countOdd);
    }
}
*/