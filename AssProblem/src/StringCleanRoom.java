import java.util.*;

public class StringCleanRoom {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        String[] str = new String[n];
//
//        for(int i=0; i<n; i++)
//            str[i] = sc.nextLine();

        String[] str = {"0101", "1000", "1111", "0101"};
        int n = str.length;

        int min = n;

        for(int i=0; i<n; i++) {

            int zeros = 0, ones = 0;
            for (int j = 0; j < n; j++) {

                if (str[j].charAt(i) == '0')
                    zeros++;
                else
                    ones++;

            }
                int ans = Math.max(zeros, ones);
                min = Math.min(ans, min);

        }
        System.out.println(min);


    }
}
