package main.hashing;
import java.util.*;

public class MyTestMap {
    public static void main(String[] args) {

        Map<Integer,Integer> myMap = new HashMap<>();
        //Map<Integer,Map<Integer,Integer>> myMap = new TreeMap<>();

        myMap.put(1, 10);
        myMap.put(2, 20);
        myMap.put(20, 20);
        myMap.put(15, 150);
        myMap.put(10, 100);
        myMap.put(3, 300);

        for(Map.Entry<Integer,Integer>entry: myMap.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }
}
