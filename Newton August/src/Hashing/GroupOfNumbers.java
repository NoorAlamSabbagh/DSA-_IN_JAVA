package Hashing;//Assignment Problem
//package Hashing;
// Group of Numbers - Hashing - Post Class

import java.io.*; // for handling input/output
//import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
/*public class GroupOfNumbers{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        Map<Integer, Integer> freq = new HashMap();

        for(int i=0; i<n; i++){

            a[i] = sc.nextInt();

            if(!freq.containsKey(a[i])){
                freq.put(a[i], 1);
            }
            else{
                int x = freq.get(a[i]);
                freq.put(a[i], x+1);
            }
        }

        //        //Freq Map
        //        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
        //            System.out.println(entry.getKey() + " -> " + entry.getValue());
        //        }


        Map<Integer, Set<Integer>> revFreq = new TreeMap<>(Collections.reverseOrder());

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(!revFreq.containsKey(value)){
                Set<Integer> mySet = new TreeSet<>(Collections.reverseOrder());
                mySet.add(key);

                revFreq.put(value, mySet);
            }
            else{
                Set<Integer> mySet = revFreq.get(value);
                mySet.add(key);

                revFreq.put(value, mySet);
            }
        }

        //        //RevFreq Map
        //        for(Map.Entry<Integer, Set<Integer>> entry : revFreq.entrySet()){
        //            System.out.println(entry.getKey() + " -> " + entry.getValue());
        //        }

        //Final Output
        for(Map.Entry<Integer, Set<Integer>> entry : revFreq.entrySet()){
            Set<Integer> mySet = entry.getValue();
            for(int x: mySet)
                System.out.print(x + " ");
        }

    }
}

 */

//Practice
//package Hashing;
//import java.util.*;
/*public class GroupOfNumbers {
    public static void main(String[] args) {
        int a[] = {2, 3, 2, 3, 3, 1, 1, 4, 8};
        int n = a.length;

        //I use frequency count whole logic
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

        //frequency Map
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //here I am just traversing
        Map<Integer, Set<Integer>> revFreq = new TreeMap<>();

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) { //traverse
            int key = entry.getKey(); //for key
            int value = entry.getValue(); //for set value


            //copy same frequency count logic
            if(!revFreq.containsKey(value)){
               Set<Integer> mySet = new TreeSet<>();
               mySet.add(key);

               revFreq.put(value, mySet);
            }
            else{
                Set<Integer> mySet = revFreq.get(value);
                mySet.add(key);

                revFreq.put(value, mySet);
            }
        }

        //RevFreq Map
        for(Map.Entry<Integer, Set<Integer>> entry : revFreq.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
 */

/*
Output:
1 -> 2
2 -> 2
3 -> 3
4 -> 1
8 -> 1
1 -> [4, 8]
2 -> [1, 2]
3 -> [3]
 */

import java.util.*;


public class GroupOfNumbers {
    public static void main(String[] args) {
        int a[] = {2, 3, 2, 3, 3, 1, 1, 4, 8};
        int n = a.length;

        //I use frequency count whole logic
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

        //frequency Map
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //here I am just traversing
        Map<Integer, Set<Integer>> revFreq = new TreeMap<>(Collections.reverseOrder());//Collections.reverseOrder()

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) { //traverse
            int key = entry.getKey(); //for key
            int value = entry.getValue(); //for set value


            //copy same frequency count logic
            if(!revFreq.containsKey(value)){
                Set<Integer> mySet = new TreeSet<>(Collections.reverseOrder());
                mySet.add(key);

                revFreq.put(value, mySet);
            }
            else{
                Set<Integer> mySet = revFreq.get(value);
                mySet.add(key);

                revFreq.put(value, mySet);
            }
        }

        //RevFreq Map
        for(Map.Entry<Integer, Set<Integer>> entry : revFreq.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //Final Output
        for(Map.Entry<Integer, Set<Integer>> entry : revFreq.entrySet()){
            Set<Integer> mySet = entry.getValue();
            for(int x: mySet)
                System.out.print(x + " ");
        }
    }
}