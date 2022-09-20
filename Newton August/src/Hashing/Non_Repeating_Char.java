package Hashing;
import java.util.*;
import java.util.Map;

/*public class Non_Repeating_Char {
    public static void main(String[] args) {

//        Map<Integer, Integer> myMap = new HashMap<>();
//        Map<Integer, Integer> myMap = new LinkedHashMap<>();
        Map<Integer, Integer> myMap = new TreeMap<>();

        myMap.put(1, 10);
        myMap.put(2, 20);
        myMap.put(20, 20);
        myMap.put(15, 150);
        myMap.put(10, 100);
        myMap.put(3, 30);


        for(Map.Entry<Integer, Integer> entry : myMap.entrySet()){
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
    }
}

 */


// I just used frequency count Logic Using HashMap
public class Non_Repeating_Char {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
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

            int i=0;
            for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
                  if(entry.getValue() == 1){
                        System.out.println(i);
                        break;
                  }
                  i++;
            }
            if(i == freq.size())
                  System.out.println(-1);
      }
}