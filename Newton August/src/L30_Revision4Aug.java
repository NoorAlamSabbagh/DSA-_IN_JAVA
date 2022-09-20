//code 1
/*package main.hashing;
import java.util.*;

import java.util.HashMap;
import java.util.Map;

//Frequency count

public class  L30_Revision4Aug{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        Map<Character, Integer> freq = new LinkedHashMap();

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

        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}

 */

//code 2

// First non-repeating character in a String - Hashing - Post Class

import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class  L30_Revision4Aug{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        Map<Character, Integer> freq = new LinkedHashMap();

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

        int i=0;
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
            // for(int j=0; j<n; j++){
//                if(str.charAt(j) == nrKey){
//                    System.out.println(j);
//                }
//            }
            System.out.println(str.indexOf(nrKey));
        }

    }
}
