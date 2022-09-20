//Code 1
/*package ModularExpo;

public class modularExponentiation {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        int ans = (int)Math.pow(x, y);

        System.out.println(ans);

    }
}

 */

//Code 2
/*package ModularExpo;

public class modularExponentiation {


    static int myPowFun(int x, int y){

        int ans = 1;

      for(int i=0; i<y; i++)
          ans *= x;

      return ans;}

        public static void main(String[] args) {
        int x = 2;
        int y = 3;

        int ans = (int)Math.pow(x, y);

        System.out.println(myPowFun(x,y));

    }
}
 */

//Code 3 : for Time complexity = O(y)
/*

package ModularExpo;

public class modularExponentiation {


    static int myPowFun(int x, int y){

        int ans = 1;

        //for(int i=0; i<y; i++)

//        while(y >0) {
        while(y-->0) {
            ans *= x;
//            y--;
        }
        return ans;}

    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        int ans = (int)Math.pow(x, y);

        System.out.println(myPowFun(x,y));

    }
}

 */

//code 4 :  for time complexity = log(y)
/*package ModularExpo;

public class modularExponentiation {


    static int myPowFun(int x, int y){

        int ans = 1;

        //for(int i=0; i<y; i++)

//        while(y >0) {
        while(y-->0) {
            ans *= x;
//            y--;
        }
        return ans;
    }

    static int mySuperPowFun(int x, int y){

        int ans = 1;

        while(y >0) {

        if(y%2 == 1) {
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

        System.out.println(mySuperPowFun(x,y));

    }
}

 */

//code 5 :  for time complexity = log(y)
//Using Modulo
package ModularExpo;

public class modularExponentiation {


    static int myPowFun(int x, int y){

        int ans = 1;

        //for(int i=0; i<y; i++)

//        while(y >0) {
        while(y-->0) {
            ans *= x;
//            y--;
        }
        return ans;
    }

    static int mySuperPowFun(int x, int y, int m){//using m(modulo) for range

        int ans = 1;

        while(y >0) {

            if(y%2 == 1) {
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
        int m = 1000000000 + 7;//?

        int ans = (int)Math.pow(x, y);

        System.out.println(mySuperPowFun(x, y, m));

    }
}

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
/*package main.modular;

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

 */

