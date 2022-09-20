

import java.util.*;public class Apna_L2 {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;
        for (int i=1; i<=n; i++) {
            //inner loop
            for (int j = 1; j <= m; j++) {
                //i=1, j=1,yes
                //j= 1
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        }
    }
