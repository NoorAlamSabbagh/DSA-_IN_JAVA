package Hashing;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

/*
public class MyTestMap {
    public static void main(String[] args) {

        Map<Character, String> myMap = new HashMap();
//
//        Scanner sc = new Scanner(System.in);
//        char ch = sc.nextLine().charAt(0);
//        String str = sc.nextLine();
//
//        myMap.put(ch, str);
        myMap.put('A', "Apple");
        myMap.put('R', "Ravi");
        myMap.put('T', "TV");

//        if (myMap.containsKey('R'))
//            System.out.println(myMap.get('R'));
//
//        if (myMap.containsKey('X'))
//            System.out.println(myMap.get('X'));

//        myMap.remove('R');
//        myMap.put('R', "Ravinder");
//        System.out.println(myMap.get(ch));

        for (Map.Entry<Character, String> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
    }
}

 */

//Code 2
public class MyTestMap {
    public static void main(String[] args) {

        Map<Integer, Integer> myMap = new HashMap();


        myMap.put(1,10);
        myMap.put(2,20);
        myMap.put(20,20);
        myMap.put(15,150);
        myMap.put(3,300);



        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
//        System.out.println(sizeOfHashMap);
    }
}