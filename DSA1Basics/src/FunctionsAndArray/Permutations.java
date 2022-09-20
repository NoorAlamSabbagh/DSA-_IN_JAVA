package FunctionsAndArray;
import java.util.*;

/*public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }

        int nmrfact = 1;
        for (int i = 1; i <= n - r; i++) {
            nmrfact *= i;
        }

        int npr = nfact / nmrfact;
        System.out.println(n + "p" + r + " = " +npr);
    }
}

 */


//code 2 ab isko functions se solve karenge
/*public class Permutations {
    public static int fact(int x){
        int rv = 1;
        for(int i = 1; i<=x; i++){
            rv = rv*i;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = fact(n);
        int nmrfact = fact(n-r);

        int npr = nfact / nmrfact;
        System.out.println(n + "p" + r + " = " +npr);
    }
}

 */


//Code 3
public class Permutations {

    public static void Display(int n, int r, int npr){
        System.out.println(n + "P" + r + " = " + npr);
    }
    public static int fact(int x){
        int rv = 1;
        for(int i = 1; i<=x; i++){
            rv = rv*i;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = fact(n);
        int nmrfact = fact(n-r);

        int npr = nfact / nmrfact;

        Display(n,r,npr);
    }
}