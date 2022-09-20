//code 1
 /*
 public class L9_Maths8July   {
    public static void main(String[] args) {
        int n = 8, m = 12;
        int i = 1;
        while(true){
            if(i%n == 0 && i%m == 0){
                break;
            }
            i++;
        }
        System.out.println("LCM of " + n + " & " + m + " is: "  +(i));
    }

}
  */

import java.util.*;

public class L9_Maths8July {
    public static int euclidHCF(int n, int m) {

        while(n!=m){
            if(n>m)
                n = n-m;
            else
                m = m-n;
            }
        return m;
    }
    public static int LCM(int n, int m) {
        int i = 1;
        while(true) {
            if (i % n == 0 && i % m == 0) {
                break;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int n = 7, m = 9;

        System.out.println("HCF of " + n + " & " + m + " is: " + euclidHCF(n, m));
        int h = euclidHCF(n,m);

        System.out.println("HCF of " + n + " & " + m + " is: " + (n*m)/h);
        //System.out.println("LCM of " + n + " & " + m + " is: " + LCM(n, m));

    }
}