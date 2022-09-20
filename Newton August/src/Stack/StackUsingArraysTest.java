package Stack;

/*class StackUsingArrays{
    private int top = -1;
    private int max = 10;
    private int stack[] = new int[max];

    boolean isEmpty(){
        return top <= -1;
    }


    void push(int data){
        top++;
        stack[top] = data;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Error: Stack is Empty!!!");
            return -1;
        }
        int data = stack[top];// store that pop data
        top--;
        return data;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Error: Stack is Empty!!!");
            return -1;
        }

        return stack[top];
    }

    void print(){
        int temp = top;
        while(temp != -1){
            System.out.print(stack[temp] + " -->");
            temp--;
        }
        System.out.println("null");
    }
}

public class StackUsingArraysTest {
    public static void main(String[] args) {
        StackUsingArrays myStack = new StackUsingArrays();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        myStack.print();
        System.out.println(myStack.pop());
        myStack.print();
    }
}

 */


//Code2

class StackUsingArrays{
    private int top = -1;
    private int max = 5;
    private int stack[] = new int[max];

    boolean isEmpty(){
        return top <= -1;
    }

    boolean isFull(){
        return top >= max-1;
    }

    void push(int data){
        if(isFull()){
            System.out.println("Error: Stack is Full!!!");
        }
        top++;
        stack[top] = data;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Error: Stack is Empty!!!");
            return -1;
        }
        int data = stack[top];// store that pop data
        top--;
        return data;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Error: Stack is Empty!!!");
            return -1;
        }

        return stack[top];
    }

    void print(){
        int temp = top;
        while(temp != -1){
            System.out.print(stack[temp] + " -->");
            temp--;
        }
        System.out.println("null");
    }
}

public class StackUsingArraysTest {
    public static void main(String[] args) {
        StackUsingArrays myStack = new StackUsingArrays();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);


        System.out.println(myStack.pop());

        myStack.push(100);
        myStack.print();
//        myStack.print();
    }
}
