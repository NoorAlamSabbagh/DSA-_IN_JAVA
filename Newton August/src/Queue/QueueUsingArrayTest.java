package Queue;

class QueueUsingArrays{
    private int rear = -1;
    private int front = -1;
    private int max = 5;
    private int queue[] = new int[max];

    boolean isEmpty(){
        return rear == front;
    }

    void enQueue(int data){

        if(rear == max){
            System.out.println("Error: Memory Overflow!!!");
            return;
        }

        if(rear == -1 || front == -1){
            rear = 0;
            front = 0;
        }

        queue[rear] = data;
        rear++;
    }

    int deQueue(){
        if(isEmpty()){
            System.out.println("Error: Queue is Empty!!!");
            return -1;
        }

        int data = queue[front];
        front++;
        return data;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Error: Queue is Empty!!!");
            return -1;
        }

        return queue[front];
    }

    void print(){
        int temp = front;
        while(temp != rear){
            System.out.print(queue[temp] + " --> ");
            temp++;
        }
        System.out.println("null");
    }
}

public class QueueUsingArrayTest {
    public static void main(String[] args) {
        QueueUsingArrays myQueue = new QueueUsingArrays();
        myQueue.enQueue(10);
        myQueue.enQueue(20);
        myQueue.enQueue(30);
        myQueue.enQueue(40);

        myQueue.enQueue(1000);


        myQueue.print();
//        System.out.println(myQueue.peek());
//        myQueue.print();
    }
}