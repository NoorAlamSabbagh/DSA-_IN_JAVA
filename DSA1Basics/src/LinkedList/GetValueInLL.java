package LinkedList;

public class GetValueInLL {
    public static class Node {
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


        void addFirst(int val) {
            //Write your code here
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }
            size++;
        }

        void addAt(int idx, int val) {
            //Write your code here
            if (idx < 0 || idx > size) {
                System.out.println("Invalid Arguments");
            } else if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node node = new Node();
                node.data = val;

                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                //main line of code
                node.next = temp.next;
                temp.next = node;
                size++;
            }

        }

        private Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void reverseDI() {
            int li = 0;
            int ri = size - 1;

            while (li < ri) {
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
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

        public void popFirst() {
            if (size == 0) {
                System.out.println("List is Empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }


        public void popLast() {
            if (size == 0) {
                System.out.println("List is Empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for(int i=0; i<size-2; i++){
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
                size--;
            }
        }
        public int getFirst() {
            if (size == 0) {
                System.out.println("List is Empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is Empty");
                return -1;
            } else {
                return tail.data;
            }

        }

        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is Empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid Argument");
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
          return -1;
        }
    }



    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addLast(20);
        myLinkedList.addLast(50);
        myLinkedList.addLast(2);
        myLinkedList.addLast(40);

        myLinkedList.getFirst();

        myLinkedList.display();
        myLinkedList.getLast();

        myLinkedList.display();
        myLinkedList.getAt(2);

        myLinkedList.display();

        myLinkedList.popFirst();
        myLinkedList.display();

    }
}

