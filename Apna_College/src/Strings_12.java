/*import java.util.*;

public class Strings_12 {
    public static void main(String[] args) {
        // concatenation
        String firstName = "Noor";
        String lastName = "Alam";
        String fullName = firstName + "@" + lastName;
        // Noor@Alam
        System.out.println(fullName.length());

        //CharAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}

 */

//code2
/*
import java.util.*;


public class Strings_12 {
    public static void main(String[] args) {
        // compare
        String name1 = "Noor";
        String name2 = "Noor";

        //1 s1>s2: +ve value
        //2 s1==s2: 0
        //3 s1>s2: -ve value

        //hello wello

//        if(name1.compareTo(name2) == 0){
//            System.out.println("Strings are equal");
//        }else{
//            System.out.println("Strings are not equal");
//        }

//        if(name1 == name2){
//            System.out.println("Strings are equal");
//        }else{
//            System.out.println("Strings are not equal");
//        }
        if(new String("Tony") == new String("Tony")){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}


 */

// Code3

import java.util.*;


public class Strings_12 {
    public static void main(String[] args) {
        //Compare
        String sentence = "TonyStark";
        String name = sentence.substring(4);
        System.out.println(name);
    }
}

