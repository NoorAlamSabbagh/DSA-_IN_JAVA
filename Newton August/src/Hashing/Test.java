package Hashing;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/*
public class Test {
    public static void main(String[] args) {

        int a[] = {2, 5, 10, 6};
        int n = a.length;

//        for(int i=0; i<n; i++)
//            System.out.println(a[i]);

        //for each
        //enhanced for loop
        for(int x : a)
        System.out.print(x + " ");
    }
}
*/


//Code 2
/*
public class Test {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(100);
        myList.add(14);
        myList.add(1);

        System.out.println(myList);
        for(int x : myList)
            System.out.println(x);
    }
}

 */

//code 4
/*import java.util.Set;
import java.util.TreeSet;
public class Test {
    public static void main(String[] args) {

//        List<Integer> myList = new ArrayList<>();
//        Set<Integer>myList = new HashSet<>();//Stored only unique value
        Set<Integer>myList = new TreeSet<>();//Stored only unique  value in sorted array
        myList.add(10);
        myList.add(100);
        myList.add(14);
        myList.add(1);
        myList.add(100);
        myList.add(100);

        System.out.println(myList);


    }
}

 */

//Code 5
import java.util.Set;
import java.util.TreeSet;
public class Test {
    public static void main(String[] args) {

//        Set<Integer>myList = new TreeSet<>();
        Set<Integer>myList = new TreeSet<>();
        myList.add(10);
        myList.add(100);
        myList.add(14);
        myList.add(1);
        myList.add(100);
        myList.add(100);

        System.out.println(myList);


    }
}
