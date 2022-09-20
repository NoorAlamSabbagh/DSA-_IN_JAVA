package Stack;

/*class StackUsingLinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    void push(int data){
        Node newNode = new Node(data);
    }

}
public class StackUsingLinkedListTest {
    public static void main(String[] args) {

    }
}

 */


class StackUsingLinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    //head / Top
    private Node top;

    public boolean isEmpty(){
//        if(top == null)
//            return true;
//        else
//            return false;
        return top == null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Error: Stack is Empty!!!");
            return -1;
        }
        int data = top.data;// store that pop data
        top = top.next;
        return data;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Error: Stack is Empty!!!");
            return -1;
        }

        return top.data;
    }

    public void print(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class StackUsingLinkedListTest {
    public static void main(String[] args) {
        StackUsingLinkedList myStack = new StackUsingLinkedList();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        myStack.print();
//        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        myStack.print();
    }
}

