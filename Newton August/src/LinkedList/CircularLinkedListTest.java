package LinkedList;


//Copy LinkedList code amd modify for CircularLL
class CircularLinkedList {

    class Node {
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
            head.next = head;//M
        } else {
            Node temp = head;

            //Reach Last Node
            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }

    public int popLast() {

        //For empty LL
        if (head == null) {
            System.out.println("Error: List is Empty!!!");
            return -1;
        }

        //For single element
        if (head.next == head) {
            int data = head.data;
            head = null;
            return data;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr.next != head) {
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = null;
        return curr.data;
    }

    public void pushBegin(int data) {
        Node newNode = new Node(data);

        //Condition for empty LL
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;

            //Reach Last Node
            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;

            head = newNode;
        }
    }

    public int popBegin() {
        //For empty LL
        if (head == null) {
            System.out.println("Error: List is Empty!!!");
            return -1;
        }

        //For single element
        if (head.next == head) {
            int data = head.data;
            head = null;
            return data;
        }
        Node prev = head;
        Node curr = head.next;

        while (curr.next != head) {
            prev = prev.next;
            curr = curr.next;
        }

        curr.next = head.next;
        int data = head.data;
        head = head.next;
        return data;
    }

    public void printLL() {
        Node temp = head;

        //Traversing even the last node
         do{
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }while (temp != head);

        System.out.print("null\n");
    }
}

public class CircularLinkedListTest{
    public static void main(String[] args) {
    CircularLinkedList ll = new CircularLinkedList();
    ll.pushLast(10);
    ll.pushLast(20);
    ll.pushLast(30);
    ll.pushLast(40);

    ll.printLL();

        System.out.println(ll.popBegin());
//        ll.pushBegin(200);
//        ll.pushBegin(300);

        ll.printLL();
    }
}
