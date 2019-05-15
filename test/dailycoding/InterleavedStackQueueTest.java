package dailycoding;

import org.junit.Test;

import java.util.Stack;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Kevin Tan 2019-05-15
 */

public class InterleavedStackQueueTest {

    @Test
    public void testSoltuion(){
        InterleavedStackQueue sol = new InterleavedStackQueue();
        String expected = " 1 5 2 4 3";
        String expected2 = " 1 4 2 3";

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack = sol.sol(stack);
        String actual = "";
        while(!stack.isEmpty()){
            actual += " " + stack.pop();
        }

        assertEquals(expected, actual);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(4);
        stack2.push(3);
        stack2.push(2);
        stack2.push(1);
        stack2 = sol.sol(stack2);
        String actual2 = "";
        while(!stack2.isEmpty()){
            actual2 += " " + stack2.pop();
        }
        assertEquals(expected2, actual2);
    }
}
