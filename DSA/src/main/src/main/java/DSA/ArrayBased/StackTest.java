package DSA.ArrayBased;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new Stack<>();
    }

    @AfterEach
    void tearDown() {
        stack = null;
    }

    @Test
    void push() {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(3, stack.size(), "Stack size should be 3 after 3 pushes.");
        assertEquals(30, stack.peek(), "Top of the stack should be the last pushed element.");
    }

    @Test
    void pop() {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop(), "Pop should return the last pushed element.");
        assertEquals(20, stack.pop(), "Pop should return the second last pushed element.");
        assertEquals(10, stack.pop(), "Pop should return the first pushed element.");

        assertTrue(stack.isEmpty(), "Stack should be empty after all elements are popped.");
        assertThrows(IllegalCallerException.class, stack::pop, "Popping from an empty stack should throw an exception.");
    }

    @Test
    void peek() {
        assertThrows(IllegalCallerException.class, stack::peek, "Peeking into an empty stack should throw an exception.");

        stack.push(10);
        assertEquals(10, stack.peek(), "Peek should return the top element without removing it.");

        stack.push(20);
        assertEquals(20, stack.peek(), "Peek should return the updated top element.");

        stack.pop();
        assertEquals(10, stack.peek(), "Peek should return the previous element after popping the top.");
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty(), "New stack should be empty.");

        stack.push(10);
        assertFalse(stack.isEmpty(), "Stack should not be empty after pushing an element.");

        stack.pop();
        assertTrue(stack.isEmpty(), "Stack should be empty after popping the only element.");
    }

    @Test
    void testClone() throws CloneNotSupportedException {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        Stack<Integer> clonedStack = (Stack<Integer>) stack.clone();

        assertEquals(stack.size(), clonedStack.size(), "Cloned stack should have the same size as the original.");
        assertEquals(stack.peek(), clonedStack.peek(), "Top elements of the original and cloned stack should be the same.");

        clonedStack.pop();
        assertNotEquals(stack.size(), clonedStack.size(), "Modifying the cloned stack should not affect the original stack.");
    }

    @Test
    void testToString() {
        assertEquals("[]", stack.toString(), "String representation of an empty stack should be [].");

        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals("[10, 20, 30]", stack.toString(), "String representation should match the order of pushed elements.");
    }
}
