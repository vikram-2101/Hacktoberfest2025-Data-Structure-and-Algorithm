ubjhpackage Stack;

public class StackMain {

    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);

        stack.push(3);
        stack.push(34);
        stack.push(75);
        stack.push(24);
        stack.push(6);
        
    System.out.println(stack.pop());

    }
}
