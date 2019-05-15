package dailycoding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Asked by Google
 * --------------------
 * Given a stack of N elements. sol the first half of the stack with the second half reversed using only one other queue. This should
 * be done in-place.
 *
 * Examples
 * --------------------
 * Stack: [1, 2, 3, 4, 5]
 * Answer: [1, 5, 2, 4, 3]
 *
 * Stack: [1, 2, 3, 4]
 * Answer: [1, 4, 2, 3]
 */

/*

    1
    5
    2
    4
    3
    ----
    4
    5
    Q: 1 2 3

    Steps:
    1. Empty stack to queue
    2. Empty first half amount from queue to stack
    3. Empty stack to queue
    4. Empty second half amount from queue to stack
    5. Empty stack to queue
    6. Empty first half amount from queue to stack
    7. Pop + enqueue --> ONLY FOR THE NUMBER OF VALS IS QUEUE BEFORE THIS STARTS (dequeue + push, pop + enqueue)
    8. Empty queue to stack
    9. Empty stack to queue
    10. Empty queue to stack
*/



class InterleavedStackQueue {

    Stack<Integer> sol(Stack<Integer> stack){
        int firstHalfAmount = stack.size() / 2 + (stack.size() % 2 == 1 ? 1 : 0);
        int secondHalfAmount = stack.size() - firstHalfAmount;
        Queue<Integer> queue = new LinkedList<>();

        emptyStackToQueue(stack, queue);
        emptyQueueToStack(stack, queue, firstHalfAmount);
        emptyStackToQueue(stack, queue);
        emptyQueueToStack(stack, queue, secondHalfAmount);
        emptyStackToQueue(stack, queue);
        emptyQueueToStack(stack, queue, firstHalfAmount);
        interleave(stack, queue, secondHalfAmount);
        emptyQueueToStack(stack, queue, queue.size());
        emptyStackToQueue(stack, queue);
        emptyQueueToStack(stack, queue, queue.size());

        return stack;
    }

    public void interleave(Stack<Integer> stack, Queue<Integer> queue, int size){
        while(size-- > 0){
            queue.add(stack.pop());
            stack.push(queue.poll());
            queue.add(stack.pop());
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }

    public void emptyQueueToStack(Stack<Integer> stack, Queue<Integer> queue, int amount){
        while(amount-- > 0){
            stack.push(queue.poll());
        }
    }

    public void emptyStackToQueue(Stack<Integer> stack, Queue<Integer> queue){
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
