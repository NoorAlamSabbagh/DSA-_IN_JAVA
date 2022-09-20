import java.util.*;
public class pattern {
    public static void main(String[] args) {

        /*
        //pattern 11 : Solid Rhombus
        int n = 5;

        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }  */

        /*
        // 12: Pyramid Number
        int n = 5;

        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
            */

        /*
        // 13 : Palindromic Pattern
        int n = 5;

        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //1st half
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //2nd half
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

        }
      */
        //14 Diamond
        /*int n = 4;

        //upper half
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower half
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

         */

        //Butterfly
 /*       int n = 5;

        //upper half
        for (int i = 1; i <= n; i++) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower half
        for (int i = n; i >= 1; i--) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}


  */
        int n = 4;

        //upper half
        for (int i = 1; i <= n; i++) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        //Lower half
        for (int i = n; i >= 1; i--) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*
Scanner sc = new Scanner(System.in);
       int rows = 5;
       int cols = 4;
       int[][] numbers = new int[rows][cols];

       //input
       for(int i=0; i<rows; i++){
       for(int j=0; j<cols; j++){
           numbers[i][j] = sc.nextInt();
        }
       }
       //output
       for(int i=0; i<rows; i++){
       for(int j=0; j<cols; j++){
       System.out.print( numbers[i][j]+ " ");
    }
    System.out.println();
}
//input :
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20
 */