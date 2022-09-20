//Code 1
package LinkedList;
class Node{
    int data;
    Node next;
        }

        class LinkedList{
    Node head;

    void push(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if(head == null){
            head = newNode;
        }
    }
        }

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();

    }
}
/*class Node{
    int data;
    Node next;
}

class LinkedList{
    Node head;

    void push(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        //Condition for empty LL
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;

            //Reach Last Node
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    void printLL(){
        Node temp = head;
        //Traversing even the last node
        //temp.next wil not print last element
//        while(temp.next != null) {
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
//        System.out.println(temp.data); 2nd method to print last element
//          System.out.print(data);
          System.out.print("null\n");
    }
}


*/



//code 2
/*package LinkedList;

class Node{
    int data;
    Node next;
}

class LinkedList{
    Node head;

    void pushLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
//        newNode.next = null;

        //Condition for empty LL
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            //Reach Last Node
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }
    int popLast(){

        //for empty LL
        if(head == null){
            System.out.println("List is Empty!!");
            return -1;
        }
        //for single element
        if(head.next == null){
            int data = head.data;
            head = null;
            return data;
        }
        Node prev = head;//1, 2, 3, 4, 5,
        Node curr = head.next;//2, 3, 4, 5,

        while(curr.next != null){
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = null;
        return curr.data;
    }

    void printLL(){
        Node temp = head;
        //Traversing even the last node
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
//        System.out.println(temp.data); 2nd method to print last element
        System.out.print("null\n");
    }
}

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.pushLast(20);
        myLinkedList.pushLast(50);
        myLinkedList.pushLast(2);
        myLinkedList.pushLast(40);

        myLinkedList.printLL();

        System.out.println("Deleted element is " + myLinkedList.popLast());

        myLinkedList.printLL();
    }
}

 */


//18Aug  L39 --> Single LinkedList
//code 1:
/*package LinkedList;

class Node{
    int data;
    Node next;

     Node(int data) {
        this.data = data;
    }
}

class LinkedList{
    private Node head;

    public void pushLast(int data) {
        Node newNode = new Node(data);

        //Condition for empty LL
        if (head == null) {
            head = newNode;
        }
        else {
            Node temp = head;

            //Reach Last Node
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }
    public  int popLast(){

        //for empty LL
        if(head == null){
            System.out.println("List is Empty!!");
            return -1;
        }
        //for single element
        if(head.next == null){
            int data = head.data;
            head = null;
            return data;
        }
        Node prev = head;
        Node curr = head.next;

        while(curr.next != null){
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = null;
        return curr.data;
    }

    public void printLL(){
        Node temp = head;
        //Traversing even the last node
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
//        System.out.println(temp.data); 2nd method to print last element
        System.out.print("null\n");
    }


   public void pushBegin(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    }

    public int popBegin() {
        //for empty LL
        if (head == null) {
            System.out.println("List is Empty!!");
            return -1;
        }

        int data = head.data;
        head = head.next;
        return data;
    }
}

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
//        myLinkedList.pushLast(20);
//        myLinkedList.pushLast(50);
//        myLinkedList.pushLast(2);
//        myLinkedList.pushLast(40);
        myLinkedList.pushBegin(10);
        myLinkedList.pushBegin(40);
        myLinkedList.pushBegin(26);

        myLinkedList.pushLast(50);

        System.out.println(myLinkedList.popBegin());
        myLinkedList.printLL();

    }
}
 */

//code 2
/*package LinkedList;

class LinkedList{
    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    Node head;

    public void pushLast(int data) {
        Node newNode = new Node(data);

        //Condition for empty LL
        if (head == null) {
            head = newNode;
        }
        else {
            Node temp = head;

            //Reach Last Node
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    public  int popLast(){

        //for empty LL
        if(head == null){
            System.out.println("List is Empty!!");
            return -1;
        }
        //for single element
        if(head.next == null){
            int data = head.data;
            head = null;
            return data;
        }
        Node prev = head;
        Node curr = head.next;

        while(curr.next != null){
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = null;
        return curr.data;
    }

    public Node pushBegin(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public int popBegin() {
        //for empty LL
        if (head == null) {
            System.out.println("List is Empty!!");
            return -1;
        }

        int data = head.data;
        head = head.next;
        return data;
    }

    public void printLL(){
        Node temp = head;
        //Traversing even the last node
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
//        System.out.println(temp.data); 2nd method to print last element
        System.out.print("null\n");
    }
}

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();

//        myLinkedList.pushLast(20);
//        myLinkedList.pushLast(50);
//        myLinkedList.pushLast(2);
//        myLinkedList.pushLast(40);
        myLinkedList.head =  myLinkedList.pushBegin(10);
        myLinkedList.head = myLinkedList.pushBegin(40);
        myLinkedList.head = myLinkedList.pushBegin(26);

        myLinkedList.pushLast(50);

        System.out.println(myLinkedList.popBegin());
        myLinkedList.printLL();

    }
}
 */

//ass problem
/*package LinkedList;


class LinkedList{

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    Node head;

    public void pushLast(int data){
        Node newNode = new Node(data);

        //Condition for empty LL
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;

            //Reach Last Node
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    public int popLast(){

        //For empty LL
        if(head == null){
            System.out.println("Error: List is Empty!!!");
            return -1;
        }

        //For single element
        if(head.next == null){
            int data = head.data;
            head = null;
            return data;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr.next!=null){
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = null;
        return curr.data;
    }

    public void pushBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int popBegin(){
        //For empty LL
        if(head == null){
            System.out.println("Error: List is Empty!!!");
            return -1;
        }

        int data = head.data;
        head = head.next;
        return data;
    }

    public void moveZeroes()
    {
        Node p = head;
        Node c = head.next;
        int count = 0;

        //Delete Zeroes
        while(c != null){
            if(c.data == 0){
                p.next = c.next;
                c = c.next;
                count++;
                continue;
            }
            c = c.next;
            p = p.next;
        }


        //Insert zeroes at beginning
        for(int i=0; i<count; i++){
            Node newNode = new Node(0);
            newNode.next = head;
            head = newNode;
        }
    }


    public void printLL(){
        Node temp = head;
        //Traversing even the last node
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.print("null\n");
    }
}


public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();

        myLinkedList.pushLast(0);
        myLinkedList.pushLast(4);
        myLinkedList.pushLast(0);
        myLinkedList.pushLast(5);
        myLinkedList.pushLast(0);
        myLinkedList.pushLast(2);
        myLinkedList.pushLast(1);
        myLinkedList.pushLast(0);
        myLinkedList.pushLast(1);
        myLinkedList.pushLast(0);

        myLinkedList.printLL();

        myLinkedList.moveZeroes();
        myLinkedList.printLL();

    }
}
 */

//Reversed the LinkedList

/*package LinkedList;


class LinkedList{

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    Node head;

    public void pushLast(int data){
        Node newNode = new Node(data);

        //Condition for empty LL
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;

            //Reach Last Node
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    public int popLast(){

        //For empty LL
        if(head == null){
            System.out.println("Error: List is Empty!!!");
            return -1;
        }

        //For single element
        if(head.next == null){
            int data = head.data;
            head = null;
            return data;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr.next!=null){
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = null;
        return curr.data;
    }

    public void pushBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int popBegin(){
        //For empty LL
        if(head == null){
            System.out.println("Error: List is Empty!!!");
            return -1;
        }

        int data = head.data;
        head = head.next;
        return data;
    }

    public void moveZeroes()
    {
        Node p = head;
        Node c = head.next;
        int count = 0;

        //Delete Zeroes
        while(c != null){
            if(c.data == 0){
                p.next = c.next;
                c = c.next;
                count++;
                continue;
            }
            c = c.next;
            p = p.next;
        }


        //Insert zeroes at beginning
        for(int i=0; i<count; i++){
            Node newNode = new Node(0);
            newNode.next = head;
            head = newNode;
        }
    }

    void reverseLL(){
        if(head == null){
            System.out.println("Error: List is Empty");
            return;
        }

        Node pre = head;
        Node curr = head.next;
        Node pos = null;
        if(head.next != null){
            pos = head.next.next;
        }
        while(curr != null){
            curr.next = pre;
            pre = curr;
            curr = pos;
            if(pos != null)
            pos = pos.next;
        }
        head.next = null;
        head = pre;
    }

    public void printLL(){
        Node temp = head;

        //Traversing even the last node
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.print("null\n");
    }
}


public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();

        myLinkedList.pushLast(20);
//        myLinkedList.pushLast(40);
//        myLinkedList.pushLast(50);
//        myLinkedList.pushLast(75);
//        myLinkedList.pushLast(100);

        myLinkedList.printLL();
        myLinkedList.reverseLL();
        myLinkedList.printLL();


    }
}

 */