package Stack;
import java.util.*;
/*
static class arrayList {
    static arrayList<Integer> list = new arrayList<>();
    public static boolean isEmpty() {
        return list.size() == 0;
    }

    //Push
    public static void push(int data) {
        list.add(data);
    }

    //Pop
    public static void pop() {
        if(isEmpty()) {
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;

    }

    //Peek
    public static int peek() {
        if(isEmpty()) {
            return -1;
        }
        return list.get(list.size()-1);
    }

}

public static void main(String[] args) {
        LinkedList.Stack s = new LinkedList.Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}

 */

//Code 2
import java.util.ArrayList;

public class arrayList {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data) {
            list.add(data);
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.remove(list.size()-1);
            return top;
        }

        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}