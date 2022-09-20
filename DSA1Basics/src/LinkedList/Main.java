package LinkedList;

/*public class Main {
    public static class Node{
        //Node class 2 prop
        int data;
        Node next;
    }

    public static class LinkedList{
        //three data member
        Node head;
        Node tail;
        int size;
    }
    public static void main(String[] args) {

    }
}

 */


//Code 2
/*public class Main {
    public static class Node{
        //Node class 2 prop
        int data;
        Node next;
    }

    public static class LinkedList{
        //three data member
        Node head;
        Node tail;
        int size;

        void addLast (int val){
            //Write your code here
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0) {
                head = tail = temp;
            } else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }
    public static void main(String[] args) {

    }
}
 */

//Code 3
public class Main {
    public static class Node{
        //Node class 2 prop
        int data;
        Node next;
    }

    public static class LinkedList {
        //three data member
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            //Write your code here
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println("null\n");
        }

        public void popFirst(){
            if(size == 0){
                System.out.println("List is Empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            }
            else{
                head = head.next;
                size--;
            }
        }
    }


            public static void main(String[] args) {
                LinkedList myLinkedList = new LinkedList();
                myLinkedList.addLast(20);
                myLinkedList.addLast(50);
                myLinkedList.addLast(2);
                myLinkedList.addLast(40);

                myLinkedList.display();

                myLinkedList.popFirst();
                myLinkedList.display();

            }
        }

