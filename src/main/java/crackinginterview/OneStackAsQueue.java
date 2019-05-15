package java.crackinginterview;

import java.util.Stack;

public class OneStackAsQueue<E> {

    private Stack<E> stack = new Stack<>();

    public OneStackAsQueue() {
    }

    public void add(E x) {
        stack.push(x);
    }

    public E remove() {
        E popped = stack.pop();
        E top = popped;
        if(!stack.isEmpty())
            top = remove();
        else
            return top;
        stack.push(popped);
        return top;
    }

    public E peek() {
        return stack.peek();
    }
}
