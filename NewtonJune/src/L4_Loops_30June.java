import java.util.*;

/*public class L4_Loops_30June {
    public static void main(String[] args) {
        boolean b = (10 != 100);
        System.out.println(b);
    }
}
 */

//code 2
/*public class L4_Loops_30June {
    public static void main(String[] args) {
        int x = 5;
        if(x%2 == 0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}
 */

//code 3
/*public class L4_Loops_30June {
    public static void main(String[] args) {
        int x = 5;
        if(x<0)
            System.out.println("Negative");
        else if (x>0) {
            System.out.println("Positive");

        } else
            System.out.println("Zero");
    }
}
 */

//code 4
/*public class L4_Loops_30June {
    public static void main(String[] args) {
        char ch = 'z';
        switch(ch) {
            //if(ch == 'L')
            case 'L':
                System.out.println("Light");
                break;
            //else if(ch == 'L')
            case 'T':
                System.out.println("TV");
                break;
            case 'F':
                System.out.println("fan");
                break;
            case 'A':
                System.out.println("AC");
                break;

            //else
            default:
                System.out.println("Such button does not exit!!!");

        }
    }
}
 */

/*
public class L4_Loops_30June {

    public static void main(String[] args) {
        char x = (500 < 100) ? 'A' : 'B';

        if (x == 'B')
            System.out.println("Awesome");

        System.out.println(x);
    }
}
 */

//code 6
public class L4_Loops_30June {

    public static void main(String[] args) {

        // for (int i = 0; i < 20; i++) {
        // System.out.println(i + " =>Black Clover");
        // }

        //int i= 1;
        // while(i<=5){
        //   System.out.println(i + " =>Black Clover");
        // i = i+1;
        // }

        int i = 1;
        do {
            System.out.println(i + " =>Black Clover");
            i = i + 1;
        } while (i <= 5);
    }
}
