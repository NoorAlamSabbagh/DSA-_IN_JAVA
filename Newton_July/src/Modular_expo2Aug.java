/*package main.modular;

public class Modular_expo2Aug {

    static int myPowFun(int x, int y){

        int ans = 1;

//        for(int i=0; i<y; i++)

        while(y-- > 0) {
            ans *= x;
//            y--;
        }

        return ans;
    }

    public static void main(String[] args) {

        int x = 2;
        int y = 3;

        int ans = (int)Math.pow(x, y);

        System.out.println(myPowFun(x, y));
    }
}

 */

// code 2
/*
package main.modular;

public class Modular_expo2Aug  {

    static int myPowFun(int x, int y){

        int ans = 1;

//        for(int i=0; i<y; i++)

        while(y-- > 0) {
            ans *= x;
//            y--;
        }

        return ans;
    }

    static int mySuperPowFun(int x, int y){

        int ans = 1;

        while(y > 0) {

            if(y%2 == 1){
                ans = ans * x;
            }

            x = x*x;
            y = y/2;

        }

        return ans;
    }

    public static void main(String[] args) {

        int x = 2;
        int y = 7;

        int ans = (int)Math.pow(x, y);

        System.out.println(mySuperPowFun(x, y));
    }
}

 */

//Code 3 Using Modulo Operator
package main.modular;

    public class Modular_expo2Aug  {

        static int myPowFun(int x, int y){

            int ans = 1;

//        for(int i=0; i<y; i++)

            while(y-- > 0) {
                ans *= x;
//            y--;
            }

            return ans;
        }

        static int mySuperPowFun(int x, int y, int m){

            int ans = 1;

            while(y > 0) {

                if(y%2 == 1){
                    ans = (ans * x) % m;
                }

                x = (x*x) % m;
                y = y/2;

            }

            return ans % m;
        }

        public static void main(String[] args) {

            int x = 2;
            int y = 4;
            int m = 10000000 + 7;

            int ans = (int)Math.pow(x, y);

            System.out.println(mySuperPowFun(x, y, m));
        }
    }

