package alam;

public class SplitFunction {
    public static void main(String[] args) {
        String str = "ravi, alam, nihal, mohan";
        String[] myList = str.split(", ");

        for(int i=0; i< myList.length; i++)
            System.out.println(myList[i]);

    }
}
