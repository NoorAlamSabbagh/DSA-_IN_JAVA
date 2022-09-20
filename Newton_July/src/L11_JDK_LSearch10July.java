import java.util.*;
public class L11_JDK_LSearch10July {
    public static void main(String[] args) {
        int arr[] ={700, 8, 1, 9, 21, 5} ;
        int n = arr.length;

        int maxValue = arr[0];
        int minValue = arr[0];

                for (int m=0; m<n; m++)
                if (arr[m] > maxValue){
                        maxValue = arr[m];
                }
                else if (arr[m] < minValue){
                  minValue = arr[m];
        }
                System.out.println(maxValue);
                System.out.println(minValue);
    }
}
