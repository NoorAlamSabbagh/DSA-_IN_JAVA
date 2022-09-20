//code 1
/*package main.hashing;

        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

public class  Hashing_3Aug{

    public static void main(String[] args) {

        Map<Character, String> myMap = new HashMap();

        Scanner sc = new Scanner(System.in);
//        char ch = sc.nextLine().charAt(0);
//        String str = sc.nextLine();

//        myMap.put(ch, str);
        myMap.put('A', "Apple");
        myMap.put('R', "Ravi");
        myMap.put('T', "TV");

//        if(myMap.containsKey('R'))
//            System.out.println(myMap.get('R'));
//
//        if(myMap.containsKey('X'))
//            System.out.println(myMap.get('X'));
//
////        myMap.remove('R');
//        myMap.put('R', "Ravinder");
//        System.out.println(myMap.get(ch));


        for(Map.Entry<Character, String> entry : myMap.entrySet()){
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }

    }

}

 */

//code 2
/*package main.hashing;

import java.util.HashMap;
import java.util.Map;

//Frequency count

public class Hashing_3Aug {

    public static void main(String[] args) {
        int a[] = {2, 6, 2, 7, 6, 6, 10};
        int n = a.length;

        Map<Integer, Integer> freq = new HashMap();

        for(int i=0; i<n; i++){

            if(!freq.containsKey(a[i])){
                freq.put(a[i], 1);
            }
            else{
                int x = freq.get(a[i]);
                freq.put(a[i], x+1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}


 */

package main.hashing;

import java.util.HashMap;
import java.util.Map;

public class L29_Hashing_3Aug {

    public static void main(String[] args) {

        Map<Character, String> myMap = new HashMap();

        //Scanner sc = new Scanner(System.in);
        // char ch = sc.nextLine().charAt(0);
        //String str = sc.nextLine();

        //myMap.put(ch, str);
        myMap.put('A', "Apple");
        myMap.put('R', "Ravi");
        myMap.put('T', "TV");

       //if(myMap.containsKey('R'))
        // System.out.println(myMap.get('R'));

        //if(myMap.containsKey('X'))
        //System.out.println(myMap.get('X'));

        //myMap.remove('R');
        //myMap.put('R', "Ravinder");
        //System.out.println(myMap.get(ch));


        for(Map.Entry<Character, String> entry : myMap.entrySet()){
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
        }

    }


//code 4
/*package main.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class  Hashing_3Aug {

    public static void main(String[] args) {
        int a[] = {2, 5, 10, 6};
        int n = a.length;

        //for (int i = 0; i < n; i++)
        //    System.out.println(a[i] + " ");


        //for each
        //enhance for loop
        for(int e: a)
            System.out.print(e + " ");
    }
}
 */