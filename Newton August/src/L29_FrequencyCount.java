
package main.hashing;

        import java.util.HashMap;
        import java.util.Map;

public class L29_FrequencyCount {

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