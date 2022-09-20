package Recursion_And_Backtracking;
import java.util.*;

public class Lexicographical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=9; i++){
            dfs(i,n);
        }
    }
    public static void dfs(int i, int n){
        //Base Case
        if(i>n){
            return;
        }
        System.out.print(i + " ");

        for(int j=0; j<10; j++){
             dfs(10*i+j, n);
        }
    }
}


//code 2
/*
public class Lexicographical {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        String temp = null;
        // String a[] = new String[n];

//    for(i=0; i<n; i++)
//    {
//     a[i] = sc.next();
//    }
for(i=0; i<n; i++)
{
    for(j = i+1; j<n; j++)
    {
        if(a[i].compareTo(a[j])>0)
        {
            temp = a[i];
            a[i]= a[j];
            a[j] = temp;
        }
    }
}

for(i=0; i<n; i++){
    System.out.print(a[i] );
}

   }

}

 */