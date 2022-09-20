import java.util.*;

//code 1
/*public class L5_Functions {
    public static int add(int a, int b){
        // Task
        //int c = a+b;
        return a+b;
    }
    public static void main(String[] args) {
        //int z = add(10,50);
        System.out.println(add(10,50));
        System.out.println(add(40,10));
        System.out.println(add(34,50));
        System.out.println(add(88,98));
    }
}
 */

//code 2
/*
public class L5_Functions {
    public static int add(int a, int b){
        // Task
        //int c = a+b;
        return a+b;
    }
    public static int sizeOfClass(){
        return 567;
    }

    public static void message() {
        System.out.println("Welcome To Code with Ravinder!");
    }

    public static void myMessage(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        message();

        //System.out.println("size of the class: " +sizeOfClass());
        //System.out.println(add(50,60));

        myMessage("Asta is Awesome!");

        String str = "Black Clover";
        myMessage(str);

    }
}
 */

//code 3
/*public class L5_Functions1J {

    //Logics inside user defined method
    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(add(x,y));
    }
}
 */
//code 4
/*public class L5_Functions1J {
    public static void main(String[] args) {
        String str = "2335";
        int y = Integer.parseInt(str);

        int x = 2345;
        String s = Integer.toString(x);

        System.out.println("y => " + y);
        System.out.println("s => " + s);
    }
}
 */
//code 5
public class L5_Functions1J {
    public static void main(String[] args) {
        int x = 20;
        //x++

        int y = 20;
        //++y;

        //System.out.println("x => " +   x++);
        //System.out.println("y => " +   ++y);

        //System.out.println();
        //System.out.println();

        //System.out.println("x => " +   x);
        //System.out.println("y => " +   y);


        System.out.println("x => " +   x--);
        System.out.println("y => " +   --y);

        System.out.println();
        System.out.println();

        System.out.println("x => " +   x);
        System.out.println("y => " +   y);
    }
}