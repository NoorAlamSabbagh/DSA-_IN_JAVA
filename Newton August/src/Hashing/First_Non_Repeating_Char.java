
package Hashing;
/*import java.util.LinkedHashMap;
import java.util.Map;

public class First_Non_Repeating_Char {
    public static void main(String[] args) {

        String str = "aababcdefga";
        int n = str.length();
        Map<Character, Integer> freq = new LinkedHashMap();

        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);
            if (!freq.containsKey(ch)) {
                freq.put(ch, 1);
            } else {
                int x = freq.get(ch);
                freq.put(ch, x + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet())
            System.out.println(entry.getKey() + " ===> " + entry.getValue());

            int i=0;
            int nrKey = '#';
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if(entry.getValue() == 1){
                nrKey = entry.getKey();
                break;
            }
            i++;
        }
        if(i == freq.size())
            System.out.println(-1);
        else{
            for(int j=0; j<n; j++){
                if(str.charAt(j) == nrKey){
                    System.out.println(j);
                }
            }
        }

    }
}

 */

//Code 2  Assignment problem

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class First_Non_Repeating_Char  {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //String
        int n = str.length();       //Length

        Map<Character, Integer> freq = new LinkedHashMap();//Building a map to count its frequency

        for(int i=0; i<n; i++){

            char ch = str.charAt(i);
            if(!freq.containsKey(ch)){
                freq.put(ch, 1);
            }
            else{
                int x = freq.get(ch);
                freq.put(ch, x+1);
            }
        }

        int i=0; //after setting my map now I am looking for my first non repeative value
        char nrKey = '#';
        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1){
                nrKey = entry.getKey();
                break;
            }
            i++;
        }

        if(i == freq.size())
            System.out.println(-1);
        else{
            // for(int j=0; j<n; j++){ //Linear search logic to find Indexes
//                if(str.charAt(j) == nrKey){
//                    System.out.println(j);
//                }
//            }
            System.out.println(str.indexOf(nrKey));//java build in feature to find indexes
        }

    }
}

/*
Input
s = "newtonschool"

Output
1

Explanation
"e" is the first non- repeating character in a string
 */


//Code 3 Assignment Problem
//Try to solve using Two pointers to reduce complexity :O(N)
/*
import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int zeroes = 0, ones = 0;

        for(int i=0; i<n; i++){
            int x =sc.nextInt();

            if(x == 0)
                zeroes++;
            else
                ones++;
        }
        for(int i=0; i<zeroes; i++)
            System.out.print(0 + " ");

        for(int i=0; i<ones; i++)
            System.out.print(1 + " ");
    }
}
*/

/*
Input:
5
1 0 1 1 0

Output:
0 0 1 1 1
 */