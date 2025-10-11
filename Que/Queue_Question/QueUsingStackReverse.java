package Que.Queue_Question;
// this is remove efficient
import java.util.Stack;
public class QueUsingStackReverse {
    public static void main(String[] args) {
        
    }
}

class QueueUsingStackReverse {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackReverse() {
        first = new Stack<Integer>();
        second = new Stack<Integer>();
    }

    public void add(int item) {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(item);

        while(!second.isEmpty()) {
            first.push(second.pop());
    }
}
    public int remove() throws Exception {
      return first.pop();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

    public int peek() throws Exception {
        return first.peek();
    }
}
