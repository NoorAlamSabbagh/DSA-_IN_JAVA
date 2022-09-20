package DoubtSession;

/*public class Recurssion {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
  public static void print(int n){
        //base case
        if(n<1){
            return;
        }

        //work
        System.out.println(n);

        //faith
        print(n-1);

        //work
        return;

    }
}


 */


//Code 2
/*
public class Recurssion {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n){
        //base case
        if(n<1){
            return;
        }

        //faith
        print(n-1);

        //work
        System.out.println(n);

        //work
        //return;

    }
}

 */

//Code 3
public class Recurssion {
    public static void main(String[] args) {
        int n = 5;
        //print(n);
        int answer = fact(5);
        System.out.println(answer);
    }

    public static int fact(int n){
        //base case
        if(n==0){
            return 1;
        }

        //faith
        int fn1 = fact(n-1);

        //Work
        int myFact = n*fn1;

        return  myFact;

    }
}