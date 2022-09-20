package Arrays;
import java.util.*;
import java.io.*;
import java.lang.*;

/*public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            System.out.println(reverse(str));
        }
    }
    static String reverse(String str){
        int n = str.length();
        if(n==0)
            return "";
            return(str.charAt(n-1) + reverse(str.substring(0,n-1)));
        }
}


 */

//code 2
public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t-->0)
        {
            String str = s.nextLine();
            System.out.println(reverse(str));
        }
    }

    static String reverse(String str) {
        int n = str.length();
        if (n == 0)
            return "";
        int l = 0, r = n - 1;
        char[] ch = str.toCharArray();
        while (l < r) {
            char c = ch[l];
            ch[l] = ch[r];
            ch[r] = c;
            l++;
            r--;
        }
        return new String(ch);
    }
}

