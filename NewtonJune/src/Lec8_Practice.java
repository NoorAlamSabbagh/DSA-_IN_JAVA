import java.util.*;

public class Lec8_Practice {

   /* public static int printAverage(int a, int b, int c){
        int average = (a+b+c)/3;
        return  average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = printAverage(a, b, c);
        System.out.println("Average of three number is : "+ average);

  */
    // 2
  /*
   public static void main(String[] args) {
       int N, i, sum = 0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Number");
       N = sc.nextInt();

       for (i = 0; i <= N; i++) {
           if ((i % 2) == 1) {
               sum += i;
           }
       }
       System.out.print("Sum of all odd numbers between 0 to" + N + " = " + sum);


    }
   */

   // 4
    /*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       System.out.println(Math.max(a,b));
    }

     */
    // 4
   /*
    static double circumference(double r){

       double PI = 3.1415;
       double cir = 2*PI*r;
       return cir;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        double result = Math.PI*2*r;
        System.out.println("Circumference = "+ result);

    }*/

    // 5
    /*
    public static void Num (int age ){
        if (age>18)
        { System.out.println("You are Eligible to vote") ;}

        else  {
            System.out.println("You are not Eligible"); }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int  yourage = sc.nextInt();

        Num(yourage);
    }
    */
/*Write an infinite loop using do while

condition.*/
   /* static void print(String value) {
            do{
                System.out.println(value);}
            while(true);}

    public static void main(String[] args) {
        print("Subham");
    }
*/
}
