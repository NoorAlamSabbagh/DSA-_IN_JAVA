//code 1
/*package main;

public class L14_String13July {
    public static void main(String[] args) {


          char[] ch = {'R','T', '4', '@'};
          char temp = ch[1];
//          int m = ch.length;
//        System.out.println(ch);
//        ch[2] = 'x';
//        System.out.print(ch);

        String str = "RAVI";
        int n = str.length();
        System.out.println(str);
        str = "RAVINDER";
        System.out.println(str);
        System.out.println(str.length());

        //str.charAt(5) = 't';
        char y = str.charAt(5);
        System.out.println(str.charAt(3));
    }
}
 */

//code2
/*package main;

public class L14_String13July{
    public static void main(String[] args) {

        char ch = 'x';
        int x = ch, y = 0;

        System.out.println(x);
        System.out.println(y);

    }
}
 */

//code 3
/*package main;

public class L14_String13July{
    public static void main(String[] args) {

        int x = 45;
        x++;

        char ch = 'A';
        int t = ch;
        ch = (char)(73);


        System.out.println(ch);

    }
}
 */

//code 4
/*package main;

public class L14_String13July{
    public static void main(String[] args) {

        char x = 'c';
        int index = x -'A';

        char y = 'd';
        int indexY = y -97;
        System.out.println(indexY);

    }
}
 */

//code 5
/*package main;

import java.util.Locale;

public class L14_String13July{
    public static void main(String[] args) {

        String str = "RaVIndEr";
        //String x = str.concat("CHAUHAN");
        //String x = str + "CHAUHAN";
        //String x = str.toLowerCase();

        //System.out.println(str.length());
        //System.out.println(str);
        //System.out.println(x);

        if(str.contains("VIn")){
            System.out.println("present");
        }
        else{
            System.out.println(" Not present");
        }

        //System.out.println(str.indexOf("VIn"));
        System.out.println(str.substring(3, 5));
    }
}

 */

//code6
/*package main;

import java.util.Locale;

public class L14_String13July {
    public static void main(String[] args) {
        //String x = "ABC";
        //String y = "ABC";
        String y = new String("ABC");

        String x=y;

        //System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}
 */

//code 7
/*package main;

import java.util.Locale;

public class L14_String13July {
    public static void main(String[] args) {
        String x = "AAAGCDE";
        //String y = "ABC";
        String y = new String("AAACFG");

        //String x = y;

        System.out.println(x.compareTo(y));
    }
}

 */

//code 8
/*package main;

import java.util.Scanner;

public class L14_String13July {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // String x  = sc.nextLine();
        // String y = sc.nextLine();
        //char[] ch = x.toCharArray();

        //char[] y = sc.nextLine().toCharArray();

        //System.out.println(x.compareTo(y));

        char z = sc.nextLine().charAt(0);
        System.out.println(z);
    }
}

 */

//code 8
//code9
/*package main;

import java.util.Scanner;

public class L14_String13July {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // String x  = sc.nextLine();
        String x  = sc.next();



        System.out.println(x);
    }
}

 */


//code 10
import java.util.Scanner;

        public class L14_String13July {
            public static void main(String[] args) {

                String str = "032145";

                int x = str.charAt(0) - '0';

                System.out.println(x);
            }
        }
