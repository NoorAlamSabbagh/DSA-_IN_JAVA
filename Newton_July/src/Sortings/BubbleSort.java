package Sortings;
import java.util.*;

public class BubbleSort{
    public static void main(String[] args) {
        int a[] = {3,5,8,6,4};
        int n = a.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){

                if(a[j] > a[j+1]){
                    //swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
    }
}