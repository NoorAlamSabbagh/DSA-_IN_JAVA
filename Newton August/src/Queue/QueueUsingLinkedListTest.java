package Queue;

class QueueUsingLinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    Node front, rear;

    boolean isEmpty(){
        return front == null || rear == null;
    }

    void enQueue(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            rear = newNode;
            front = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    int deQueue(){
        if(isEmpty()){
            System.out.println("Error: Queue is Empty!!!");
            return -1;
        }
        int data = front.data;
        front = front.next;

        if(front == null)
            rear = null;
        return data;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Error: Queue is Empty!!!");
            return -1;
        }
        return front.data;
    }

    public void print(){
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class QueueUsingLinkedListTest {
    public static void main(String[] args) {
        QueueUsingLinkedList myQueue = new QueueUsingLinkedList();
        myQueue.enQueue(10);
        myQueue.enQueue(20);
        myQueue.enQueue(30);
        myQueue.enQueue(40);

        myQueue.print();
        System.out.println(myQueue.deQueue());
        myQueue.print();

    }
}


