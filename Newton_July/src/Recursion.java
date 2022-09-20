package main;

public class Recursion {

    public static void fun(int i){

        if(i==5)
        return;

        fun(i+1);
        System.out.println(i + "fun!!");

    }
    public static void printDigits(int n) {

        while (n > 0) {
            int r = n % 10;
            System.out.println(r);
            n = n / 10;
        }
    }
    public static void main(String[] args) {

        int n = 1024;
        printDigits(n);
    }

}
