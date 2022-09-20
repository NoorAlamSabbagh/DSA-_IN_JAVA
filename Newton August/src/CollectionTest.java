import java.util.*;


//Code
/*
public class CollectionTest {
    public static void main(String[] args) {
//        ArrayList<Integer> myList = new ArrayList<>();
//          List<Integer> myList = new ArrayList<>();
          List<Integer> myList = new LinkedList<>();


        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

        System.out.println(myList);
    }
}

 */


//Code 2
/*public class CollectionTest {
    public static void main(String[] args) {
        Stack<Integer> myList = new Stack<Integer>();


        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

        System.out.println(myList);

        System.out.println(myList.peek());

    }
}

 */

//Code 3

/*public class CollectionTest {
    public static void main(String[] args) {
        Stack<String> myList = new Stack();


//        myList.add("ABCS");
//        myList.add("asfas");
//        myList.add("RAVI");
//        myList.add("40");

        System.out.println(myList);

//        System.out.println(myList.push("Z"));
//        System.out.println(myList.pop());
        System.out.println(myList.isEmpty());



    }
}

 */

//Code 4

/*public class CollectionTest {
    public static void main(String[] args) {
        ArrayDeque<Integer> myDQ = new ArrayDeque<>();
        myDQ.add(12);

        //from front
        myDQ.push(20);

        myDQ.addLast(30);
        System.out.println(myDQ);

        //front
        System.out.println(myDQ.pop());

        System.out.println(myDQ);
    }
}

 */

//Code 5 : Better to use addLast, removeLast

/*public class CollectionTest {
    public static void main(String[] args) {
        ArrayDeque<Integer> myDQ = new ArrayDeque<>();
        myDQ.add(12);



        myDQ.addLast(30);
        myDQ.addLast(40);
        myDQ.addLast(50);//add last se ho raha

        System.out.println(myDQ);

        System.out.println(myDQ.removeLast());

        System.out.println(myDQ);

        System.out.println(myDQ.removeFirst());

        System.out.println(myDQ);

        myDQ.addFirst(1000);// add first se ho raha ha
//        myDQ.add(1000);




        System.out.println(myDQ);
    }
}

 */

//Code 5 : To add at particular index used ArrayList

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(23);
        myList.add(23);
        myList.add(23);
        myList.add(23);

        myList.remove(0);

        myList.add(2,100);

        System.out.println(myList);

        for(int i=0; i< myList.size(); i++)
            System.out.println(myList.get(i));

    }
}