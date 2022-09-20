package Sortings;

public class EasySorting {
    public static void main(String[] args) {
       // int a[] = {3,5,8,6,4};
        String[] a = {"AS", "KF", "ER", "DD", "JK"};
        int n = a.length;


        //All the keys
        for(int i=1; i<n; i++) {
            String key = a[i];

            //Insertion Logic
            int j = 0;
            for (j=i-1; j >= 0; j--) {


//                if (a[j] > key)
                if(a[j].compareTo(key)>0)//method to compare string see lec of string comparison
                    a[j + 1] = a[j];
                else {
                    a[j + 1] = key;
                    break;
                }
            }
            if(j<0){
                a[j + 1] = key;
            }
        }
        for(int i=0; i<n;i++)
            System.out.print(a[i] + " ");
    }
}
