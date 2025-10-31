package Que.Queue_Question;

import java.util.Stack;
// this is insert efficient
public class QueueUsingStack {
    public static void main(String[] args) {
        
    }
}

class QueueUsingStack1 {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack1() {
        first = new Stack<Integer>();
        second = new Stack<Integer>();
    }

    public void insert(int item) {
        first.push(item);
    }

    public int remove() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int remove = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return remove;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

    public boolean peek() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peek();
    }
}