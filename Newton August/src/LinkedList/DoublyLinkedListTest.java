//code 1
/*package LinkedList;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class DoublyLL {

    Node head;
    Node tail;

    void pushLast(int data) {
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    void printDLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class DoublyLinkedListTest {
        public static void main(String[] args) {
            DoublyLL doublyLL = new DoublyLL();
            doublyLL.pushLast(10);
            doublyLL.pushLast(30);
            doublyLL.pushLast(40);
            doublyLL.pushLast(60);

            doublyLL.printDLL();

    }
}

 */



//code 2
/*package LinkedList;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class DoublyLL {

    Node head;
    Node tail;

    void pushLast(int data) {
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    int popLast(){
        int data = tail.data;
        tail = tail.prev;
        if(tail == null)
            head = null;
        else
           tail.next = null;
        return data;
    }
    void printDLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLL doublyLL = new DoublyLL();
        doublyLL.pushLast(10);
        doublyLL.pushLast(30);
        doublyLL.pushLast(40);
        doublyLL.pushLast(60);

        doublyLL.printDLL();
        System.out.println(doublyLL.popLast());
        doublyLL.printDLL();
    }
}

 */



//code 3
/*package main.linkedList;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class DoublyLL{

    Node head;
    Node tail;

    void pushBegin(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }



    void pushLast(int data){
        Node newNode = new Node(data);
        if (head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    int popBegin(){
        if(head == null && tail == null){
            System.out.println("Error: List is Empty!!!");
            return -1;
        }
        int data = head.data;
        head = head.next;
        if(head==null)
            tail = null;
        else
            head.prev = null;
        return data;
    }

    int popLast(){
        if(head == null && tail == null){
            System.out.println("Error: List is Empty!!!");
            return -1;
        }
        int data = tail.data;
        tail = tail.prev;
        if(tail==null)
            head = null;
        else
            tail.next = null;
        return data;
    }

    void printDLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLL doublyLL = new DoublyLL();
//        doublyLL.pushLast(10);
//        doublyLL.pushLast(30);
//        doublyLL.pushLast(40);
//        doublyLL.pushLast(60);
//
//        doublyLL.pushBegin(50);
//        doublyLL.pushBegin(34);
//        doublyLL.pushBegin(23);

        doublyLL.printDLL();
        System.out.println(doublyLL.popBegin());
        doublyLL.printDLL();
    }
}

 */


