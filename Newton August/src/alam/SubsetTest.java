package alam;

//Code 1
/*public class SubsetTest {

    static void powerSet(int a[], int n, int i, int r[]){
        if(i == n){
            for(int j=0; j<n; j++)
                if(r[j] != 0)
                System.out.print(r[j] + " ");
            System.out.println();
            return;
        }
        r[i] =0;
        powerSet(a, n, i+1, r);
        r[i] = a[i];
        powerSet(a, n, i+1, r);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3};

        powerSet(a, a.length, 0, new int[a.length]);
    }
}

 */

//Code 2
/*public class SubsetTest {

    static void powerSet(int a[], int n, int i, int r[]){
        if(i == n){
            for(int j=0; j<n; j++)
                if(r[j] != 0)
                    System.out.print(r[j] + " ");
            System.out.println();
            return;
        }
        r[i] = a[i];//Reverse the order by interchanging condition
        powerSet(a, n, i+1, r);
        r[i] =0;
        powerSet(a, n, i+1, r);
    }

    public static void main(String[] args) {
        int a[] = {1,2,3};

        powerSet(a, a.length, 0, new int[a.length]);
    }
}
 */

//Code 3
/*public class SubsetTest {

    static void powerSet(int a[], int n, int i, int r[]){
        if(i == n){
            for(int j=0; j<n; j++)
                if(r[j] != 0)
                    System.out.print(r[j] + " ");
            System.out.println();
            return;
        }

//        r[i] =0; //Reverse the order by interchanging condition
        powerSet(a, n, i+1, r);
        r[i] = a[i];
        powerSet(a, n, i+1, r);
//        r[i] =0;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3};

        powerSet(a, a.length, 0, new int[a.length]);
    }
}
 */



//code 5
/*
public class SubsetTest {

    static void powerSet(int a[], int n, int i, int r[]){
        if(i == n){
            for(int j=0; j<n; j++)
                if(r[j]!=0)
                    System.out.print(r[j] + " ");
            System.out.println();
            return;
        }

        r[i] = 0;
        powerSet(a, n, i+1, r);
        r[i] = a[i];
        powerSet(a, n, i+1, r);
        r[i] = 0;
    }


    public static void main(String[] args) {
        int a[] = {1, 2, 3};

        powerSet(a, a.length, 0, new int[a.length]);
    }
}

 */


//Code 6

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetTest {

    static List<List<Integer>> result;

    static void distinctPowerSet(int a[], int n, int i, List<Integer> subset){
        if(i == n){
            result.add(new ArrayList<>(subset));
            return ;
        }

        subset.add(a[i]);
        distinctPowerSet(a, n, i+1, subset);

        subset.remove(subset.size()-1);
        while (i < n-1 && a[i] == a[i + 1]) {
            i++;
        }
        distinctPowerSet(a, n, i+1, subset);
    }

    static void powerSet(int a[], int n, int i, List<Integer> subset){
        if(i == n){
            result.add(new ArrayList<>(subset));
            return ;
        }

        powerSet(a, n, i+1, subset);
        subset.add(a[i]);
        powerSet(a, n, i+1, subset);
        subset.remove(subset.size()-1);
    }

    static void powerSet(int a[], int n, int i, int r[]){
        if(i == n){
            for(int j=0; j<n; j++)
                if(r[j]!=0)
                    System.out.print(r[j] + " ");
            System.out.println();
            return;
        }

        r[i] = 0;
        powerSet(a, n, i+1, r);
        r[i] = a[i];
        powerSet(a, n, i+1, r);
        r[i] = 0;
    }


    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2};

        Arrays.sort(a);
        result = new ArrayList<>();
        distinctPowerSet(a, a.length, 0, new ArrayList<>());

        for(List<Integer> list : result){
            for(int x: list){
                System.out.print(x + " ");
            }
            System.out.println();
        }

//        System.out.println(result);
    }
}
